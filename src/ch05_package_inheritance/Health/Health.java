package ch05_package_inheritance.Health;

public class Health extends Human {
    private double s_weight = 0.0;
    private double fatrate = 0.0;
    private String result = null;

    public Health(String name, String gender, double height, double weight){
        super(name, gender, height, weight);
        this.s_weight = s_weight;
        this.fatrate = fatrate;
        this.result = result;
    }

    public void calculate(){
        super.output1();
        if (super.getGender() == "남자") {
            this.s_weight = (getHeight()-100.0)*0.9;
        } else if(super.getGender() == "여자"){
            this.s_weight = (getHeight()-100.0)*0.85;
        }
        System.out.println(s_weight);
        fatrate = (super.getWeight()/s_weight)*100;
        System.out.println(fatrate);
    }



//    public String output2(){
//        super.output1();
//        if (fatrate <= 90) {
//            result = "저체중";
//        } else if(fatrate > 90 && fatrate < 111){
//            result = "정상(표준체중)";
//        } else if (fatrate > 110 && fatrate < 121) {
//            result = "과체중";
//        } else if (fatrate > 120 && fatrate < 131) {
//            result = "경도비만";
//        } else if(fatrate > 130 && fatrate < 151){
//            result = "중도비만";
//        } else if (fatrate > 150) {
//            result = "고도비만";
//        }
//        System.out.println(fatrate);
//        System.out.println(result);
//        return result;
//    }



}
