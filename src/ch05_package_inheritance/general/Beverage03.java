package ch05_package_inheritance.general;

public class Beverage03 {
    private String name; // 이름
    private double price; // 단가

    // 접근지정자 반환타입 생성자이름(매개변수) {...}
    public Beverage03(String name, double price) {
    this.name = name;
    /*<순서>
    (1) InheTest03에서 Americano03 생성자에 "아메리카노"를 받음
    (2)(자식)Americano03클래스에서 super(name, price)로 (부모)Beverage03클래스의 부모생성자를 호출
    (3) 부모생성자를 통해 Beverage03의 String name에 "아메리카노"가 들어옴
    (4) "아메리카노"를 Beverage03의 private String name에 할당하기 위해 this를 사용*/
    this.price = price;
    }

    public void printBeverage(){
        System.out.println("음료명 : " + this.name);
        System.out.println("음료 가격 : " + this.price);
    }
}
