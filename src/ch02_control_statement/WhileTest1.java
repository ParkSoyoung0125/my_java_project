package ch02_control_statement;

public class WhileTest1 {
    public static void main(String[] args) {
        int dan = 3; //단수
        int i = 1;
        while (i < 10){
            System.out.println(dan + " * " + i + " = " + dan*i);
            i++;
        }
    }
}
