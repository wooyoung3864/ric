package classwork;

public class Person {
    private String name;
    private int age;
    private boolean accessory;

    public Person() {
        name = "Ric";
        age = 17;
        accessory = true;
    }

    public Person(String name, int age, boolean accessory) {
        this.name = name;
        this.age = age;
        this.accessory = accessory;
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

    public boolean isAccessory() {
        return accessory;
    }

    public void setAccessory(boolean accessory) {
        this.accessory = accessory;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accessory=" + accessory +
                '}';
    }

    public static void main(String[] args) {
        //Person p1 = new Person("Mr. Park", 30, false);
        //Person ric  = new Person("Ric", 17, true);
        //Person park = null;
        //System.out.println(park.getAge());

        Person[] arrMinis = new Person[5];
        arrMinis[0] = new Person("Mr. Park", 30, false);
        arrMinis[1] = new Person();
        arrMinis[2] = new Person("Skeleton Guy", 120, false);
        arrMinis[3] = new Person("King Lear", 65, true);
        arrMinis[4] = new Person("Robin Hood", 35, true);

        for(int i = 0; i < arrMinis.length; ++i) {
            System.out.println(arrMinis[i]);
        }

        System.out.println(arrMinis[1].getAge());

    }
}
