package day17oop;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void drink() {
        System.out.println("Cat drinkk");
    }
}
