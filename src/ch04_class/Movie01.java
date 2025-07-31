package ch04_class;

public class Movie01 {
    private String name;
    private String[] genre;// 장르
    private int runningTime;// 러닝타임(분단위)
    private String [] ott;// 지원하는 ott
    private double rating;// 영화평점
    private int ageMovie;// 영화 등급

    public void setName(String name){   // name setter
        this.name = name;
    }
    public String getName(){            // name getter
        return name;
    }

    public void setGenre(String[] genre){   // genre setter
        this.genre = genre;
    }
    public String[] genre(){                //genre getter
        return genre;
    }

    public void setRunningTime(int runningTime){    // runningTime setter
        this.runningTime = runningTime;
    }
    public int getRunningTime(){                    // runningTime getter
        return runningTime;
    }

    public void setOtt(String[] ott) {          // ott setter
        this.ott = ott;
    }
    public String[] getOtt() {                     // ott getter
        return ott;
    }

    public void setRating(double rating) {         // rating setter
        this.rating = rating;
    }
    public double getRating() {                     // rating getter
        return rating;
    }

    public void setAgeMovie(int ageMovie){          // ageMovie setter
        this.ageMovie = ageMovie;
    }
    public int getAgeMovie() {                      // ageMovie getter
        return ageMovie;
    }

    //suppotOTT(String ottN) ottN에 플랫폼 입력시 지원하면 "관람가능합니다."/
    //                          지원안하면 "해당 ott에서는 지원하지않습니다." 출력
    void supportOTT (String ottN) { // String ottN은 검색할 플랫폼명
        boolean found = false;      // 배열안에 ottN이 있으면 true, 없으면 flase.

        for (String platform : ott) {  //ott 배열 안에 Strin platform이 있을때까지 반복
                if (ottN.equals(platform)) {
                    found = true;   // ott 배열 안에 ottN과 일치하는 값이 있으면
                    break;          //found는 true인 상태로 for문 종료.
                }

            }
        if (found) {                //found가 true면 yesMsg가 나오게,
            String yesMsg = name + "은(는) " + ottN + "에서 관람 가능합니다.";
            System.out.println(yesMsg);
        } else {                    //found가 false면 else로 내려가서 noMsg가 나오게
            String noMsg = name + "은(는) " + ottN + "에서 지원하지 않습니다.";
            System.out.println(noMsg);
        }

    }


    //runningTime() 해당 영화의 러닝타임을 @시간@분으로 출력하는 메소드
    String runningTime() {
        int runHours = runningTime / 60;
        int runminutes = runningTime % 60;
        String runTimeMsg = getName() + "의 러닝타임은 " + runHours + "시간 " + runminutes + "분 입니다.";
        return runTimeMsg;
    }
    //genreMovie(String str) 장르가 str인 영화 출력
}
