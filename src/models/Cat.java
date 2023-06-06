package models;

import java.util.Iterator;

public class Cat implements Iterator<String>, Comparable<Cat>{
    private String name;
    private int age;
    private String color;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private int index;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age, String color, float weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.index = 0;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %s, color: %s", this.name, this.age, this.color);
    }

    @Override
    public boolean hasNext() {
        return index++ <3;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("Name: %s", this.name);
            case 2:
                return String.format("Age: %s", this.age);
            default:
                return String.format("Color: %s",this.color);
        }
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.age, o.getAge());
    }
}
