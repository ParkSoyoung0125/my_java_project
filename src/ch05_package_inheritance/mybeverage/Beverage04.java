package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public Beverage04(){
    }

    void showInfo(){
        System.out.println("\n상품명 : " + this.name);
        System.out.println("단가 : " + this.price);
    }

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        this.name = name;
        return name;
    }

    @Override
    public String toString(){
        String message = "품명 : " + this.name + ", 단가 : " + this.price;
        return message;
    }
}
