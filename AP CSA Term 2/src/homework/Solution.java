package homework;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
     //  hh:mm:ssAM or hh:mm:ssPM
    static String timeConversion(String s) {
        String t;
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3,5));
        int second = Integer.parseInt(s.substring(6,8));
        String meridiem = s.substring(8,10);
        
        if(meridiem.equals("PM") && hour != 12) {
        	hour += 12;
        }else if(meridiem.equals("AM") && hour == 12) {
        	hour -= 12;
        }
        
        t = String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
        return t;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
