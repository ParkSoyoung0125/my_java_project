package ch02_control_statement;

public class Exam4_16 {
    public static void main(String[] args) {
        int star = 24;
        for (int i = 1; i < star + 1; i++) {
            System.out.print("*");
            if (i % 5 == 0){
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();

        int star2 = 22;
        int print = 4;
        for (int i = 1; i < star2 + 1 ; i++) {
            System.out.print("*");
            if (i % print == 0) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();

        star2 = 21; // 출력할 별의 총 갯수
        print = 6; // 한줄에 별 몇개씩 출력할건지
        for (int i = 1; i < star2 + 1; i++ ) {
            System.out.print("*");
            if (i % print == 0) {
                System.out.println();
            }
        }
    }
}
