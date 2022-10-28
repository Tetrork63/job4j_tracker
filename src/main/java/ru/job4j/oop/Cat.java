package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println("Кот по имени " + this.name + ", и он ел: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        peppy.giveNick("Пеппи");
        peppy.eat("корм");
        peppy.show();
        Cat sparky = new Cat();
        sparky.giveNick("Спарки");
        sparky.eat("рыбу");
        sparky.show();
    }
}
