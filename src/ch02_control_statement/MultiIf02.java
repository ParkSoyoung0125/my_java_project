package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 10; // 연령
        double ticket = 1000; // 티켓값
        double discount ; // 할인율
        String adult ;

        if (age <= 0 || age > 120) { // 0세이하거나 120세 초과일 경우
            System.out.println("잘못된 정보입니다.");
        }
        else { // 1세 ~ 120세일 경우
                if (age < 8 && age > 0){ // 1 ~ 7세
                adult = "유아(무료 입장)";
                discount = 1.0;
                }
                else if (age < 14 && age >=8) { // 8 ~ 13세
                adult = "어린이(50% 할인)";
                discount = 0.5;
                }
                else if (age < 20 && age >= 14) { // 14 ~ 19세
                adult = "청소년(30% 할인)" ;
                discount = 0.3;
                }
                else if (age >= 20 && age < 66){ // 20 ~ 65세
                adult = "성인(정가)";
                discount = 0.0;
                }
                else {                            // 66세 이상
                adult = "노인(40% 할인)";
                discount = 0.4;
                }
            String message =  age + "세 : " + adult + "\n"
                    + "가격은 " + (int)(ticket*(1-discount)) + "원 입니다.";
            System.out.println(message);

            }

    }
}
