package ch02_control_statement;

public class SumOneToN {
    public static void main(String[] args) {
        int su = 5; // 계산할 정수
        int sum = 0; // 계산한 값을 담을 변수
        for (int i = 1; i < su + 1; i++){ //su에 도달할때까지
            sum += i; // sum = sum + i
        }
        System.out.println("1부터 " + su + "까지의 합은 " + sum + "입니다.");
    }
}
