package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Иван Петров");
        student1.setGroup("Java");
        student1.setDateAdd("02.11.2022");
        System.out.println("Студент : " + student1.getFullName() + ", в группе : " + student1.getGroup()
                + ", поступил на учебу : " + student1.getDateAdd() + ".");
    }
}
