package ch05_package_inheritance.animal;

public class Lion01 extends Animal01{
    private int leg;

    public Lion01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name,lifespan,habitat,speed);
        this.leg = leg;
    }

    @Override
    public String toString() {
        String msg = super.getName() + "의 다리 개수는 " + this.leg + "개입니다.";
        return super.toString()+"\n" + msg;
    }
    public void run(){
        String comment = super.getName() +"이(가) " + super.getSpeed()+"의 속도로 달려갑니다.";
        System.out.println(comment);
    }
}
