package ch02_control_statement;

public class SumTest03 {
    public static void main(String[] args) {
        int a = 0, // 3으로 나눴을 때 나머지가 1인 수의 총합
            b = 0, // 3으로 나눴을 때 1이 아닌 항목 중 6 이상의 수의 총합
            c = 0; // 3으로 나눴을 때 1이 아닌 항목 중 6 미만의 수의 총합

        for (int i = 1; i < 11; i++) {
            if (i % 3 == 1) {
                a += i;
            } else if ((i % 3)!=1 && i >= 6) {
                b += i;
            } else if (((i % 3) != 0) && i < 6) {
                c += i;
            }
        }
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}
