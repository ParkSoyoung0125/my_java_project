package ch06_abstract_interface.beveragetest;

public class Americano extends Beverage{
    private int shotCount;
    public Americano(String name, double price,int shotCount){
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public void drink() {
        System.out.println(super.getName()+"를(을) 홀짝입니다.");
    }

    @Override
    public void make() {
        System.out.println("["+super.getName()+" 제조법"+"]");
        String msg = "에스프레소 " + this.shotCount + "샷을 추출합니다.\n컵에 에스프레소 "+this.shotCount+"샷을 넣고 뜨거운 물을 부어줍니다.";
        System.out.println(msg);
    }


}
