package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        // 변수를 선언(정의)
        int x, y, z; // 정수형 데이터를 위하여 변수 X를 준비.

        x = 3; // x라는 곳에 정수 3을 할당(대입)하기.(write)
        y = 5;
        z = x + y; // 변수 읽기 2번 + 쓰기 1번

        String message; // 문자열 데이터를 위하여 변수 message를 준비.

        message = x + " 더하기 " + y + "는 " + z + "입니다."; // 문자열 데이터를 message에 할당.
        // + 기호의 역할 : 정수형 데이터끼리는 덧셈연산, 정수+문자열은 데이터 결합.

        System.out.println(message);

        // 변수는 한번만 선언할 수 있기 때문에 데이터 재할당
        x = 4; //  앞서 3이었던 변수 x의 데이터를 4로 치환.
        y = 8;

        z = x * y;

        message = x + " 곱하기 " + y + "는 " + z + "입니다.";

        System.out.println(message);
    }
}
