package ch08_exception;

import java.util.Scanner;

public class ExcepTest02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("첫 번째 정수 입력 : ");
            int x = Integer.parseInt(scan.next());

            System.out.println("두 번째 정수 입력 : ");
            int y = Integer.parseInt(scan.next());
            System.out.println(x/y);

        } catch (NumberFormatException nex){
            System.out.println("정수가 아닙니다.");
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나누기 예외 처리");
        } catch (Exception ex) {
            System.out.println("기타 다른 예외 발생 시 처리");
        } finally {
            System.out.println("실행종료");
            scan.close();
        }
    }
}
