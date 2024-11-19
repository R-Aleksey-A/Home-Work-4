public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work-4");

        System.out.println("Задание-1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Возраст человека = " + age + " он совершеннолетний");
        } else {
            System.out.println("Возраст человека = " + age + " он не достиг совершеннолетия, нужно немного подождать».");
        }

        System.out.println();
        System.out.println("Задание-2");

        int airTemperature = 2;
        if (airTemperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println();
        System.out.println("Задание-3");
        int speedMovements =80;
        if (speedMovements>60) {
            System.out.println("Скорость привышает 60 км/ч придется заплатить штраф");
        } else {
            System.out.println("Скорость не привышает 60 км/ч можно ездить спокойно");
        }


    }
}