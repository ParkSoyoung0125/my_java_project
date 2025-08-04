package ch05_package_inheritance.sport;

public class FootBall extends Sport {
    private int halves;
    private int goals;


    public FootBall(String name, int entry, int halves, int goals){
        super(name, entry);
        this.halves = halves;
        this.goals = goals;
    }

    public void footballPlay(){
        super.entrySport();
        System.out.println(this.halves + "개의 하프타임으로 구성되며, " + goals + " 골이 들어갔습니다!");
    }

}

