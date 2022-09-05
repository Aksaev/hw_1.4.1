public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1");
        task1();
        System.out.println("Домашнее задание - 2");
        task2();
        System.out.println("Домашнее задание - 3");
        task3();
    }

    // Домашнее задание - 1
    public static void task1() {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");

        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");

    }

    // Домашнее задание - 2
    public static void task2() {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1094; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("--------");

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------");
    }

    // Домашнее задание - 3
    public static void task3() {
        // Задание 1
        System.out.println("Задание 1");
        int depositOne= 29_000;
        int totalOne = 0;
        for (int i = 1; i <= 12; i++) {
            totalOne = totalOne + depositOne;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalOne + " рублей");
        }
        System.out.println("--------");

        // Задание 2
        System.out.println("Задание 2");
        int depositTwo = 29_000;
        int totalTwo = 0;
        for (int i = 1; i <= 12; i++) {
            totalTwo = totalTwo + totalTwo / 100;
            totalTwo = totalTwo + depositTwo;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalTwo + " рублей");
        }
        System.out.println("--------");

    }
}