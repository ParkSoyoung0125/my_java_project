package ch07_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object>set = new HashSet<Object>();
        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노"); // Set는 중복데이터를 허용하지않음. 데이터는 3개임

        set.clear();

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "마키아또";
        System.out.println(findData + " 존재여부 " + set.contains(findData));

        // '마키아또'가 존재하는지 확인 후 없으면 추가하기
        if (set.contains(findData)!= true){
            set.add("마키아또");
        }
        System.out.println("요소 크기 : " + set.size());

        System.out.println("====================");

        // '믹스커피'가 존재하면 삭제하고 '삭제성공' 문구 출력
        findData = "믹스커피";
        if (set.remove(findData)){
            set.remove(findData);
            System.out.println("요소크기 : " + set.size());
            System.out.println("삭제성공");
        } else {
            System.out.println(findData + "는 존재하지 않습니다.");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");
        // for(타입 단수이름 : 복수이름){...}
        for (Object set1 : set){
            System.out.println(set1);
        }
    }


}
