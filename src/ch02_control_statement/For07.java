package ch02_control_statement;

public class For07 {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) { //분모가 짝수면 뺄셈
                total -= 1.0/i;
            } else { // 분모가 홀수면 덧셈
                total += 1.0/i;
            }
        }
        System.out.println(total);
    }
}
