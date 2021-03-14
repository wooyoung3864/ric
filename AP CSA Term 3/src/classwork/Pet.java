package classwork;

import javax.swing.text.html.parser.TagElement;

public class Pet {
    private String name;
    private int age;
    private double weight;
    private String type;
    private static int numInstances = 0;

    public Pet() {
        name = "Tory";
        age = 6;
        weight = 7.4;
        type = "Dog";
        ++numInstances;
    }

    public Pet(String name, int age, double weight, String type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        ++numInstances;
    }

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String toString() {
        return "Name: " + name
                + "\nAge: " + age
                + "\nWeight: " + weight
                + "\nType: " + type;
                //+ "\nNumber of pets on record: " + numInstances;
    }
}
