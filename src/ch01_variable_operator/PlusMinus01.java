package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c;

            c  = ++a  +  b++ ;
            // 3  1   2   4
            /*
            1) ++a 먼저 수행
            2) a + b 수행 (11 + 20)
            3) c에 변수 할당 (c = 31)
            4) b에 변수 할당 (b = 21)
            */

            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println("c : " + c);

            c =  a++  +  --b ;
            //3   4   2   1
            /*
            1) 원래 왼쪽부터 수행하지만 전위 감소 연산자라 --b 먼저 수행 (b = 20)
            2) a + b 수행 (11 + 20)
            3) c에 변수 할당 (c = 31)
            4) a에 변수 할당 (a = 12)
            */

            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println("c : " + c);


            a = 15;
            b = 12;

            c  =  --a  +  --b ;
            // 4   1   3    2
            /*
            1) --a 먼저 수행 (a = 14)
            2) --b 수행 (b = 11)
            3) + 연산 수행 (14 + 11)
            4) = 연산 수행 (c = 25)
            */

            System.out.println("a : " + a);
            System.out.println("b : " + b);
            System.out.println("c : " + c);

            a = 10 ;
            b = 20 ;

            ++a ; // (1) a=11
            b-- ; // (2) b=19 / 아래 구문 수행 시 연산된 값으로 연산 수행.
            c  =  ++a  +  b--;
            // 3   1   2   4
            /*
            (3) (1)에서 수행된 값으로 연산(++a = 12)
            (4) + 연산 수행 ( 12 + 19 )
            (5) c에 대입 (c = 31)
            (6) b-- 연산 수행 ( b = 18)
            */

            System.out.println("a : " + a); // 12
            System.out.println("b : " + b); // 18
            System.out.println("c : " + c); // 31

    }
}
