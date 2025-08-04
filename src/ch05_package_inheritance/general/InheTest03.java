package ch05_package_inheritance.general;

public class InheTest03 {
    public static void main(String[] args) {
        // 다양한 음료 객체 생성
        Americano03 americano = new Americano03("아메리카노", 4000.0, 200.0);

        americano.printInfo();

        Espresso03 espresso03 = new Espresso03("에스프레소", 5000.0, 2);

        espresso03.printInfo();

        Latte03 latte03 = new Latte03("라떼",6000.0, "아몬드우유");

        latte03.showMilktype();
    }
}