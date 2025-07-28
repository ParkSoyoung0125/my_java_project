package ch02_control_statement;

public class ForIf01 {
    public static void main(String[] args) {
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < 11; i++) {
            if((i % 3) == 0) {
                sum0 += i;
            } else if ((i % 3) == 1){
                sum1 += i;
            }
            else {
                sum2 += i;
            }
        }
        System.out.println(sum0);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
