package ch02_control_statement;

public class Difference {
    public static void main(String[] args) {
        int sumA = 0; // 3의 배수가 아닌 수의 총합
        int sumB = 0; // 3의 배수인 수의 총합

        for (int i = 1; i < 51; i++) {
            if (i % 3 != 0) { // 3의 배수가 아니면 합산
                sumA += i;
            } else { // 3의 배수면 합산
                sumB += i;
            }
        }

        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println(sumA - sumB);

    }
}
