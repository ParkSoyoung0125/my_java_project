package ch02_control_statement;
import java.util.*; // Scanner가 포함된 패키지 import해서 갖다쓰기

public class WhileTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 입력값 받아오기

        int count = 0; // 시험 횟수
        int total = 0; // 점수 총합

        while (true) { // 조건식이 false 될 때까지 무한반복
            System.out.println("점수를 입력하세요. (0 이하 입력 시 프로그램 종료)");
            int score = sc.nextInt(); // 점수 입력받아오기

            if (score <= 0) { // 점수가 음수일 경우 반복문 종료 (조건식 false)
                System.out.println("음수 또는 0이므로 종료합니다.");
                break;
            } // 점수 합산코드 나오기 전에 if문을 적어야 음수도 합산하지 않음.

            // 조건이 true일때는 아래를 반복
            total += score; // 점수 총합에 시험점수 누적
            count ++;       // 시험 횟수에 +1씩 누적
        } //while문 종료 후 아래 if문 수행.

        if (count > 0) {    // 시험 점수가 양수일 경우
            double average = (double) total / count;
            System.out.println("총 시험 횟수 : " + count);
            System.out.println("총점 : " + total);
            System.out.println("평균 : " + average + "점");
        } else {
            System.out.println("점수 정보가 없습니다.");
        }
        sc.close(); //스캐너 종료
    }
}
