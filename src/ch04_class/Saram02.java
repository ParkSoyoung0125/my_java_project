package ch04_class;

public class Saram02 {
    // static 변수 = 클래스 변수 = 정적 변수
    static String nationality = "대한 민국";

    // 멤버 변수들(인스턴스 변수)
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    //double PI = 3.14; // 인스턴스 변수
    final double PI = 3.14; // 상수(=항상 값이 일정한 수)

    public void dispaly() { // 멤버 메소드
        int total = 0; // 지역 변수
        for(int i = 1; i < 11; i++ ){
            total +=1;
        }

        System.out.println(total);
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게: " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);

    }
}
