package ch06_abstract_interface.animaltest;

public interface Bird {
    int speed = 300;
    //(public static final) int speed = 300;

    public abstract void fly();

    default void flutter(){
        System.out.println("날개를 펄럭입니다.");
    }
}
