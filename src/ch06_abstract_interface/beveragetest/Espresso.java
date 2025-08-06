package ch06_abstract_interface.beveragetest;

public class Espresso extends Beverage{
    private int shotCount;
    public Espresso (String name, double price,int shotCount) {
        super(name,price);
        this.shotCount = shotCount;
    }

    @Override
    public void drink() {
        System.out.println("맛이 진한 " + super.getName()+"을(를) 마십니다.");
    }

    @Override
    public void make() {
        System.out.println("["+super.getName()+" 제조법"+"]");
        String msg = "원두를 미세하게 갈아서 템퍼로 평평하게 눌러줍니다.\n포터필터를 머신에 장착하고 에스프레소 "+this.shotCount+"샷을 추출합니다.";
        System.out.println(msg);
    }
}
