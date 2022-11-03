package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tracker tracker = (Tracker) o;
        return ids == tracker.ids && size == tracker.size
                && Arrays.equals(items, tracker.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ids, size);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name != null) {
                rsl[counter] = name;
                counter++;
            }
        }
        rsl = Arrays.copyOf(rsl, counter);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name.getName().equals(key)) {
                rsl[counter] = name;
                counter++;
            }
        }
        rsl = Arrays.copyOf(rsl, counter);
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        items[size - 1] = null;
        size--;
        return true;
    }
}
