package ch06_abstract_interface.cartest;

public class Sonata extends Car{
    private String maker;

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public String toString() {
        String msg = "\n브랜드 명 : " + this.maker;
        return super.toString() + msg;
    }

    @Override
    public void display() {
        String msg = super.getName() + "의 현재 속도 : " + super.speed + "km";
        System.out.println(msg);
    }

    @Override
    public void speeaUp(int speedUP) {
        super.speed += speedUP;
        super.speed = super.checkSpeed();
    }

    @Override
    public void speedDown(int speedDown) {
        super.speed -= speedDown < 0? -speed : speed;
    }
}
