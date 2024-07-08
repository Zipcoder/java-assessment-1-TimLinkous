package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, int age) {
        super(name, age);

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(null, age);
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name, 0);


    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        Cat cat = new Cat("Jim", 7);
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }

    @Override
    public int age() {
        return this.getAge();
    }

    @Override
    public String name() {
        return this.getName();
    }

    @Override
    public String owner() {
        return owner();
    }
}
