package ch06_abstract_interface.myshape;

public class Triangle extends Shape{
    private double width;   // 너비
    private double height; // 높이

    public Triangle(String linecolor, String fillcolor, double width, double height){
        super(linecolor,fillcolor);
        this.width = width;
        this.height = height;
    }

    //Implementation : 구체화
    @Override   // 부모클래스의 추상메소드를 오버라이딩 했습니다
    public double calArea(){ // 각 클래스는 각자 맡은 역할을 여기에 구현
        return (this.width * this.height) / 2;
    }

    @Override
    public double calPerimeter() {
        return 20.0; // 편의상 20.0이라고 가정
    }

    @Override
    public void display() {
        super.area = this.calArea();
        super.perimeter = this.calPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
