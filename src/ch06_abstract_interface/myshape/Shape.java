package ch06_abstract_interface.myshape;

public abstract class Shape {
    protected double area;
    protected double perimeter;
    private String linecolor; // 라인색상
    private String fillcolor; // 채우기 색상

    public Shape() {

    }

    // final 메소드는 오버라이딩을 하지 못하도록 막고자 할 때 사용.(강제성 O)
    public final void draw(){
        System.out.println("라인 색상 : " + this.linecolor);
        System.out.println("채우기 색상 : " + this.fillcolor);
    }

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    // 내용이 정의되지않는 모델 개념으로, 불완전한 메소드임.
    public abstract double calArea(); // 도형 면적구하기
    public abstract double calPerimeter(); // 도형 둘레구하기
    public void display(){} // 도형 정보 보이기

}
