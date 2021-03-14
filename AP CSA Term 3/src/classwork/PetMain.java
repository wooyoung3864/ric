package classwork;
import java.util.ArrayList;
public class PetMain {
    public static void main(String[] args) {
        Pet tory = new Pet();
        Pet toto = new Pet("Toto", 3, 5.4, "Dog");
        Pet latte = new Pet("Latte", 0, 6.5, "Spaniel");
        Pet dawg = new Pet("Dawg", 420, 6.9, "Doggy");
        Pet popo = new Pet("Popo", 69, 74, "Cop");
        Pet bruh = new Pet("Bruh", 21, 75, "Bruh");
        Pet petRussian = new Pet("Pet Russian", 17, 69, "Russian");

        ArrayList<Pet> al = new ArrayList<Pet>();
        /*
        al.add(tory);
        al.add(toto);
        al.add(latte);
        al.add(dawg);
        al.add(popo);
        al.add(bruh);
        al.add(petRussian);
        System.out.println(tory);
        System.out.println(toto);
        System.out.println(latte);
        */

        al.set(1, tory);
        Pet temp = al.remove(1);
        al.set(2, temp);
        System.out.println(al);




    }
}
