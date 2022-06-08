public class Main {

    public static void main(String[] args) {
        int yearRelease =2013;

        int clientOS = 0;
        if (clientOS==0 && yearRelease<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS==1 && yearRelease <2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Такой операционной системы не существует");
        }
        /////////task3
        int year = 2020;
        if (year %4==0 && year % 100 != 0 || year %400 ==0)
            System.out.println("Год високосный");
        else
            System.out.println("Год невисокосный");

        //////task4
        int day = 0;
        int distance = 95;
        if (distance <20){
            day = day+1;
            System.out.println("Потребуется дней " + day+ " доставки");
        }
        if (distance >=20 && distance <60){
            day = day +2;
            System.out.println("Потребуется дней " + day+ " доставки");
        }
        if (distance >=60 && distance <100){
            day = day +3;
            System.out.println("Потребуется дней " + day+ " доставки");
        }

        ///// task5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }
}
