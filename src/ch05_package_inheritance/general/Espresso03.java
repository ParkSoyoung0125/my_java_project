package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shotCount;

    // 상속을 하는 순간
    /*
    public Espresso03(){
    super();            << super()는 매개변수가 없는 생성자호출이기 때문에
    }                               부모클래스의 인스턴스를 받는 생성자를 호출해줘야 함.
    가 암시적으로 존재함.*/

    public Espresso03 (String name,double price, int shotCount){
        super(name, price);
        this.shotCount = shotCount;
    } // 부모클래스의 생성자

    public void printInfo(){
        super.printBeverage();
        System.out.println("샷의 갯수 : " + this.shotCount);
    }
}
