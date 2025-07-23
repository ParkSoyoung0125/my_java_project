package ch01_variable_operator;

import javax.xml.stream.events.EndDocument;

public class ShowJumsu {
    public static void main(String[] args) {
        String name = "홍길동";
        double korScore, engScore, average;

        korScore = 40.0;
        engScore = 43.0;
        average = (korScore + engScore) / 2;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + korScore);
        System.out.println("영어 : " + engScore);
        System.out.println("평균 : " + average);

        double a, b, c;

        a = 20;
        b = 7;
        c = a / b;
        System.out.println("C =" + c);


    }
}
