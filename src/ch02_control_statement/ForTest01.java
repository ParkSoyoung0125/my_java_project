package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {
        int dan = 8;    // 계산할 구구단
        int su = 0;     // 계산한 값을 담을 변수

        for (int i = 1; i < 10; i++) {
            su = dan*i; // 계산된 값을 누적하지 않고 반복할때마다 리셋.
            String message = dan + " * " + i + " = " + su;
            System.out.println(message);
        }
    }
}
