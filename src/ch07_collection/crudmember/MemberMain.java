package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();

        // dao.inserData에 객체배열로 데이터를 넣고 넣은 데이터 한번씩 호출
        dao.insertData(new Member("kim","김만수",10,"남자"));
        dao.insertData(new Member("park","박영희",10,"여자"));
        dao.insertData(new Member("kee","이수진",13,"여자"));
        dao.insertData(new Member("choi","최윤식",40,"남자"));

        int size = dao.getsize(); // 객체배열의 요소갯수 출력
        System.out.println("회원은 총 "+size+"명 입니다");

        System.out.println("\n모든 회원 정보 를 출력합니다.");

        List<Member> memberList =  dao.selectall();
        // memberDao에서 memberList 전체 호출해서 for문에 넣고 반복출력.
        for(Member bean : memberList){
            String id = bean.getId();
            String name = bean.getName();
            int age = bean.getAge();
            String gender = bean.getGender();

            String msg = id + "\t" + name+ "\t" + age + "\t" + gender;
            System.out.println(msg);
        }
        System.out.println();

        // id가 @인 사람의 정보를 출력.
        String findid = "park";
        System.out.println("ID가 " + findid + "인 사람의 정보를 조회합니다.");
        if (dao.getOne(findid) != null){
            Member one = dao.getOne(findid);
            String id = one.getId();
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();

            String msg = id + "\t" + name+ "\t" + age + "\t" + gender;
            System.out.println(msg);
        } else {
            System.out.println("해당 데이터를 찾을 수 없습니다.");
        }

        findid = "kee";
        System.out.println("아이디가 " + findid + "인 사람의 회원정보를 삭제합니다.");
        int result = dao.deleteData(findid);
        if (result != -1){
            System.out.println("데이터 삭제 성공");
            System.out.println("데이터 요소 갯수 : "+dao.getsize());
        } else {
            System.out.println("데이터 삭제 실패");
            System.out.println("데이터 요소 갯수 : "+dao.getsize());
        }

        System.out.println("before all deleted : " + dao.getsize());
        dao.deleteAllData();
        System.out.println("after all deleted : " + dao.getsize());

    }
}
