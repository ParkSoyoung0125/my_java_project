package ch04_class;

public class Parent {
    public Parent(String msg) {
        System.out.println("👨 부모 생성자 호출" + msg);
    }
}
class Child extends Parent {
    public Child() {
        super("Hello from child");
        System.out.println("🧒 자식 생성자 호출");
    }
}
