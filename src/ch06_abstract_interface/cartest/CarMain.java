package ch06_abstract_interface.cartest;

public class CarMain {
    public static void main(String[] args) {
        Car [] mycar = {
                new Avante("아반떼",100,Key.KEY, "가장 많은 판매"),
                new Sonata("소나타",300,Key.SMART,"HyunDAi"),
                new Grandeur("그랜져",300,Key.SMART,22.0)
        };
        for (Car car : mycar) {
            System.out.println("======================");
            car.turnOn();
            Radio.play(Frequency.FM,91.9);
            car.sayHello(car.getName(),1);

            // "객체를 출력"한다는 의미는 암시적으로 toString() 메소드를 호출한다는 의미. 때문에 toString() 없이도 호출이 됨.
            System.out.println(car);

            car.display();

            car.speeaUp(20); // 값을 누적합니다.
            car.display();

            car.speeaUp(Speed.Allowed_Max_Speed);
            car.display();

            car.speedDown(15);
            car.display();

            car.turnOff();
        }
    }
}
