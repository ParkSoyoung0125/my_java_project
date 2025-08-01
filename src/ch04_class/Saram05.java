package ch04_class;

public class Saram05 {
    // Saram05 클래스의 인스턴스 변수
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    // 생성자 호출 : 주어진 정보를 전부 입력해야 출력하는 생성자
    public Saram05(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }
    // 위의 생성자와 시그너쳐가 다르기 때문에 생성자 오버로딩한 상태.
    // hobby는 생성자를 통하여 입력하지 않으면 기본값으로 "당구"로 출력되는 생성자
    public Saram05(String name, double height, double weight, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "당구";
        this.blood = blood;
    }

    // hobby를 비우면 "당구"가 나오고 hobby에 값을 적을 시 그 값이 나오는 메소드
//    public Saram05(String name, double height, double weight, String hobby, String blood){
//        this.name = name;
//        this.height = height;
//        this.weight = weight;
//        this.hobby = ((hobby == null || hobby.isBlank()) ? "당구": hobby);
//        this.blood = blood;
//    }

    // 정보 출력하는 일반 기능의 메소드
    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("체중 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
    }
}
