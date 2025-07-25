package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {
        int su = 5;

        if (su % 2 == 0){
            System.out.println("짝수 " + su + "놀장");
        }

        if (su % 2 == 0){ //선택지가 2개일 때 사용
            System.out.println("숫자 " + su + "는 짝수입니다.");
            System.out.println("하하");
        }else {
            System.out.println("숫자 " + su + "는 홀수입니다.");
            System.out.println("호호");
        }

        System.out.println("키키");
    }
}
