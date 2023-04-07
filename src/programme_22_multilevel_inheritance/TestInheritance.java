package programme_22_multilevel_inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        Dog d1 = new Dog();
        Animal a = new Animal();
        d.weep();
        d1.bark();
        a.eat();
    }
}
