package ch06_abstract_interface.myshape;

public class Circle extends Shape{
    private double radius; // 반지름
    private double xpos; // x좌표
    private double ypos; // y좌표
    private double PI = 3.14;

    public Circle (String linecolor, String fillcolor,double radius, double xpos, double ypos) {
        super(linecolor,fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calArea() {
        return Math.pow(this.radius,2)*PI;
    }

    @Override
    public double calPerimeter() {
        return (radius*2.0)*PI;
    }

    @Override
    public void display() {
        super.area = this.calArea();
        super.perimeter = this.calPerimeter();
        System.out.println("원 정보");
        System.out.println("면적 : " +  super.area);
        System.out.println("둘레 : " + super.perimeter);
        String msg = "원 중심 : (" +this.xpos + ", " + this.ypos + ")";
        System.out.println(msg);
    }
}
