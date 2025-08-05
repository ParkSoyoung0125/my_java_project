package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount;

    @Override
    public String toString() {
        String msg = ", 물량 : "+ this.waterAmount + "ml";
        return super.toString() + msg;
    }

    public void sipAmericano(){
        String message = "아메리카노 홀짝홀짝";
        System.out.println(message);
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name,price);
        this.waterAmount = waterAmount;
    }
}
