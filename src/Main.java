public class Main {
    public static void main(String[] args) {
        int year = 2023;
        System.out.println("Задача №1");
        determineWhatYear(year);
        System.out.println("Задача №2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        determineAppVersion(clientDeviceYear, clientOS);
        System.out.println("Задача №3");
        totalNumberOfDeliveryDays(75);
    }
    public static void determineWhatYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год - высокосный год");
        } else {
            System.out.println(year + " год - не высокосный год");

        }
    }
    public static void determineAppVersion(int clientDeviceYear, int clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void totalNumberOfDeliveryDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки: " + deliveryTime + " день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (1 + deliveryTime));
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (2 + deliveryTime) );
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100 км не осуществляется");
        }
    }
}
