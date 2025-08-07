package ch06_abstract_interface.cartest;

public class Grandeur extends Car{
    private double fuel; // 연비
    private String remark; // 연비에 대한 메모

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;
        if (this.fuel >= 20.0){
            this.remark = "Excellent";
        } else if (this.fuel >= 15.0) {
            this.remark = "Good";
        } else {
            this.remark = "Poor";
        }
    }

    @Override
    public String toString() {
        String msg = "\n연비 : " + fuel + "\n연비 메모 : " + this.remark;
        return super.toString()+msg;
    }

    @Override
    public void display() {
        double mileSpeed = super.speed / 1.6;
        String msg = super.getName() + "의 현재 속도 : " + mileSpeed + "mile";
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
