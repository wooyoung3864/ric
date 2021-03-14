package classwork.dog;

public class DawgTester {
    public static void main(String... args) {
        Dawg tory = new Dawg();
        System.out.println(tory);

        Retriever bailey = new Retriever("Bailey", 1, "Female", 25.7, "Golden", false);
        System.out.println(bailey);
        bailey.mainMenu();


    }
}
