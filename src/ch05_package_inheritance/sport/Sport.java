package ch05_package_inheritance.sport;

public class Sport {
    private String name;
    private int entry;

    public Sport(String name, int entry){
        this.name = name;
        this.entry = entry;

    }

    public void entrySport(){
        System.out.println(this.name + " 경기는 " + this.entry + "명의 엔트리로 구성이 됩니다.");
    }
}
