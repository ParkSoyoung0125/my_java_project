package ch05_package_inheritance.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal01[] animal = {
                new GoldFish01("금붕어",2,"거실어항",2,2),
                new Lion01("라이언",15,"세렝게티",10,4),
                new Eagle01("독수리",20,"푸른창공",50,2)
        }; // 객체배열 Animal01[]에 Goldfish01, Lion01, Eagle 3개의 객체를 담음.

        for (Animal01 anm : animal){ // animal객체배열에서 순차적으로 anm에 담기
            System.out.println(anm);
            // System.out.println이 anm 객체 내부의 toString을 자동으로 읽음
            if (anm instanceof GoldFish01){
                GoldFish01 goldFish01 = (GoldFish01) anm;
                goldFish01.swim();
            } else if (anm instanceof Lion01) {
                Lion01 lion01 = (Lion01) anm;
                lion01.run();
            } else if (anm instanceof Eagle01) {
                Eagle01 eagle01 = (Eagle01) anm;
                eagle01.fly();
            }
        }

    }
}
