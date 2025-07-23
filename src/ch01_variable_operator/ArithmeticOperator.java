package ch01_variable_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int Time, sec, min, hour;

        Time = 9000;

        hour = Time / 3600;
        min = (Time % 3600) /60;
        sec = (Time % 3600) % 60;

        System.out.println(Time + "초는(은) " +
                hour + "시간 " +
                min + "분 " +
                sec + "초입니다.");
        System.out.println("네 알겠습니다.");
    }
}
