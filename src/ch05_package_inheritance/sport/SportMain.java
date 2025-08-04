package ch05_package_inheritance.sport;

public class SportMain {
    public static void main(String[] args) {
        Sport sport = new Sport("축구", 11);
        sport.entrySport();
        System.out.println();

        FootBall football = new FootBall("축구",11, 1, 5);
        football.footballPlay();
        System.out.println();

        BaseBall baseball = new BaseBall("야구", 9,9,0.412);
        baseball.baseballPlay();
    }
}
