package ch02_control_statement;

public class If04 {
    public static void main(String[] args) {
        int score = 110;

        if (score >= 90) { // 90점 이상이면 A
            System.out.println("A 학점");
        }
        else if (score <90 && score >= 80){ // 89점 ~ 80점이면 B
            System.out.println("B 학점");
        }
        else if (score < 80 && score >= 70) { // 79점 ~ 70점이면 C
            System.out.println("C 학점");
        }
        else if (score < 70 && score >= 60) { // 69점 ~ 60점이면 D
            System.out.println("D 학점");
        }
        else { // 그 외(59점부터는) F
            System.out.println("F 학점");
        }


    }
}
