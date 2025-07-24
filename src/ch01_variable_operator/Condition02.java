package ch01_variable_operator;

public class Condition02 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int result = a>=b ? 5 : a + 2;

        int x = 5;
        result = x % 2 == 0 ? x + 3 : x * x;
        System.out.println("x = " + x);
    }
}
