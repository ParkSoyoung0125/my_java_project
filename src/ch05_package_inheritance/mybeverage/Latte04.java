package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04 {
    private String milkType;

    @Override
    public String toString() {
        String msg = ", 우유타입 : " + this.milkType;
        return super.toString()+msg;
    }

    public Latte04(String name, double price, String milkType){
        super(name,price);
        this.milkType = milkType;
    }
    public void enjoyLatte(){
        String message = "부드럽고 어쩌고한 " + super.getName() + "를 마십니다.";
        System.out.println(message);
    }
}
