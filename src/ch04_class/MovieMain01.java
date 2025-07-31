package ch04_class;
import java.util.*;

public class MovieMain01 {
    public static void main(String[] args) {

        // movie1
        Movie01 movie1 = new Movie01();
        movie1.setName("타이타닉");
        movie1.setGenre(new String[]{"로맨스","멜로"});
        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
        movie1.setOtt(new String[] {"웨이브","유플러스모바일","애플티비","쿠팡플레이","디즈니플러스"});
        movie1.setRunningTime(195);
        movie1.setRating(9.69);
        movie1.setAgeMovie(15);

        // movie2
        Movie01 movie2 = new Movie01();
        movie2.setName("전우치");
        movie2.setGenre(new String[]{"액션","코미디","모험"});
        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
        movie2.setOtt(new String[] {"유플러스모바일","웨이브","왓챠","애플티비","티빙","넷플릭스","쿠팡플레이"});
        movie2.setRunningTime(136);
        movie2.setRating(8.22);
        movie2.setAgeMovie(12);

        //movie3
        Movie01 movie3 = new Movie01();
        movie3.setName("인셉션");
        movie3.setGenre(new String[]{"액션","SF","모험","스릴러"});
        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
        movie3.setOtt(new String[] {"웨이브","애플티비","쿠팡플레이","유플러스모바일"});
        movie3.setRunningTime(147);
        movie3.setRating(9.47);
        movie3.setAgeMovie(12);

        movie1.supportOTT("티빙");
        movie2.supportOTT("티빙");
        movie3.supportOTT("티빙");

        System.out.println(movie1.runningTime());
        System.out.println(movie2.runningTime());
        System.out.println(movie3.runningTime());

//        Scanner sc = new Scanner(System.in);
//        String platformName = sc.nextLine();
//        // 영화 장르(platfomN)를 콘솔에 입력했을때 해당 장르가 있는 영화명을 불러오기
//        Movie01 [] movies = {movie1,movie2,movie3}; // movies라는 배열에 위에서 생성한 객체 3개 할당
//        for(Movie01 movie : movies){        // movies 배열 안 객체를 하나씩 꺼내서 movie에 반복넣기
//            if(movie.equals(platformName)){
//                System.out.println(platformName + "을 지원하는 영화는 " + movie.getName() + "입니다.");
//                break;
//            }
//        }


    }
}
