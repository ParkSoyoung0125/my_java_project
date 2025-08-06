package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage{
    private String milkType;
    private int shotCount;
    public Latte(String name, double price,String milkType, int shotCount){
        super(name, price);
        this.milkType = milkType;
        this.shotCount = shotCount;
    }

    @Override
    public void drink() {
        System.out.println("부드러운 " + super.getName()+"을(를) 마십니다.");
    }

    @Override
    public void make() {
        System.out.println("["+super.getName()+" 제조법"+"]");
        String msg = "에스프레소 " + this.shotCount + "샷을 추출합니다.\n컵에 에스프레소 "+this.shotCount+"샷을 넣고 " + this.milkType + "을(를) 부어줍니다.";
        System.out.println(msg);
    }
}
