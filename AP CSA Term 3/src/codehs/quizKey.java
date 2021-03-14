package codehs;
import java.util.Scanner;
public class quizKey {
    public static final Scanner in = new Scanner(System.in);
    public static void gradeQuiz() {
        int numQuestions = in.nextInt();
        int[] key = new int[numQuestions];
        for(int i = 0; i < key.length; ++i) {
            key[i] = in.nextInt();
        }

        int numCorrect = 0;
        for(int j = 0; j < numQuestions; ++j) {
            int answer = in.nextInt();
            if(answer == key[j])
                ++numCorrect;
        }

        System.out.println(numCorrect);
        System.out.println((double) (numCorrect * 100/numQuestions) + "%");
    }

    public static void main(String[] args) {
        boolean cont = true;
        while(cont) {
            gradeQuiz();
            String yn = in.nextLine();
            if(yn.equals("n")) {
                cont = false;
                System.exit(0);
            }
        }
    }
}
