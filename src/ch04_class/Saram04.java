package ch04_class;
import java.util.*;

public class Saram04 {

    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    // public 반환타입 이름(매개변수) {...}

    Scanner sc = null; // 이런 변수가 있다고 선언.

    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }
    public Saram04(String name, double height, double weight, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
    }
    public Saram04(){
        this.name = "김철수";
        sc = new Scanner(System.in); // 생성자 취지에 맞게 초기화를 목적으로 보통 생성자 안에 작성.
    }                               // scanner객체가 참조되면서 더이상 sc는 null이 아니게 됨.
                                    // 데이터가 없더라도 sc는 객체를 참조하고 있기 때문에 null이 아님.
    public void dispaly() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("체중 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);

        if (sc != null) {
            System.out.println("정수 입력 : ");
            int su = this.sc.nextInt();
            System.out.println("입력된 정수 : " + su);
        }

    }
}
