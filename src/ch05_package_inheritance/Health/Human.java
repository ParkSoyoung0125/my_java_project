package ch05_package_inheritance.Health;

public class Human {
    private String name;
    private String gender;
    private double height;
    private double weight;

    public Human(String name, String gender, double height, double weight){
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public void output1(){
        if (gender == "M") {
            this.gender = "남자";
        } else if (gender == "F") {
            this.gender = "여자";
        }  else {
            this.gender = "오류(존재하지 않는 정보)";
        }
        String msg = "이름 : " + name + ", 성별 : " + gender + ", 키 : " + height + ", 몸무게 : " + weight;
        System.out.println(msg);
    }

    public String getName(){
        return this.name = name;
    }

    public String getGender(){
        return this.gender = gender;
    }

    public double getHeight(){
        return this.height = height;
    }

    public double getWeight(){
        return this.weight = weight;
    }

}
