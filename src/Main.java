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
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
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
        //Шестое задание
        int age = 19;
        double salary = 58_000;
        double increasingTheLimit12 = 1.2;
        double increasingTheLimit15 = 1.5;
        double increasingCredit2 = salary * 2;
        double increasingCredit3 = salary * 3;
        if (age >= 23 && salary >= 50_000 && salary <= 80_000) {
            System.out.println("Мы готовы вам выдать крелитную карту с лимитом " + increasingCredit3 * increasingTheLimit12 + " рублей");
        }
        if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы вам выдать крелитную карту с лимитом " + increasingCredit3 * increasingTheLimit15 + " рублей");
        }
        if (age <= 23 && salary >= 50_000 && salary <= 80_000) {
            System.out.println("Мы готовы вам выдать крелитную карту с лимитом " + increasingCredit2 * increasingTheLimit12 + " рублей");
        }
        if (age <= 23 && salary >= 80_000) {
            System.out.println("Мы готовы вам выдать крелитную карту с лимитом " + increasingCredit3 * increasingTheLimit12 + " рублей");
        }
        //седьмое задание
        int ageTwo = 25;
        double baseRate = 12;
        int salaryTwo = 60_000;
        int loanTerm = 12;
        int saloryMinLimit = 80_000;
        double monthlyPayment = 0;
        double MaxMonthlyPayment = salaryTwo * 0.5;
        int wantedSum = 330_000;
        if (ageTwo >= 23 && ageTwo < 30) {
            if (salaryTwo > saloryMinLimit) {
                baseRate = baseRate + 0.005 - 0.07;
                monthlyPayment = ((wantedSum + wantedSum * baseRate) + 12);
                if (MaxMonthlyPayment > monthlyPayment) {
                    System.out.println("Максимальный платёж при ЗП " + salaryTwo + " Рублей " + MaxMonthlyPayment + " рублей по кредиту " + monthlyPayment + " рублей одобрено");
                } else
                    System.out.println("Максимальный платёж при ЗП " + salaryTwo + " Рублей " + MaxMonthlyPayment + " рублей по кредиту " + monthlyPayment + " рублей отказано");
            } else
                baseRate = baseRate + 0.005;
            monthlyPayment = ((wantedSum + wantedSum * baseRate) / 12);
            if (MaxMonthlyPayment > monthlyPayment) {
                System.out.println("Максимальный платёж при ЗП " + salaryTwo + " рублей равен " + MaxMonthlyPayment + " рублей. Платёж по кредиту " + monthlyPayment + " рублей. Одобрено");
            } else
                System.out.println("Максимальный платёж при ЗП " + salaryTwo + " рублей равен " + MaxMonthlyPayment + " рублей. Платёж по кредиту " + monthlyPayment + " рублей. Отказано");

        }


    }


    }
