public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        int clientOs = 0;
        int clientDeviceYear = 2013;
        if (clientOs == 0) {
            if (clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }   else {
                if (clientDeviceYear > 2014) {
            System.out.println("Установите  версию приложения для Android по ссылке");
                } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        // Задание 3
        int year = 2021;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год явлется обычным");
        } else {
            System.out.println("Год явлется весокосным");
        }
    }
}