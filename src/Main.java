public class Main {
    public static void main(String[] args) {
        int year = 2023;
        System.out.println("Задача №1");
        System.out.println(determineWhatYear(year));
        System.out.println("Задача №2");
        int clientDeviceYear = 2021;
        System.out.println(YearOfManufactureCalculations(clientDeviceYear));
        System.out.println("Задача №3");
        System.out.println(totalNumberOfDeliveryDays(100));

    }

    public static int determineWhatYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.print("Высокосный год ");
        } else {
            System.out.print("Не высокосный год ");

        }
        return year;
    }

    public static int YearOfManufactureCalculations(int clientDeviceYear) {
        int clientOS = 1;
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
        System.out.print("Год выпуска вашего телефона ");
        return clientDeviceYear;
    }

    public static int totalNumberOfDeliveryDays(int deliveryDistance) {
        int i = 0;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки: " + deliveryTime + " день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(i + 1 + deliveryTime + " день доставки");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(i + 2 + deliveryTime + " дня доставки");
        } else {
            System.out.println("Доставка свыше 100 км не осуществляется");
        }
        System.out.print("Расстояние до указаного адреса в киллометрах ");
        return deliveryDistance;
    }
}
