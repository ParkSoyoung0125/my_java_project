package ch06_abstract_interface.animaltest;

public class Unicon extends  Animal implements Bird,Horse {
    private String name; // 이름
    private String gender; // 성별
    private String feed; // 사료

    private int initspeed; // 초기 속도


    public Unicon(String name, String gender, String feed) {
        this.name = name;
        this.gender = gender;
        this.feed = feed;

        if (this.gender == "M"){
            this.initspeed = Bird.speed;
        } else {
            this.initspeed = Horse.speed;
        }
    }

    @Override
    public void fly() {
        String msg = this.name + "이(가) 시속 " + Bird.speed + "의 속도로 날아갑니다.";
        System.out.println(msg);
    }

    @Override
    public void run() {
        String msg = this.name + "이(가) 시속 " + Horse.speed + "의 속도로 달려갑니다.";
        System.out.println(msg);
    }


    @Override
    public void eat() {
        String msg = this.name + "이(가) " + this.feed + "를 먹습니다.";
        System.out.println(msg);
    }

    public void display() {
        String message = this.name + "의 초기속도는 " +this.initspeed + "입니다." ;
        System.out.println(message);
        this.run();
        this.eat();
        this.fly();
    }

    @Override
    public void flutter() { // 인터페이스 default메서드 오버라이딩
        System.out.println("부리를 쪼아댑니다.");
        //Bird.super.flutter();
    }
}
