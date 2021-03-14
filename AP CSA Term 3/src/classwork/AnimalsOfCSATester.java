package classwork;
import java.util.ArrayList;
public class AnimalsOfCSATester {
    public static void main(String[] args) {
        ArrayList<Pets> petArray = new ArrayList<Pets>();
        Pets latte = new Pets("Latte", "Spaniel", "Haley", "Daejeon");
        Pets tory = new Pets("Tory", "Pekingese", "Ric", "Incheon");
        petArray.add(latte);
        petArray.add(tory);
        System.out.println(petArray);
        System.out.println(petArray.size());

        for(int i = 0; i < petArray.size(); ++i) {
            System.out.println(petArray.get(i));
        }

        for(Pets dawg : petArray) {
            System.out.println(dawg);
        }

        System.out.println(latte.getOwner());
        System.out.println(tory.getPetName());
        System.out.println(latte.getPetType());
    }
}
