package ch05_package_inheritance.animal;

public class Eagle01 extends Animal01 {
    private int wings;

    public Eagle01 (String name, int lifespan, String habitat, int speed, int wings) {
        super(name,lifespan,habitat,speed);
        this.wings = wings;
    }

    @Override
    public String toString() {
        String msg = super.getName() + "의 다리 개수는 " + this.wings + "개입니다.";
        return super.toString() +"\n"+ msg;
    }

    public void fly(){
        String comment = super.getName() +"이(가) " + super.getSpeed()+"의 속도로 날아다닙니다.";
        System.out.println(comment);
    }
}
