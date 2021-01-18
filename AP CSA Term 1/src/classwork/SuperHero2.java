package classwork;

public class SuperHero2 {
    String name;
    String power;
    int peopleSaved;

    public SuperHero2(String name, String power, int peopleSaved){
        this.name = name;
        this.power = power;
        this.peopleSaved = peopleSaved;
    }

    void introduce(){
        System.out.println("My name is "+name+" and I can do this: "+power);
    }

    void savedNum(){
        System.out.println("I saved "+peopleSaved+" citizens!");
    }

    public static void main(String[] args) {
        SuperHero2 superman = new SuperHero2("Superman", "Strength", 250);
        superman.introduce();
        superman.savedNum();
    }
}
    		