package ch04_class;
import java.util.*;

public class MovieMain01 {
    public static void main(String[] args) {

        // movie1
        Movie01 movie1 = new Movie01();
        movie1.name = "타이타닉";
        movie1.genre = new String[]{"로맨스","멜로"};
        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
        movie1.ott = new String[] {"웨이브","유플러스모바일","애플티비","쿠팡플레이","디즈니플러스"};
        movie1.runningTime = 195;
        movie1.rating = 9.69;
        movie1.ageMovie = 15;

        // movie2
        Movie01 movie2 = new Movie01();
        movie2.name = "전우치";
        movie2.genre = new String[]{"액션","코미디","모험"};
        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
        movie2.ott = new String[] {"유플러스모바일","웨이브","왓챠","애플티비","티빙","넷플릭스","쿠팡플레이"};
        movie2.runningTime = 136;
        movie2.rating = 8.22;
        movie2.ageMovie = 12;

        //movie3
        Movie01 movie3 = new Movie01();
        movie3.name = "인셉션";
        movie3.genre = new String[]{"액션","SF","모험","스릴러"};
        // Movie01에서 배열로 선언한 genre변수에 new연산자로 문자열 할당.
        movie3.ott = new String[] {"웨이브","애플티비","쿠팡플레이","유플러스모바일"};
        movie3.runningTime = 147;
        movie3.rating = 9.47;
        movie3.ageMovie = 12;

        movie1.supportOTT("디즈니플러스");
        movie2.supportOTT("디즈니플러스");
        movie3.supportOTT("디즈니플러스");

        System.out.println(movie1.runningTime());
        System.out.println(movie2.runningTime());
        System.out.println(movie3.runningTime());


    }
    Scanner sc = new Scanner(System.in);
    // 영화 장르(platfomN)를 콘솔에 입력했을때 해당 장르가 있는 영화명을 불러오기



}
