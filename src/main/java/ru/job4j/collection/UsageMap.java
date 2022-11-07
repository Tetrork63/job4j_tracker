package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("1654466@gmail.com", "Leonid Bannikov");
        for (String mapa : map.keySet()) {
            String value = map.get(mapa);
            System.out.println(mapa + " = " + value);
        }
    }
}
