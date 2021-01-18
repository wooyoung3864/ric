package classwork;

public class Loops {
    public static final String quote = "I have never let my schooling interfere with my education.";
    public static final int len = quote.length();
    public static void main(String[] args) {
        countAs(quote);
        countMys(quote);
        skipEveryOtherChar(quote);
        withoutSpaces(quote);
        reverse(quote);
        reverseSB(quote);
    }

    public static void countAs(String quote) {
        int aCount = 0;
        for(int i = 0; i < len; ++i) {
            String part = quote.substring(i, i +1);
            if(part.equals("a")) {
                ++aCount;
            }
        }
        System.out.println(aCount);
    }

    public static void countMys(String quote) {
        int myCount = 0;
        for(int i = 0; i < len - 1; ++i) {
            String part = quote.substring(i, i + 2);
            if(part.equals("my")) {
                ++myCount;
            }
        }
        System.out.println(myCount);
    }

    public static void skipEveryOtherChar(String quote) {
        for(int i = 0; i <= len - 1; i+=2) {
            String part = quote.substring(i, i+1);
            System.out.print(part);
        }
        System.out.println();
    }

    public static void withoutSpaces(String quote) {
        String word = "";
        for(int i = 0; i < len; ++i) {
            String part = quote.substring(i, i+1);
            if(part.equals(" ")) {
                word += "";
            } else {
                word += part;
            }
        }
        System.out.println(word);
    }

    public static void reverse(String quote) {
        String word = "";
        for(int i = len; i > 0; --i) {
            word +=quote.substring(i-1, i);
        }
        System.out.println(word);
    }

    public static void reverseSB(String quote) {
        StringBuilder sb = new StringBuilder();
        sb.append(quote);
        sb.reverse();
        String word = sb.toString();
        System.out.println(word);
    }
}
