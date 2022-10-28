package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;


    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Статус ошибки: " + active);
        System.out.println("Номер ошибки: " + status + ".");
        System.out.println("Название ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(false, 1, "Ошибка неизвестна");
        Error error2 = new Error(true, 0, "Ошибок нет");
        Error error3 = new Error(false, 3, "Ошибка №113");
        error1.printInfo();
        System.out.println();
        error2.printInfo();
        System.out.println();
        error3.printInfo();

    }
}
