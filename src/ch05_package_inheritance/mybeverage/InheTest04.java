package ch05_package_inheritance.mybeverage;

import java.util.ArrayList;
import java.util.Arrays;

public class InheTest04 {
    public static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름();

        // 승급 : 서브클래스가 일시적으로 슈퍼클래스의 타입으로 변환이 되는 과정.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        // 슈퍼클래스 내에 있는 메소드는 상속 개념에 의하여 접근 가능.
        beverage01.showInfo();
        System.out.println(beverage01.toString());

        // 승급 시 서브 클래스 내의 변수와 메소드는 일반적으로 접근하지 못함.
        // 단, 강등을 하게 되면 서브 클래스 내의 변수와 메소드를 접근할 수 있음.
        Americano04 ame = (Americano04) beverage01;
        ame.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0,2);
        beverage02.showInfo();

        Espresso04 esp = (Espresso04) beverage02;
        esp.drinkEspresso();
        // = ((Espresso04) beverage02).drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼",4500.0,"아몬드우유");
        beverage03.showInfo();

        Latte04 latte = (Latte04) beverage03;
        latte.enjoyLatte();

        // 승급 개념과 배열을 같이 사용하기
        // 배열 초기화 기법 : 타입 [] 배열이름 = {요소1, 요소2, ...}
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("에스프레소", 5000.0,2),
                new Latte04("바샷추라떼",4500.0,"바나나우유"),

        };

//        for(Beverage04 bever : beverage) {
//            bever.showInfo();
//        }
        System.out.println("***====================***");

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("-------------------");
            beverage[i].showInfo();
            System.out.println(beverage[i].toString());

            // beverage[i] instanceof Americano // 객체 beverage[i]는 Americano 클래스로 생성된 객체가 맞는지를 물음.
            if(beverage[i] instanceof Americano04) {    // beverage[i]가 Americano04클래스의 객체가 맞는지 확인 후 true or false 반환
                Americano04 xxx = (Americano04) beverage[i];    //true면 안전히 다운캐스팅
                xxx.sipAmericano();
            } else if (beverage[i] instanceof Espresso04) {
                Espresso04 yyy = (Espresso04) beverage[i];
                yyy.drinkEspresso();
            } else if (beverage[i] instanceof Latte04) {
                Latte04 zzz = (Latte04) beverage[i];
                zzz.enjoyLatte();
            } else {
            }
        }
    }
}
