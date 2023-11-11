public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        System.out.println("Task 3");
        for (int c = 0; c <= 17; c = 2 + c) {
            System.out.println(c);
        }

        System.out.println("Task 4");
        for (int b = 10; b >= -10; b--) {
            System.out.println(b);
        }

        System.out.println("Task 5");
        for (int n = 1904; n <= 2096; n = n + 4) {
            System.out.println(n + " год является високосным");
        }

        System.out.println("Task 6");
        for (int y = 7; y <= 98; y = y + 7) {
            System.out.println(y);
        }

        System.out.println("Task 7");
        for (int p = 1; p <= 512; p = p * 2) {
            System.out.println(p);
        }

        System.out.println("Task 8");
        int salary = 29000;
        int total = 0;
        for (int v = 1; v <= 12; v++) {
            total = total + salary;
            System.out.println("Месяц " + v + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Task 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int v = 1; v <= 12; v++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + v + ", сумма накоплений равна " + total1 + " рублей.");
        }

        System.out.println("Task 10");
        for (int f = 1; f <= 10; f++) {
            System.out.println("2 * " + f + " = " + 2 * f);
        }
    }
}