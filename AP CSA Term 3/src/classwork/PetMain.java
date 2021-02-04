package classwork;

public class PetMain {
    public static void main(String[] args) {
        Pet tory = new Pet();
        Pet toto = new Pet("Toto", 3, 5.4, "Dog");
        Pet andy = new Pet("Andy Chang", 81, 590, "Chang");
        System.out.println(tory);
        System.out.println(toto);
        andy.setAge(3);
        andy.setName("Josh Wang");
        andy.setWeight(420);
        andy.setType("Retard");
        System.out.println(andy);
    }
}
