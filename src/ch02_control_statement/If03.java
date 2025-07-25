package ch02_control_statement;

public class If03 {
    public static void main(String[] args) {
        int su = 9 ;
        if (su % 3 == 0) {
            System.out.println(su + "는(은) 3의 배수입니다.");
            System.out.println(su + "의 제곱은 " +
                                (int)Math.pow(su,2)+"입니다.");
        } else {
            System.out.println(su + "는(은) 3의 배수가 아닙니다.");
            System.out.println(su + " + 5는 " + (su + 5) + "입니다.");
        }
    }
}
