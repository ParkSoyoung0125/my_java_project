package ch05_package_inheritance.Health;

public class Health extends Human {
    private double s_weight = 0.0;
    private double fatrate = 0.0;
    private String result = null;

    public Health(String name, String gender, double height, double weight){
        super(name, gender, height, weight);
    }

    public void calculate(){
        if (super.getGender() == "남자") {
            this.s_weight = (getHeight()-100.0)*0.9;
        } else if(super.getGender() == "여자"){
            this.s_weight = (getHeight()-100.0)*0.85;
        } else {}
//        System.out.println(this.s_weight);
        this.fatrate = (super.getWeight()/this.s_weight)*100;
//        System.out.println(this.fatrate);
    }



    public void output2(){
        super.output1();
        calculate();
        if (this.fatrate <= 90) {
            result = "저체중";
        } else if(this.fatrate > 90 && this.fatrate < 111){
            result = "정상(표준체중)";
        } else if (this.fatrate > 110 && this.fatrate < 121) {
            result = "과체중";
        } else if (this.fatrate > 120 && this.fatrate < 131) {
            result = "경도비만";
        } else if(this.fatrate > 130 && this.fatrate < 151){
            result = "중도비만";
        } else if (this.fatrate > 150) {
            result = "고도비만";
        }
//        System.out.println(this.fatrate);
//        System.out.println(result);
        String fat = String.format("%.3f",(this.fatrate/100.0));
        String message = super.getName() + "님은 비만도가 " + fat + "이고, " + result + "입니다.";
        System.out.println(message);;
    }



}
