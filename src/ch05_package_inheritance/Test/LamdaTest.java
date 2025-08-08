package ch05_package_inheritance.Test;

public class LamdaTest {
    public static void main(String[] args) {
        Add add = (x, y) -> {return x+y;};
        int result = add.add(3,3);

        System.out.println(result);
    }
}
