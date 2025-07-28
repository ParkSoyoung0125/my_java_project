package ch02_control_statement;

public class Switch07 {
    public static void main(String[] args) {
        int su = 6;

        System.out.println("초급자가 코딩하는 방식");
        switch (su){
            case 1 :
                System.out.println("홀수");
                break;
            case 2 :
            System.out.println("짝수");
                break;
            case 3 :
            System.out.println("홀수");
                break;
            case 4 :
            System.out.println("짝수");
                break;
            case 5 :
            System.out.println("홀수");
                break;
            case 6 :
            System.out.println("짝수");
                break;
        }

        System.out.println("중급자가 코딩하는 방식");
        switch (su){
            case 1:
            case 3:
            case 5:
                System.out.println("홀수");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("짝수");
                break;

            default: //변수에 해당하는 값이 없을때 작동
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }

        System.out.println("라인 수를 줄이는 방식");
        switch (su){
            case 1: case 3: case 5:
                System.out.println("홀수");
                break;
            case 2: case 4: case 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("잘못된 숫자입니다.");
        }

        String str = "O"; // 문자, 문자열도 가능.
        switch (str){
            case "O" :
                System.out.println("정답입니다.");
                break;
            case "X" :
                System.out.println("오답입니다.");
                break;

            default:
                System.out.println("잘못된 정보입니다.");
        }
    }
}
