package ch02_control_statement;

public class Forswitch01 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;

        for (int i = 1; i < 11; i++) {
            switch (i%2) { // 관계연산자 불가능, 정수형 및 문자형만 가능.
                case 0 :
                    even += i;
                    break;
                case 1 :
                    odd += i;
                    break;
            }
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
