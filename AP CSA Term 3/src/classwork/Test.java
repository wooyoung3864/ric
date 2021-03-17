package classwork;
import java.security.SignedObject;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        /*
        String[] testArray = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
        String[] array2 = new String[7];
        for(int i = 0; i < testArray.length; ++i) {
            array2[i] = testArray[i];
        }
        System.out.println(Arrays.toString(array2));
        */

        /*
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        int x = nums.remove(3);
        int y = x + nums.remove(0);
        int z = x + y;
        nums.add(2, z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(nums);
        */
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int sum = 10;
        while(nums.size() <= sum)
        {
            nums.add(sum);
            sum--;
        }

        for(int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i) %5 == 0)
            {
                nums.remove(i);
            }
        }
        System.out.println(nums.toString());
    }
}
