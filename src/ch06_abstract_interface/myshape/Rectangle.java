package ch06_abstract_interface.myshape;

public class Rectangle extends Shape{
    private double width;   // 너비
    private double height; // 높이

    public Rectangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calArea() {
        double area = this.width * this.height;
//        System.out.println(area);
        return area;
    }

    @Override
    public double calPerimeter() {
        return (this.height+this.width)*2.0;
    }

    @Override
    public void display() {
        super.area = this.calArea();
        super.perimeter = this.calPerimeter();
        System.out.println("사각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
    }
}
