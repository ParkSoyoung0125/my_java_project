package ch05_package_inheritance.general;

import java.awt.image.AreaAveragingScaleFilter;

// 서브 클래스 extends 슈퍼크래스class
public class Americano03 extends Beverage03 {
    private double watherAmount;

    public Americano03(String name, double price, double waterAmount) {
//        super(); // 부모클래스의 생성자 호출
        super(name, price);
        this.watherAmount = waterAmount;
    }

    public void printInfo(){
        super.printBeverage();
        System.out.println("투입된 물의 양 : " + this.watherAmount);
    }


}
