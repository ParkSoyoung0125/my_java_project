package ch01_variable_operator;

public class LogicalOperator {
    public static void main(String[] args) {

        int x = 3, y = 2 ;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("(x>=y) : " + (x>=y)); // true
        System.out.println("!(x>=y) : " + !(x>=y)); // false
        System.out.println("(x==y) : " + (x==y)); // false
        System.out.println("(x!=y) : " + (x!=y)); // true
        System.out.println("(-1 < 0) : " + (-1 < 0)); // true
        System.out.println("(3>2) && (3>4) : " + ((3>2) && (3>4))); // false
        System.out.println("(x != y) && (-1 > 0) : " + ((x != y) && (-1 > 0))); // false
        System.out.println("('a' > 'b') : " + ('a' > 'b')); // false
        //문자열도 내부에서 아스키코드(숫자)로 변환됨. (ex) a=97, b=98

    }
}
