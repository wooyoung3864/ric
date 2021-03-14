package classwork;
import java.util.Arrays;
public class Vocab {
    private String[] theVocab;

    public Vocab(String[] theVocab) {
        this.theVocab = theVocab;
    }

    public boolean findWord(String str) {
        for(int i = 0; i < theVocab.length; ++i) {
            if(theVocab[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int countNotInVocab(String[] wordArray) {
        int count = 0;
        for(int i = 0; i < wordArray.length; ++i) {
            String str = wordArray[i];
            if (!findWord(str)) {
                ++count;
            }
        }
        return count;
    }

    public String[] notInVocab(String[] wordArray) {
        String[] notArray = new String[countNotInVocab(wordArray)];
        for(int i = 0; i < wordArray.length; ++i) {
            String str = wordArray[i];
            if (!findWord(str)) {
                for(int j = 0; j < notArray.length; ++j) {
                    notArray[j] = wordArray[i-j];
                }
            }
        }
        return notArray;
    }



    public static void main(String[] args) {
        String[] testArray = {"time", "food", "dogs", "cats", "health", "plants", "sports"};
        String[] wordArray = {"dogs", "toys", "sun", "plants", "time"};
        Vocab test = new Vocab(testArray);
        System.out.println(test.findWord("nice"));
        System.out.println(test.countNotInVocab(wordArray));
        String[] notArray = test.notInVocab(wordArray);
        System.out.println(Arrays.toString(notArray));
    }
}