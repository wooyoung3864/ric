package classwork.dog;

public class Dawg {
    private String name;
    private int age;
    private double weight;
    private String gender;

    public Dawg() {
        name = "Tory";
        age = 6;
        gender = "Female";
        weight = 7.4;
    }

    public Dawg(String name, int age, String gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void bork() {
        if(weight >= 25) {
            System.out.println("woof woof");
        } else {
            System.out.println("bork bork");
        }
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void test() {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "Dawg{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", weight: " + weight +
                '}';
    }
}
