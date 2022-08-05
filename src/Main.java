public class Main {
    public static void main(String[] args) {
        //первое задание
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        //второе задание
        int clientDeviceYear = 2018;
        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("установите облегчённую версию приложения для Android по ссылке");
        }
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("установите облегчённую версию приложения для IOS по ссылке");
        }
        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("установите мобильную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("установите мобильную версию приложения для IOS по ссылке");
        }
        //третье задание
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        //четвёртое задание
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("потребуется дней 1");
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("потребуется дней 2");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("потребуется дней 3");
        }
        //пятое задание
        int month = 7;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }


        }

    }
}