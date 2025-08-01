package ch04_class;

import java.util.Arrays;

public class Movie01 {
    private String name;
    private String[] genre;// 장르
    private int runningTime;// 러닝타임(분단위)
    private String[] ott;// 지원하는 ott
    private double rating;// 영화평점
    private int ageMovie;// 영화 등급

    public String[] getGenre(){
        return genre;
    }

    public String getName(){
        return name;
    }

    public Movie01(String name, String[] genre, int runningTime, String[] ott, double rating, int ageMovie){ // 생성자 호출
        this.name = name;
        this.genre = genre;
        this.runningTime = runningTime;
        this.ott = ott;
        this.rating = rating;
        this.ageMovie = ageMovie;
    }

    // 영화 정보 출력하는 메소드
    public void infoMovie(){
        System.out.println("영화명 : "+name);
        System.out.println("영화장르 : "+ Arrays.toString(genre).replace("[","").replace("]",""));
        System.out.println("러닝타임 : "+(runningTime/60)+"시간" + (runningTime%60) + "분");
        System.out.println("지원하는 OTT 플랫폼 : "+Arrays.toString(ott).replace("[","").replace("]",""));
        System.out.println("평점 : "+rating);
        System.out.println("영화 등급 : "+ageMovie + "세 이상");
    }




}
