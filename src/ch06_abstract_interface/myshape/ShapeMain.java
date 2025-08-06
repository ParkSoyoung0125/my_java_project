package ch06_abstract_interface.myshape;

import java.util.Arrays;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
                new Triangle("yellow","black",15.0,10.0),
                new Rectangle("red", "green", 20.0, 10.0),
                new Circle("pink", "blue", 5.0,3.0,4.0)
        };

        for(Shape shp : shape){
            shp.display();
            shp.draw();
            System.out.println();
        }
        System.out.println("=====================");
        System.out.println("추상 클래스는 불완전 클래스이므로 객체 생성이 불가능함.");
        System.out.println("즉, new 키워드 오른쪽에 올수 없음.");
        // Shape myshape = new Shape() ;

        // Anonumous Inner Type은 불완전 메소드를 구체화 시키는 조건으로 객체 생성을 허락해주는 방식.
        Shape sample01 = new Shape() {
            @Override
            public double calArea() {
                return 0;
            }

            @Override
            public double calPerimeter() {
                return 0;
            }

            @Override
            public void display() {
                System.out.println("호호");
            }
        };
        for (Shape s : shape) {
            sample01.display();
        }

        // 추상 클래스는 참조변수로는 사용가능함.
        // 추상클래스 개체 = new 구현체클래스()

        Shape sample02 = new Triangle("blue", "pink", 10.0,15.0);
        sample02.display();
        sample02.draw();
    }
}
