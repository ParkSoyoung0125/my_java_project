package ch06_abstract_interface.cartest;

public abstract class Car implements Speed,Display,Radio{

    // 일반화 ) 모든 차들에게 공통적으로 적용할 수 있는 변수들을 여기에 정의합니다.

    private String name; // 차량 이름
    private int price; //  차량 단가
    private Key key; // 열쇠의 종류

    protected int speed; // 차량현재속도

    // 최고 속도 초과시 허용 최고속도로 제한시키기
    public int checkSpeed() {
        int maxSpeed = Speed.Allowed_Max_Speed;
        if (this.speed >= maxSpeed) {
            String msg = maxSpeed + "km 이상 과속하지 마세요.";
            System.out.println(msg);
            return  maxSpeed;
        } else {
            return this.speed;
        }
    }

    @Override
    public String toString() {
        String msg = "이름 : " + this.name
                + "\n단가 : " + this.price
                + "\n열쇠 타입 : " + this.key
                + "\n한글 이름 : " + key.getName();

        return msg;
    }

    public Car(String name, int price, Key key) {
        this.name = name;
        this.price = price;
        this.key = key;
    }

    public final void turnOn(){
        String msg = this.key.getName() + "로 " + this.name + "의 시동을 켭니다.";
        System.out.println(msg);
    }

    public final void turnOff(){
        String msg = this.name + "의 시동을 끕니다.";
        System.out.println(msg);
    }


    public String getName(){
        return this.name = name;
    }

}
