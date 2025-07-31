package ch04_class;

public class Saram03 {

    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;



    public void setName (String name) { // private 변수에 값 할당하는 setter 메소드
        this.name = name;
    }

    public String getName(){    // private 변수를 읽어오는 getter 메소드
        return name; // this.name을 할수는 있지만 현재 클래스 정황상 name이 인스턴스변수임이 확실하기때문에
    }                   // 안붙여도 됨

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
