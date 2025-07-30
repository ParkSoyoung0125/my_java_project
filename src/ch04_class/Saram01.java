package ch04_class;

public class Saram01 {

    // 단계 1 : 클래스 정의(선언)
        String nationnality;
        String name;
        double height;
        double weight;
        String hobby;
        String blood;

        // 반환타입 메소드이름(매개 변수 리스트) {...}
        String showGenderInfo (int juminNo) {
            String gender = "";

            if (juminNo == 1 || juminNo == 3) {
                gender = "남자";
            } else {
                gender = "여자";
            }
            String message = name + "님은 " + gender + "입니다.";
            return message;
        }

        String  showBMIInfo(){
            double newHeight = height/100;
            double BMIInfo = weight / (newHeight*newHeight); // BMI계산시 키 단위가 미터여야 함.센티미터 -> 미터
            String BMI = ""; //
            if (BMIInfo >= 25.00){
                BMI = "비만";
            } else if (BMIInfo >=23.00 ) {
                BMI = "과체중";
            } else if (BMIInfo >=18.50 ) {
                BMI = "정상체중";
            } else {
                BMI = "저체중";
            }
            String message = name + "님의 BMI는 " + BMIInfo + "이므로, " + BMI + "입니다.";
            return message;
        }

        void display(){
            System.out.println("국가 : " + name);
            System.out.println("이름 : " + nationnality);
            System.out.println("키 : " + height);
            System.out.println("몸무게 : " + weight);
            System.out.println("취미 : " + hobby);
            System.out.println("혈액형 : " + blood);
        }



//        void display () {
//            System.out.println("국가 : " + nationnality);
//            System.out.println("이름 : " + name);
//            System.out.println("키 : " + height);
//            System.out.println("몸무게 : " + weight);
//            System.out.println("취미 : " + hobby);
//            System.out.println("혈액형 : " + blood);
//        }

}
