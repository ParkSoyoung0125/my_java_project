package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        // 단계 2 : 객체 생성
        // 클래스이름 객체이름 = new 생성자이름();
        Saram01 yusin = new Saram01();

        Saram01 soon;
        soon = new Saram01();

        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부름.
        yusin.name = "김유신";
        yusin.nationnality = "대한민국";
        yusin.height = 172.5;
        yusin.weight = 75.2;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국가 : " + yusin.nationnality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);

        soon.name = "유관순";
        soon.nationnality = "대한민국";
        soon.height = 168.5;
        soon.weight = 58.2;
        soon.hobby = "운동";
        soon.blood = "A";

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국가 : " + soon.nationnality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        String message = yusin.showGenderInfo(3);
        System.out.println(message);

        message = soon.showGenderInfo(2);
        System.out.println(message);

        message = yusin.showBMIInfo();
        System.out.println(message);
        message = soon.showBMIInfo();
        System.out.println(message);

        yusin.display();
        soon.display();

    }
}
