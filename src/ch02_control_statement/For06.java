package ch02_control_statement;

public class For06 {
    public static void main(String[] args) {
        double d = 0;
        for (int i = 1; i < 101; i++) {
            d += 1.0/i; // 그냥 1로 하면 정수형이라 소숫점이 안나옴.
        }
        System.out.println(d);
    }
}
