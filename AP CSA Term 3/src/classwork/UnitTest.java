package classwork;
import java.util.*;
public class UnitTest {
    public static ArrayList<String> s = new ArrayList<String>();
    public static void swapPairs(ArrayList<String> s) {
        int index = 2;
        if(s.size() % 2 == 1) index = 3;
        for(int i = 0; i <= s.size() - 2; i += 2) {
            String str = s.get(i + 1);
            s.set(i + 1, s.get(i));
            s.set(i, str);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        s.add("Four");
        s.add("score");
        s.add("and");
        s.add("seven");
        s.add("years");
        s.add("ago");

        ArrayList<String> test = new ArrayList<String>();
        test.add("To");
        test.add("be");
        test.add("or");
        test.add("not");
        test.add("to");
        test.add("be");
        test.add("Hamlet");

        swapPairs(s);
        swapPairs(test);
    }
}
