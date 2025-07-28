package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {
        int n = 2; // 임의의 정수
        for (int i = 1; i < n+1; i++) {
            int p = i*i;
            String message = i + "의 제곱은 " + p + "입니다.";
            System.out.println( message);
        }

        int su01 = 3;
        int su02 = 7;
        int sum = 0;
        for (int i = su01; i < su02+1 ; i++) {
            sum += i;
        }
        String msg = su01 + "부터 " + su02 + "의 합은 " + sum +"입니다.";
        System.out.println(msg);
    }
}
