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

}


    }
}