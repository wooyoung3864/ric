package classwork;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        String[] testArray = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
        String[] array2 = new String[7];
        for(int i = 0; i < testArray.length; ++i) {
            array2[i] = testArray[i];
        }
        System.out.println(Arrays.toString(array2));

    }
}
