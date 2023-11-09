package ru.progwards.java1.lessons.classescompare;
public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }


    public String kind() {
        return "утка";
    }
    public String say() {
        return "кря-кря";
    }


    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    public double getFoodCoeff() {
        return 0.04;
    }

}