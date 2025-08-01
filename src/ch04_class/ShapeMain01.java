package ch04_class;

public class ShapeMain01 {
    public static void main(String[] args) {
        Shape01[] shape01 = {
            new circle(), new square()
        };
        for (Shape01 s : shape01) {
            s.draw();  // 각각의 클래스에 맞는 draw() 실행
        }

    }
}
