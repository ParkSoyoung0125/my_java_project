package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        // 타입[] 배열명 = new 타입[요소개수]
        Saram05[] saram05 = new Saram05[2]; // 생성자 아님. 배열 선언임.

        // 0번째 객체 생성
        saram05[0] = new Saram05("김영희", 156.8, 53.8, "농구", "AB");
        // 1번째 객체 생성(위의 생성자와 시그너쳐가 다르기 때문에 생성자 오버로딩한 상태)
        saram05[1] = new Saram05("김철수", 172.6, 80.2, "O");

        for(int i = 0; i < saram05.length; i++){
            saram05[i].display();
        }
        // 배열 초기화 기법
        Saram05[] myList = {
                new Saram05("김입실",182.3,70.6,"수영", "O"),
                new Saram05("최퇴실", 168.5,68.4,"A")
        };
        for (int i = 0; i < myList.length; i++){
            myList[i].display();
        }

    }
}
