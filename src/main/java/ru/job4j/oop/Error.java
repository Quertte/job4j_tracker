package ru.job4j.oop;

public class Error {
    private boolean activate;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean activate, int status, String message) {
        this.activate = activate;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна ошибка: " + activate);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Текст ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 678, "Удаленный компьютер не отвечает");
        Error error2 = new Error(false, 404, "Страница не найдена");
        Error error3 = new Error(true, 403, "Доступ запрещен");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
