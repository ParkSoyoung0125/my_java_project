package ch04_class;

public class Shape01 {
    public void draw (){
        System.out.println("도형을 그립니다.");
    }
}


class circle extends Shape01 {
    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}
class  square extends Shape01 {
    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}