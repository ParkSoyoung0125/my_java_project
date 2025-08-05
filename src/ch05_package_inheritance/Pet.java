package ch05_package_inheritance;

abstract class Pet { //수퍼
    abstract public void walk();
    abstract public void eat();

    public int health;
    public void run(){
        System.out.println("run run");
    }
}
