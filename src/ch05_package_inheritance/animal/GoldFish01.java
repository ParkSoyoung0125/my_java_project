package ch05_package_inheritance.animal;

public class GoldFish01 extends Animal01 {
    private int gill ;

    public GoldFish01(String name, int lifespan, String habitat, int speed,int gill) {
        super(name,lifespan,habitat,speed);
        this.gill = gill;
    }

    @Override
    public String toString() {
        String msg = super.getName() + "의 아가미 수는 " + this.gill + "개입니다.";
        return super.toString()+"\n" + msg;
    }

    public void swim(){
        String comment = super.getName() +"이(가) " + super.getSpeed()+"의 속도로 헤엄칩니다.";
        System.out.println(comment);
    }
}
