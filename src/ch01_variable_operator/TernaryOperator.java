package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 50;
        int result = (a<=b) ? b -a : a -b ; // 삼항연산자(=조건연산자)

        System.out.println("절대값 : " + result);

        int x = 5;
        result = x % 2 == 0 ? x + 3 : (int)Math.pow(x,2) ;
        System.out.println(result);

        x = 8 ;
        int y = 4 ;
        result = x >= y ? x : y ;
        System.out.println("큰 수는 " + result);

        result = x <= y ? x : y ;
        System.out.println("작은 수는 " + result);

        // x가 y의 약수일 경우 "yes", 아닐경우 "no" 출력
        x = 7 ;
        y = 24 ;
        String result2 = y % x == 0 ? "Yes" : "no" ;
        System.out.println(result2);

        // 최대 정수 구하기
        int h = 10, k = 8, l = 4 ;
        int max = h > k ? h : k;
        max = max > l ? max : l ;
        System.out.println("최대값 : " + max);

        // 최소 실수 구하기
        double i = -1.2, o = -2.3 , p = -0.8 ;
        double min = i < o ? i : o ;
        min = min < p ? min : p ;
        System.out.println("최소값 : " + min);

        // 숫자 7은(는) 홀수입니다.
        int su = 8 ;
        String message;
        String msg = su % 2 == 1 ? "홀수" : "짝수" ;
        message = "숫자 " + su + "은(는) " + msg +"입니다." ;
        System.out.println(message);

        // 60점 이상이면 합격
        // 85점이므로 합격입니다. / 50점이므로 불합격입니다.
        int score = 45 ;
        msg = score >= 60 ? "합격" : "불합격" ;
        message = score + "점이므로 " + msg + "입니다." ;
        System.out.println(message);

        // 60점 이상이면 "합격", 60점 미만면 "불합격", 100점이면 "만점"
        int scr = 60;
        String msg2 = scr == 100 ? "만점" : "합격";
        msg = scr >=60 ? msg2 : "불합격";
        String comt = scr + "점이므로 " + msg + "입니다." ;
        System.out.println(comt);



    }
}
