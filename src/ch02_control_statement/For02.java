package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int odd = 0; //홀수
        int even = 0; //짝수

        for (int i = 1; i < 11 ; i++) {
            if (i % 2 == 1){
                odd += i;
            } else {
                even += i;
            }
        }
        String oddMsg = "홀수의 총합은 " + odd + "입니다.";
        String evenMsg = "짝수의 총합은 " + even + "입니다.";
        System.out.println(oddMsg);
        System.out.println(evenMsg);
    }
}
