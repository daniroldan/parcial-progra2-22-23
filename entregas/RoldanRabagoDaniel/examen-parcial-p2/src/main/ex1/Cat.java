package main.ex1;

public class Cat extends Pet {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    String getName() {
        return this.name;
    }
}
