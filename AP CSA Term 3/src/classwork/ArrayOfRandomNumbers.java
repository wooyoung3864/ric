package classwork;

public class ArrayOfRandomNumbers {
    public static void generateArray() {
        int[] nums = new int[5];
        for(int val : nums) {
            val = (int) (Math.random() * 10 ) -1;
            System.out.println(val);
        }

    }

    public static void arrayOfWords() {
        String[] rics = {"Basketball", "dogs", "apples", "computers"};
        for(int i = 0; i < rics.length; ++i) {
            System.out.println(rics[i]);
        }
    }

    public static boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6) {
            return true;
        }
        return false;
    }

    private static String[] arr = {"Hello", "Karel", "CodeHS!"};

    public static int findString(String myString)
    {
        for(String val : arr) {
            if(val.equals(myString)) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        generateArray();
        arrayOfWords();

        int[] nums = {69, 420, 69420, 42069, 6};
        System.out.println(firstLast6(nums));
    }
}
