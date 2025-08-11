package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

// DAO 클래스 : 데이터베이스에게 데이터를 추가/수정/삭제 등의 작업을 요청해주는 중간 middle-ware 성격의 클래스
public class BoardDao {
    private List<Board> boardList = null; //DB가 없는 관계로 임시로 만든 게시물리스트 통(bucket).

    public BoardDao(){
        this.boardList = new ArrayList<>(); // 게시물 담는 통 초기화
    }

    public int insertData(Board board) {
        System.out.println("게시물 번호 " + board.getNo() + "이(가) 추가됩니다.");
        boardList.add(board);
        return 1; // 0은 false, 1은 true
    }

    public int getSize(){
        return boardList.size();
    }

    public List<Board> selctAll(){
        return this.boardList;
    }

    public Board getOne(int findid) {
        Board findData = null; // 반환해줄 데이터 정보
        for (Board board : boardList) {
            if (board.getNo() == findid) { // 해당 게시물 발견됨.
                findData = board; // 해당객체를 반환하는 데이터에 할당
                break; // 해당 게시물 아럐의게시물은 볼 필요가 없기 때문에 break.
            }
        }
        return findData;
    }

    public int removeData(int deleteId) {
        // deleteId는 삭제하고자 하는 게시물 번호
        int cnt = -1; // -1은 '발견' 여부를 나타내는 flag 변수
        for (Board board : boardList){
            if (board.getNo() == deleteId) {
                this.boardList.remove(board);
                cnt = 1;
                break;
            }
        }
        return cnt;
    }
}
