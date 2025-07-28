package ch02_control_statement;

public class Gradeswitch {
    public static void main(String[] args) {
        String grade = "E";
        String name = "홍길동";
        String message = "";
        switch (grade){
            case "A" : case "B" :
                message = "참 잘하였습니다." ;
                break;

            case "C": case "D":
                message = "좀 더 노력하세요.";
                break;

            case "F":
                message = "다음 학기에 재수강하세요.";
                break;

            default:
                message = "잘못된 입력입니다.";
                System.exit(0);
        }
        String ment = name + "님의 학점은 " + grade + "입니다.\n"
                    + message;
        System.out.println(ment);
    }
}
