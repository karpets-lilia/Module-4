package test1;

public class Test1 {
    public static int a = 1;
    public static int b = 2;

    public static void show(int a, int b) {
        System.out.println(a + " " + b);
    }

    public static void changeNumber(int a, int b) {
        a = 5;
        b = 7;
        System.out.println(a + " " + b);
    }

    public static int sumNumber(int a, int b) {

        return a + b;
    }

    public static int whatIsMore(int a, int b) {

        return Math.max(a, b);
    }
}
