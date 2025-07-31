package ch04_class;

public class OverAdd {
    // 반환타입 메소드명(매개변수) {...}
    int Add(int x, int y, int z){
        int result = 0;
        result = x + y + z;
        return result;
        // return x + y + z;    << int result 변수 선언 없이 바로 return도 가능.
    }
    public void Add(int a, int b){
        System.out.println("정수 덧셈 : " + (a + b));
    }

    public void Add(double a, double b){
        System.out.println("실수 덧셈 : " + (a + b));
    }

    public void Add(int x, double y){
        System.out.println("혼합형 덧셈 : " + (x + y));
    }
}
