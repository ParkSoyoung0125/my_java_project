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
        int su = 9 ;
        String str = su % 2 == 1 ? "숫자 " + su + "은(는) 홀수입니다."
                                : "숫자 " + su + "은(는) 짝수입니다." ;
        System.out.println(str);

        // 60점 이상이면 합격
        // 85점이므로 합격입니다. / 50점이므로 불합격입니다.
        int score = 60 ;
        String str2 = score >= 60 ? score + "점이므로 합격입니다."
                                : score + "점이므로 불합격입니다." ;
        System.out.println(str2);


    }
}
