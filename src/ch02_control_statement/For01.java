package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 10 ; i++) {
            total += i;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        for (int i = 1; i < 101; i+=3){ // i가 100이 되기 전까지
                                        // 1부터 +3씩 증가

            total += i;    //total2 = total2 + i;
                            // 1부터 계속 3씩 증가한 i가 total2에 누적합산됨.
        }
        System.out.println("총합02 : " + total);

        total = 0;
        for (int i = 97; i >1; i -=5){  // i가 1보다 커질때(=2가 될때)까지
                                        // 5씩 감소
            total += i;                 // 5씩 감소되는 i가 total에 합산.
            //total = total + i 를 반복
        }
        System.out.println("총합03 : " + total);

        total = 0;
        for (int i = 1; i < 100; i+=5){ // i가 1부터 5씩 증가하여
            total += i*i;               // 5씩 증가된 수가 total에 합산(반복)
            // 5씩 증가된 i가 100이 되기전에 멈춤.
        }
        System.out.println("총합04 : " + total);

        total = 0;
        for (int i = 1; i < 6; i+=1){
            total += i*(i+1);
        }
        System.out.println("총합05 : " + total);

    }
}
