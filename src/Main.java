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
        int speedMovements = 80;
        if (speedMovements >= 60) {
            System.out.println("Скорость привышает 60 км/ч придется заплатить штраф");
        } else {
            System.out.println("Скорость не привышает 60 км/ч можно ездить спокойно");
        }

        System.out.println();
        System.out.println("Задание-4");

        int agePerson = 65;
        boolean child = agePerson >= 2 && agePerson <= 6;
        if (child) {
            System.out.println("Нужно ходить в детский сад");
        }
        boolean teenager = agePerson >= 7 && agePerson <= 17;
        if (teenager) {
            System.out.println("Нужно ходить в школу");
        }

        boolean youngMan = agePerson >= 18 && agePerson <= 24;
        if (youngMan) {
            System.out.println("Нужно ходить в университет");
        }
        boolean adult = agePerson >= 25 && agePerson <= 64;
        if (adult) {
            System.out.println("Нужно ходить на работу");
        }
        boolean old = agePerson >= 65;
        if (old) {
            System.out.println(" Ты молодец: хорошо учился, усердно работал, а теперь долгожданный отдых, пенсия!!");
        }
    }
}
