package ch04_class;
import java.util.*;

public class MovieMain01 {
    public static void main(String[] args) {
        /*
        1. 객체 배열 선언
        2. 객체 생성(new연산자 사용)
        3. 생성자 호출
        4. 배열요소에 객체주소 할당
        */
        Movie01[] movie01 = {   // 객체를 넣는 만큼 배열 내 객체의 수가 정해짐.
                new Movie01("타이타닉", // Movie01 생성자 호출
                        new String[]{"로맨스","멜로"},
                        195,
                        new String[] {"웨이브","유플러스모바일","애플티비","쿠팡플레이","디즈니플러스"},
                        9.69,
                        15),
                new Movie01("전우치",
                        new String[]{"액션","코미디","모험"},
                        136,
                        new String[]{"유플러스모바일","웨이브","왓챠","애플티비","티빙","넷플릭스","쿠팡플레이"},
                        8.22,
                        16),
                new Movie01("인셉션",
                        new String[]{"액션","SF","모험","스릴러"},
                        147,
                        new String[] {"웨이브","애플티비","쿠팡플레이","유플러스모바일"},
                        9.47,
                        12)

        };

        // movie1
//        Movie01 movie1 = new Movie01();
//        movie1.setName("타이타닉");
//        movie1.setGenre(new String[]{"로맨스","멜로"});
//        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
//        movie1.setOtt(new String[] {"웨이브","유플러스모바일","애플티비","쿠팡플레이","디즈니플러스"});
//        movie1.setRunningTime(195);
//        movie1.setRating(9.69);
//        movie1.setAgeMovie(15);
//
//        // movie2
//        Movie01 movie2 = new Movie01();
//        movie2.setName("전우치");
//        movie2.setGenre(new String[]{"액션","코미디","모험"});
//        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
//        movie2.setOtt(new String[] {"유플러스모바일","웨이브","왓챠","애플티비","티빙","넷플릭스","쿠팡플레이"});
//        movie2.setRunningTime(136);
//        movie2.setRating(8.22);
//        movie2.setAgeMovie(12);
//
//        //movie3
//        Movie01 movie3 = new Movie01();
//        movie3.setName("인셉션");
//        movie3.setGenre(new String[]{"액션","SF","모험","스릴러"});
//        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
//        movie3.setOtt(new String[] {"웨이브","애플티비","쿠팡플레이","유플러스모바일"});
//        movie3.setRunningTime(147);
//        movie3.setRating(9.47);
//        movie3.setAgeMovie(12);

        for(int i = 0; i < movie01.length; i++){
            movie01[i].infoMovie();
            System.out.println();
        }

        System.out.print("검색할 영화 장르를 입력하세요.\n장르명 : ");


        Scanner sc = new Scanner(System.in);
        String genreName = sc.nextLine();
        int count = 0;
        // 영화 장르(platfomN)를 콘솔에 입력했을때 해당 장르가 있는 영화명을 불러오기
        System.out.print(genreName +" 장르의 영화는 ");
        for(Movie01 movie : movie01){        // movie01 배열 안 객체를 하나씩 꺼내서 movie변수에 반복넣기
            for(String g : movie.getGenre()) {    // Movie[] 안 genre[]에서 g에 배열 넣기 반복
                if (g.equals(genreName)) {// genreName(입력한 장르)과 genre[]가 일치하면
                    String movieN = movie.getName();  // genreN에 해당 장르를 가진 영화이름 가져오기
                    count++;                        // if가 true면 count가 1씩 누적되도록
                    if (count > 1) {                // count가 2 이상이면 ,가 나오도록
                            System.out.print(", ");     // 1 이하면 ,가 안나오고
                        }
                        System.out.print(movieN);       // 영화 이름 출력
                        break;      // 해당 장르의 영화명 출력하고 현재 반복 종료 후 다음 배열 반복
                    }
            }
        }
        if (count == 0){    //일치하는 장르가 없으면 count가 0이되어 영화 없다는 메세지 출력
            System.out.print("존재하지 않습니다.");
        } else if (count > 0) { // 일치하는 장르가 있으면 1 이상 일테니 마무리 메시지 출력
            System.out.print("입니다.");
        }

    }
}
