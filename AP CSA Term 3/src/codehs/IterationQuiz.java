package codehs;

public class IterationQuiz {
    public static void main(String[] args) {
        IterationQuiz ric = new IterationQuiz();

        ric.funWithNumbers(314159);
        System.out.println(ric.someMethod(3,1));
        ric.patternGrid(3, 4, '#');
        System.out.println(ric.mystery("Lunchbox", 4));
        ric.counter();
        ric.pyramid();
        ric.printWord();
        ric.mix("Hippopotamus", "p");
    }
    public int someMethod(int x, int y)
    {
        int sum = 0;
        while (x < 10)
        {
            sum += x % y;
            x++;
            y++;
        }
        return sum;
    }

    public void funWithNumbers(double myDouble)
    {
        int myInt = (int) myDouble;
        String myString = "";
        while(myInt != 0)
        {
            myString = myInt % 10 + myString;
            myInt /= 10;
        }
        System.out.println(myString);
    }

    public void patternGrid(int rows, int columns, char symbol)
    {
        for(int m = 0; m < rows; m++)
        {
            for(int n = 0; n < columns; n++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public String mystery(String word, int index)
    {
        String result = "";
        for(int i = word.length()- 1; i > index; i--)
        {
            result += word.substring(i, word.length());
        }
        return result;
    }

    public void counter() {
        int x = 10;
        int y = 2;
        int count = 1;
        while(x > y)
        {
            x /= y;
            count++;
        }
        System.out.println(count);
    }

    public void pyramid() {
        int p = 5;
        while(p > 0)
        {
            for(int j = p; j < p*2; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            p--;
        }
    }

    public void printWord() {
        String word = "Cafeteria";
        for(int i = -1; i < word.length(); i+=2)
        {
            System.out.print(word.substring(i+1,i+2) + " ");
        }
        System.out.println();
    }

    public void mix(String word, String letter)
    {
        int counter = 0;
        while(word.indexOf(letter) > 0)
        {
            if(word.substring(counter,counter + 1).equals(letter))
            {
                word = word.substring(0, counter) + "0"
                        + word.substring(counter +2, word.length());
            }
            counter++;
        }
        System.out.println(word);
    }
}

