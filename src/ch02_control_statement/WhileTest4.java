package ch02_control_statement;
import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        double aver = 0;
        int count = 0;

        while (true) {
            System.out.println("점수를 입력하세요.(-10 미만인 경우 프로그램이 종료됩니다.)");
            int score = sc.nextInt();   // while문 시작 후 점수를 받아야
                                        // 합산이 반복됨.
            if (score < -10) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(score > -11 && score < 0) {
                score = Math.abs(score); // score = -score;도 가능
            } else {
                // else만 쓰기도 함.(구문 닫기, 에러방지)
            }
            total += score;
            count ++;
        }
        if (count>0) {                 // 시험 횟수가 있어야 출력.
            aver = (double) total/ count;
            System.out.println("총 시험 빈도(횟수) : " + count);
            System.out.println("총점 : " + total);
            System.out.println("평균 : " + aver);
        } else {
            System.out.println("점수 정보가 없습니다.");
        }
    }
}
