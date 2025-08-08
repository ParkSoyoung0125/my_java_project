package ch07_collection;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String , Integer> teamMap = new HashMap<String , Integer>();

        teamMap.put("LG", 1);
        teamMap.put("SSG",2);
        teamMap.put("두산",3);
        teamMap.put("KT",4);

        String findItem = "NC";
        boolean bool = teamMap.containsKey(findItem);
        System.out.println(findItem + "팀이 목록에 있나요?" + bool);

        // NC 팀이 존재하는 지 체크하고, 없으면 순위 5위로 추가
        if (bool == false){
            teamMap.put(findItem,5);
        }

        // 순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 'KIA'를 추가
        // 존재 여부를 적절한 문구로 출력.
        final int pos = 6;
        findItem = "KIA";
        bool = teamMap.containsValue(pos);
        if (bool==true){
            String msg = pos + "위 팀은 존재합니다.";
            System.out.println(msg);
        } else {
            String msg = pos + "위 팀은 존재하지 않습니다.";
            System.out.println(msg);
            teamMap.put(findItem,6);
            System.out.println(findItem + " 팀을 추가하였습니다.");
        }

        String [] teams = {"롯데","한화", "키움", "삼성"};

        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i],i+7);
        }

        findItem = "한화";
        Integer rank = teamMap.get(findItem);
        if (rank == null){
            System.out.println(findItem + "팀은 존재하지 않습니다.");
        }else {
            String msg = "팀명 " + findItem + ", 순위 : " + rank;
            System.out.println(msg);
        }

        System.out.println("다음 팀들의 순위 정보를 출력해주세요.");
        String [] findTeaams = {"두산","KT","빙그레"};
        for (String one : findTeaams){
            rank = teamMap.get(one);
            if (rank != null){
                System.out.println(one + "팀 의 순위는 " + rank + "위입니다.");
            } else {
                teamMap.put(one, teamMap.size()+1);
                System.out.println(one+"팀을 " + teamMap.size()+"위에 추가하였습니다.");
            }

        }
        System.out.println("전체 목록을 출력해봅니다.");
        Set<String> items =teamMap.keySet();
        System.out.println(items);

        for (String key : items) {
            System.out.println(key +"팀은 순위가 " + teamMap.get(key)+"위 입니다.");
        }

        teamMap.clear();

        System.out.println("요소 크기 : " + teamMap.size());
        System.out.println();
        
    }
}
