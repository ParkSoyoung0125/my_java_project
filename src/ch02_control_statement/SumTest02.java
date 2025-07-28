package ch02_control_statement;

public class SumTest02 {
    public static void main(String[] args) {
        int num1 = -3;
        int num2 = -8;
        int total = 0;

        if (num1 < 0 || num2 <0) {  //num1이나 num2가 음수면
            num1 = Math.abs(num1);  //num1을 절대값으로 변경
            num2 = Math.abs(num2);  //num2를 절대값으로 변경
            for (int i = num1; i < num2 + 1; i++) { //num1로 시작, num2까지 반복
                if (i % 3 != 0) { // 3의 배수가 아닌 경우에만
                    total += i;    //total에 수를 합산 반복.
                }
            }
        } else { // 음수가 아닌 경우에는
            for (int i = num1; i < num2 + 1; i++) { //같은 동작 반복
                if (i % 3 != 0) {
                    total += i;
                }
            }
        }
        System.out.println(total);
    }
}
