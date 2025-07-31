package ch04_class;

public class ShapeArea {
    final double PI = 3.14;

    void area(double radius) {    // 반지름 a를 넣으면 원의 넓이를 구하는 메소드
        double result = Math.pow(radius,2)*PI;
        System.out.println("원의 넓이 : " + result);
    }
    void area(int width, int height){  // 사각형의 가로 a, 세로 b로 넓이
        int result = width*height;
        System.out.println("사각형의 넓이 : " + result);
    }

    void area(double top, double bottom, double width){
        double result = (top + bottom) * width / 2;
        System.out.println("사다리꼴의 넓이 : " + result);
    }


}
