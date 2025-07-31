package ch04_class;

public class OverloadMain {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        double x = 1.1, y = 2.2;

        OverAdd obj = new OverAdd();

        obj.Add(a, b);  // 정수 결과값을 출력하는 메소드(문자열)
        obj.Add(x,y);   // 실수 덧셈 결과값을 반환하는 메소드를 오버로딩하지 않으면 에러남.
        int result = obj.Add(a,b,c); //덧셈결과를 반환하는 메소드(정수형)
        System.out.println(result);

        a = 100;
        b = 200;
        obj.Add(a,b);

        x = 5.5;
        y = 3.3;

        obj.Add(a,y); // 정수와 실수를 같이 두면 정수가 '암시적 형변환'으로 실수로 데이터 처리가 됨.

        obj.Add(x, b);

    }
}
