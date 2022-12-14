public class Main {
    public static void main(String[] args) {
        //task 1
        int clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("вы ввели некорректное значение");
        }
        System.out.println("\n");

        //task 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS != 0 && clientOS != 1) System.out.println("вы ввели некорректное значение");
        System.out.println("\n");

        //task 3
        int year = 2022;
        boolean year1 = year % 4 == 0;
        boolean year2 = year % 400 == 0;
        boolean year3 = year % 100 != 0;
        if (year1 && year3 || year2) System.out.println(year + " - високосный год");
        else System.out.println(year + " - не високосный год");
        System.out.println("\n");

        //task 4
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) System.out.println("Потребуется дней: " + day);
        else if (deliveryDistance >= 20 && deliveryDistance < 60) System.out.println("Потребуется дней: " + 2 * day);
        else if (deliveryDistance >= 60 && deliveryDistance < 100) System.out.println("Потребуется дней: " + 3 * day);
        System.out.println("\n");

        //task 5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("на улице зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("на улице весна");
            case 6:
            case 7:
            case 8:
                System.out.println("на улице лето");
            case 9:
            case 10:
            case 11:
                System.out.println("на улице весна");
            default:
                System.out.println("вы ввели не правильный номер месяца");
        }
        System.out.println("\n");

        //task 6
        int age = 19;
        int salary = 58000;
        if (age < 23) System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + 2 * salary + " рублей");
        else if (age >= 23) System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + 3 * salary + " рублей");
        if (salary >= 80000) System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + 1.5 * salary + " рублей");
        else if (salary >= 50000) System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + 1.2 * salary + " рублей");
        System.out.println("\n");

        //task 7
        int age1 = 25;
        int salary1 = 60000;
        int wantedSum = 330000;
        float bid = 0.1f;
        int month = 12;
        double maxPay = 0.5 * salary1;
        if (age1 < 23) {
            bid += 0.01;
            if (maxPay > bid * wantedSum) System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + bid * wantedSum + " рублей. Одобрено.");
            else System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + bid * wantedSum + " рублей. Отказано.");
        }
        else if (age1 < 30 && age1 >= 23) {
            bid += 0.005;
            if (maxPay > bid * wantedSum) System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + bid * wantedSum + " рублей. Одобрено.");
            else System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + bid * wantedSum + " рублей. Отказано.");
        }
        if (salary1 >= 80000) {
            bid -= 0.007;
            if (maxPay > bid * wantedSum) System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + bid * wantedSum + " рублей. Одобрено.");
            else System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPay + " рублей. Платеж по кредиту " + bid * wantedSum + " рублей. Отказано.");
        }
    }
}