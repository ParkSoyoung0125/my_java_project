package ch03_array;

public class Array01 {
    public static void main(String[] args) {
        String [] bts = new String[7];
        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "rm";
        bts[4] = "지민";
        bts[5] = "제이홉";
        bts[6] = "슈가";
        for (int i =0; i < bts.length; i++){
            System.out.print(bts[i]);
            if (i < bts.length -1){ // bts.length = 7
                System.out.print(", "); //bts[5]까지만 ,가 붙기
            }
        }

        System.out.println();

        String [] bts2 = {"진", "뷔", "정국", "rm", "지민", "제이홉", "슈가"};
        for (int i = 0; i < bts2.length; i++) {
            System.out.println((i+1) + "번째 멤버 : " + bts[i]);
        }
    }
}
