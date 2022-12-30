public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Человеку 18 и более лет");
        } else {
            System.out.println("Человек не достиг совершеннолетия");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temp = 5;
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Придётся заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 26;
        if (age >= 2 && age <= 6) {
            System.out.println("Человеку нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Человеку нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Человеку нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Человеку нужно ходить на работу");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 10;
        if (age < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Ребёнок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Ребёнок может кататься без сопровождения взрослого.");
        }


    }

    public static void task6() {
        System.out.println("Задача 6");
        int place = 32;
        if (place <= 59) {
            System.out.println("В вагоне есть хотя бы одно сидячее и стоячие места.");
        } else if (place >= 60 && place < 102) {
            System.out.println("В вагоне есть стоячие места.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }


    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число one");
        }
        if (two > one && two > three) {
            System.out.println("Наибольшее число two");
        } else {
            System.out.println("Наибольшее число three");
        }
    }
}