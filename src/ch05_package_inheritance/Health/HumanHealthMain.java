package ch05_package_inheritance.Health;

public class HumanHealthMain {
    public static void main(String[] args) {
        Human human = new Human("홍길동","M",175.3,95.45);
        human.output1();

        Health health = new Health("박영희", "F", 162.3, 52.45);
        Health health2 = new Health("홍길동","M",175.3,95.45);
        health.output2();//결과값
        health2.output2();

    }
}
