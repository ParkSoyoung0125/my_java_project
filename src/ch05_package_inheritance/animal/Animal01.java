package ch05_package_inheritance.animal;

public class Animal01 {
    private String name;
    private int lifespan;
    private String habitat;
    private int speed;

    public Animal01 (String name, int lifespan, String habitat, int speed){
        this.name = name ;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    @Override
    public String toString() {
        String msg = "평균수명이 " + this.lifespan + "인 " + this.name + "의 서식지는 " + this.habitat + "입니다.";
        return msg;
    }



    public String getName(){
        return this.name;
    }

    public int getLifespan(){
        return this.lifespan;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public int getSpeed(){
        return this.speed;
    }

}
