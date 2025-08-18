package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private List<Member> memberList = null; // 회원 목록을 담을 컬렉션

    public MemberDao() {
        this.memberList = new ArrayList<Member>();
    }

    public int insertData(Member member){ // 회원 1명 추가하기
        System.out.println("아이디가 " + member.getId()+"인 회원이 가입합니다.");
        this.memberList.add(member);
        return 1;
    }

    public int getsize() {
        return this.memberList.size(); // memberlist의 총원 구하기
    }


    public List<Member> selectall() {
        return this.memberList;          //memberlist 전체 출력.
    }
    
    public Member getOne(String id) {
        Member finddata = null;
        for (Member member : memberList){
            if (id == member.getId()){
                finddata = member;
                break;
            } else {}
        }
        return finddata;
    }

    public int deleteData(String findid) {
        int result = -1;
        for (Member member : memberList){
            if (findid == member.getId()){
                memberList.remove(member);
                result = 1;
                break;
            }
        }
        return result;
    }


    public void deleteAllData() {
        System.out.println("데이터를 전부 삭제합니다.");
        memberList.clear();
    }
}
