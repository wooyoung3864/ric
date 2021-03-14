package classwork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "U2");
        list.add(1, "Phish");
        list.add(2, "Pink Floyd");
        list.add(3, null);
        list.add(4, null);

        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

    }
}
