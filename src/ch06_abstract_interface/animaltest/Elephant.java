package ch06_abstract_interface.animaltest;

public class Elephant extends Animal implements elep{
    private String name;
    private String feed;

    public Elephant(String name, String feed) {
        this.name = name;
        this.feed = feed;
    }

    @Override
    public void eat() {
        String msg = this.name+"이(가) " + this.feed+"을 먹습니다.";
        System.out.println(msg);
    }

    @Override
    public void shower() {
        String msg = this.name + "이(가) 샤워를 합니다.";
        System.out.println(msg);
    }

    public void display(){
        this.eat();
        this.shower();
    }
}
