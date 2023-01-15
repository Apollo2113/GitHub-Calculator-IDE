package app;

public class Main {

    static int a;
    static int b;
    static int c;
    static int d;
    static int e;
    static int f;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        variables();
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static void variables() {
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);
        e = subtraction(a, b);
        System.out.println(e);
        f = division(a, b);
        System.out.println(f);
    }
}
