package ch02_control_statement;

public class Stringswitch {
    public static void main(String[] args) {
        String month = "May";
        int monthNumber = 0;

        switch (month){
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                System.out.println("존재하지 않는 월입니다.");
                System.exit(0);

        }
        String message = month + "은(는) " + monthNumber + "월 입니다.";
        System.out.println(message);
    }
}
