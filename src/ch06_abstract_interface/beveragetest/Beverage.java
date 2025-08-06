package ch06_abstract_interface.beveragetest;

public abstract class Beverage {

    private String name;
    private double price;

    public Beverage (String name, double price) {
        this.name = name;
        this.price = price;
    }

    //이름과 단가를 보여주는 메서드 <= 변경 불가능하게
    public final void showData(){
        String msg = "음료 " + this.name + "의 단가는 " + this.price + "원입니다.";
        System.out.println(msg);
    };

    // 마시기 메서드
    public abstract void drink();

    // 제조하기 메서드
    public abstract void make();

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}
