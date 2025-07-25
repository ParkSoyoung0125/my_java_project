package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100;
        System.out.println("d : " + d); //암시적 형변환(정수 -> 실수)

        int i = (int)12.5 ; // 명시적 형변환(실수 -> 정수)
        System.out.println("i : " + i);// 정수 12만 취하고 0.5는 버림

        System.out.println(14/5);
        // 2 정수형이라 뒤에 0.8은 버림

        System.out.println((double)14/5);
        // (double)14/5 ---> 14.0/5 ---> 14.0 / 5.0 ---> 2.8
        //             명시적       암시적

        System.out.println((double)(14/5));
        // (double)(14/5) ---> (double)(2) ---> 2.0
        //              산술연산            명시적

        int kor = 50, eng = 60, math = 80 ;
        int total = kor + eng + math; // total이 정수이기 때문에 63이 도출
        double avearage = (double)total / 3.0 ; // (double)total 또는 3.0
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avearage);

        char ch1 = 'c'; // 정수로 99
        char ch2 = 'a'; // 정수로 97

        boolean bool1 = ch1 > ch2 ; // 암시적 형변환으로 99 > 97 -> true
        System.out.println("bool1 = " + bool1);

        int result ;
        result= ch1 - ch2 + 5 ;
        System.out.println("result : " + result);

        char ch3 = 'D' ;
        String msg;
        msg = 'D' >= 'A' && ch3 <='Z' ? "Yes" : "No" ;
        System.out.println("대문자 판단 : " +msg);

    }
}
