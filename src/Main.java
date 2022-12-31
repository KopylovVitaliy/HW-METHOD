public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int checkingYear(int yearCheck) {
        if (yearCheck % 4 == 0 && yearCheck % 100 != 0 || yearCheck % 400 == 0) {
            System.out.println(yearCheck + " год - високосный год");
        } else {
            System.out.println(yearCheck + " год - невисокосный год");
        }
        return yearCheck;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2022;
        int result = checkingYear(year);

    }

    public static int applicationSelection(int clientOS, int currentYear) {

        if (clientOS == 0) {
            if (currentYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (currentYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Введите корректные данные для продолжения");
        }
        return clientOS;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int currentYear = 2022;
        int result = applicationSelection(clientOS, currentYear);

    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDay++;
            System.out.println("Потербуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не осуществляется.");
        }
        return deliveryDistance;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int result = deliveryTime(deliveryDistance);
    }
}
