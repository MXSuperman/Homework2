package MXN;

public class Main {

    public static void main(String[] args) {

        // Задание 1

        int ios = 0;
        int android = 1;
        if (ios <= 0) ;
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (android >= 1) ;
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2

        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015 + ios) ;
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientDeviceYear >= 2015 + ios) ;
            System.out.println("Приложение будет работать корректно");
        }
        if (clientDeviceYear <= 2015 + android) ;
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            if (clientDeviceYear >= 2015 + android) ;
            System.out.println("Приложение будет работать корректно");
        }

        // Задание 3
        // Example to determine if a year is a leap year

        int year = 2021;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("the Year " + year + " is a leap");
        } else {
            System.out.println("the Year " + year + " no is a leap");
        }

        //  Задание 4

        int deliveryDistances = 100;
        int deliveryDays = 1;
        if (deliveryDistances <= 20) {
            System.out.println("доставка заӣмет " + deliveryDays);
        } else if (deliveryDistances > 20 && deliveryDistances < 60) {
            System.out.println("доставка заӣмет " + deliveryDays + 1);
        } else if (deliveryDistances >= 60 && deliveryDistances <= 100) {
            System.out.println("доставка заӣмет " + (deliveryDays + 2));
        } else {
            System.out.println("на такое расстояние нет доставки ");
        }

        // Задание 5

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Season Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season Autumn");
                break;
            default:
                System.out.println("There is no such month");
        }
    }
}