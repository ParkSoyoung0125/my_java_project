package ch06_abstract_interface.cartest;

import ch06_abstract_interface.animaltest.Animal;

public class Avante extends Car {
    private String comment;

    public Avante(String name, int price, Key key, String comment) {
        super(name, price, key);
        this.comment = comment;
    }

    @Override
    public String toString() {
        String msg = "\n코멘트 : " + this.comment;
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
