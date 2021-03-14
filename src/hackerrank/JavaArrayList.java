package hackerrank;
import java.io.*;
import java.util.*;

public class JavaArrayList {
    public static final Scanner in = new Scanner(System.in);
    public static ArrayList<ArrayList<Integer>> listOfNums = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        int totalSize = in.nextInt();
        for(int i = 0; i < totalSize; ++i) {
            int alSize = in.nextInt();
            //listOfNums.add(new ArrayList<Integer>(alSize));
            ArrayList<Integer> list = new ArrayList();
            for(int j = 0; j < alSize; ++j) {
                list.add(in.nextInt());
            }
            listOfNums.add(list);
        }
        int numQueries = in.nextInt();
        for(int k = 0; k < numQueries; ++k) {
            int row = in.nextInt();
            int col = in.nextInt();

            try {
                System.out.println(listOfNums.get(row-1).get(col-1));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}



