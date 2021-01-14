package homework;

public class Loops {
    public static void main(String[] args) {
        String quote = "I have never let my schooling interfere with my education.";
        int len = quote.length();
        for(int i = 0; i < len; ++i) {
            String part = quote.substring(i, i+1);
            if(part.equals(" ")) {
                part.replace(" ", "");
            }
            System.out.print(part);
        }

    }
}
