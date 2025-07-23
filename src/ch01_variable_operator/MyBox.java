package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        double weight, height, boxArea, boxPerimeter, boxCrossRoot,boxCross;

        weight = 10.0;
        height = 5.0;

        boxPerimeter = (weight + height) * 2;
        boxArea = weight * height;
        boxCross = Math.sqrt(Math.pow(weight,2)+Math.pow(height,2));
        /*
        Math 클래스 사용해서 (가로변의 2제곱 + 세로변의 2제곱)에 루트를 씌워 대각선의 길이 알아내기

        Math.sqrt(x) : x의 제곱근(=루트) 구하기
        Math.sqrt(a,b) : a의 b제곱 구하기
        */

        System.out.println("사각형의 둘레는 " + boxPerimeter + "cm입니다.");
        System.out.println("사각형의 넓이는 " + boxArea + "cm입니다.");
        System.out.println("사각형의 대각선은 " + boxCross + "cm입니다.");
    }
}
