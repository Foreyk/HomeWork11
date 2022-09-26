import java.time.LocalDate;

public class Main {

    public static void checkingLeapYear(int year) {    //Метод для вычесления високосного года.
        int scanYear = year % 4;
        if (scanYear == 0) {
            System.out.println(year + " год является високосным.");
        } else System.out.println(year + " год не является високосным.");
    }

    public static void checkingDevice(byte clientOS, int clientDeviceYear) {    //Метод для проверки девайса

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке.");
        }
    }

    public static void deliveryTime(int deliveryDistance) {
        int fastDeliveryDistance = 20;
        int addDayDistance = 40;
        double trueDeliveryDistance = deliveryDistance - fastDeliveryDistance;
        double timeDelivery = trueDeliveryDistance / addDayDistance;
        System.out.printf("Потребуется дней для доставки: %.0f", Math.ceil(timeDelivery) + 1);
    }
    


    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();





    }


    //Задание 1

    private static void task1() {
        int year = LocalDate.now().getYear();
        checkingLeapYear(year);
    }
    //Задание 2

    private static void task2() {
        byte clientOS = 0;
        int clientDeviceYear = 2016;
        checkingDevice(clientOS, clientDeviceYear);
    }

    //Задание 3
    private static void task3() {
        int deliveryDistance = 101;
        deliveryTime(deliveryDistance);
    }
}