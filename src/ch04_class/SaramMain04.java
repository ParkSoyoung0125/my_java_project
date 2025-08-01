package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        // 김철수
        Saram04 soo = new Saram04();
        soo.dispaly();

        // 박영희
        Saram04 hee = new Saram04("박영희", 162.5, 25.5, "퀼트", "AB");
        hee.dispaly();

        // 김유신에 대하며 생성자를 오버로딩 해보기.
        // 입력하지 않는 취미의 기본값은 "볼링"이라고 가정.
        Saram04 yusin = new Saram04("김유신", 182.1, 74.5, "O");
        yusin.dispaly();

        Saram04 choi = new Saram04("B", 182.1, 74.5,"최우신");
        choi.dispaly();
    }
}
