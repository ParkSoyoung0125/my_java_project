package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        int top, bottom, height, area;

        top = 10;
        bottom = 20;
        height = 15;
        area = (top + bottom)*height / 2;

        System.out.println("윗변 : " + top);
        System.out.println("밑변 : " + bottom);
        System.out.println("높이 : " + height);
        System.out.println("면적 : " + area);
    }
}
