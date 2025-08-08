package ch07_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.list;

public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // 오른쪽엔 안적어도 됨.
        list.add("아메리카노");
        list.add("카페라떼");
        list.add("에스프레소");
        list.add("마키아또");
        list.add("카페라떼");

//        list.addAll(Arrays.asList("카페모카","바닐라라떼"));  << 한번에 요소를 두개 이상 추가하는 방법
        System.out.println("요소크기 : " + list.size());

        int idx = -1;
        String findData = "카페라떼";
        idx = list.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);
        idx = list.lastIndexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        findData = "카푸치노";
        idx = list.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);


        // '카푸치노' 항목이 존재하지 않으면,추가하기
        if (list.contains(findData) != true) {
            list.add(findData);
        }

        // '카푸치노' 항목이 존재하지 않으면,2번째 위치에 추가하기
        if (list.contains(findData) == true) {
            list.add(2,"카푸치노");
        }


        findData = "콜드 브루";
        list.set(5,findData);

        findData = "마키아또";
        list.remove(findData);

        list.add(findData);

        for (String list1 : list) {
            System.out.println(list1);
        }

        String item = list.get(3);
        System.out.println("특정 위치 요소 : " + item);

        System.out.println("일반 for문으로 요소 출력하기");
        for (int i = 0; i < list.size(); i++){
            String data =  list.get(i);
            System.out.println(data);
        }

    }
}
