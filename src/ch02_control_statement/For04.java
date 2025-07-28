package ch02_control_statement;

public class For04 {
    public static void main(String[] args) {
        int sum0 = 0; // 3의 배수 총합을 구하기
        int sum01 = 0; // 3으로 나눴을 때 나머지가 1인 수의 총합 구하기
        int sum02 = 0; // 3으로 나눴을 때 나머지가 2인 수의 총합 구하기
        int su = 10;

        for (int i = 1; i < su+1 ; i++) {

            switch (i % 3){
                case 0 :
                    sum0 += i;
                    break;

                case 1:
                    sum01 += i;
                    break;

                case 2:
                    sum02 += i;
                    break;
            }
        }
        String msg0 = "3의 배수의 총합은 " + sum0 + "입니다.";
        String msg1 = "3으로 나눴을때 나머지가 1인 수의 총합은 " + sum01 + "입니다.";
        String msg2 = "3으로 나눴을때 나머지가 2인 수의 총합은 " + sum02 + "입니다.";
        System.out.println(msg0);
        System.out.println(msg1);
        System.out.println(msg2);
    }
}
