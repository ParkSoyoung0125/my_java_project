package ch06_abstract_interface.beveragetest;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage [] beverage = {
                new Americano("아메리카노", 3800.0,1),
                new Espresso("에스프레소", 4200.0,2),
                new Latte("라떼",4500.0,"오트밀크",3)
        };

        for(Beverage bevge : beverage){
            bevge.showData();
            bevge.drink();
            bevge.make();
            System.out.println("===========================");
        }
        System.out.println("toString 메소드 오버라이딩 실습");

        for (Beverage bevge : beverage){
            System.out.println(bevge.toString());
        }
    }
}
