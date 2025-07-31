package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {

        Saram03 yusin = new Saram03();
        Saram03 soon = new Saram03();


        yusin.setName("김유신");
        yusin.setHeight(173.8);
        yusin.setWeight(62.5);
        yusin.setHobby("농구");
        yusin.setBlood("B");


        System.out.println("현재 yusin.getName 저장된 이름은 " + yusin.getName() + "입니다.");
        System.out.println("현재 yusin.height에 저장된 신장은 " + yusin.getHeight() + "입니다.");
        System.out.println("현재 yusin.weight에 저장된 체중은 " + yusin.getWeight() + "입니다.");
        System.out.println("현재 yusin.hobby에 저장된 취미은 " + yusin.getHobby() + "입니다.");
        System.out.println("현재 yusin.blood에 저장된 혈액형은 " + yusin.getBlood() + "입니다.");

        soon.setName("유관순");
        soon.setHeight(152.8);
        soon.setWeight(48.8);
        soon.setHobby("약국");
        soon.setBlood("O");

        System.out.println("현재 soon.name에 저장된 이름은 " + soon.getName() + "입니다.");
        System.out.println("현재 soon.height에 저장된 이름은 " + soon.getHeight() + "입니다.");
        System.out.println("현재 soon.weight에 저장된 체중은 " + soon.getWeight() + "입니다.");
        System.out.println("현재 soon.hobby에 저장된 취미는 " + soon.getHobby() + "입니다.");
        System.out.println("현재 soon.blood에 저장된 혈액형은 " + soon.getBlood() + "입니다.");
    }
}
