package ch02_control_statement;

public class For05 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 3 == 0 || i % 5 ==0) {
                total += i;
            }
        }
        String msg = "총합 : " + total;
        System.out.println(msg);
    }
}
