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

        int homan = 80;
        boolean child = homan >= 2 && homan <= 6;
        if (child) {
            System.out.println("Нужно ходить в детский сад");
        }
        boolean teenager = homan >= 7 && homan <= 17;
        if (teenager) {
            System.out.println("Нужно ходить в школу");
        }

        boolean youngMan = homan >= 18 && homan <= 24;
        if (youngMan) {
            System.out.println("Нужно ходить в университет");
        }
        boolean adult = homan >= 25 && homan <= 60;
        if (adult) {
            System.out.println("Нужно ходить на работу");
        }
        boolean old = homan >= 65;
        if (old) {
            System.out.println(" Ты молодец: хорошо учился, усердно работал, а теперь долгожданный отдых, пенсия!!");
        }
        System.out.println();
        System.out.println("Задание-5");

        int agesChild = 2;
        boolean childNotAllowed = agesChild < 5 ;
        if (childNotAllowed) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        }
        boolean childWithEscort = agesChild >=5 && agesChild < 14;
        if (childWithEscort) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        }

        boolean childAdmittedAlone = agesChild >= 14;
        if (childAdmittedAlone) {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
    }
}
