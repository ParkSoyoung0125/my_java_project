package ch02_control_statement;

public class Logical01 {
    public static void main(String[] args) {
        int month = 13; // 월
        String season ; // 계절

        if (month ==12 || month ==1 || month ==2) { // 1월, 2월, 12월
            season = "겨울입니다.";
        } else if (month>=3 && month <=5) { // 3 ~ 5월
            season = "봄입니다.";
        } else if (month>=6 && month <=8) { // 6 ~ 8월
            season = "여름입니다.";
        } else if (month>=9 && month <=11) { // 9월 ~ 11월
            season = "가을입니다.";
        } else { // 그 외 숫자 입력시 "해당 월은 존재하지 않습니다." 출력
            season = "존재하지 않습니다.";
        }
        String message = month + "월은 " + season ;
        System.out.println(message);
    }
}
