package ch05_package_inheritance;


public class ABMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Pet pet = new Pet() {
            @Override
            public void walk() {
                System.out.println("냥냥");
            }

            @Override
            public void eat() {
                System.out.println("먉먉");
            }
        };

        dog.walk();
        dog.eat();
        System.out.println();
        pet.run();
        pet.eat();
        pet.walk();

    }
}
