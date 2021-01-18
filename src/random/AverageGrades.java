package random;

import java.util.Scanner;
public class AverageGrades
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter grade: ");
        double grade1 = in.nextInt();
        System.out.println("Enter grade: ");
        double grade2 = in.nextInt();
        System.out.println("Enter grade: ");
        double grade3 = in.nextInt();
        Double averageGrade = (grade1 + grade2 + grade3)/3;
        String letterGrade = getLetterGrade(averageGrade);
        System.out.println(letterGrade);
        in.close();
    }
    
    public static String getLetterGrade(double averageGrade)
    {
      String letterGrade = "F";
      if (averageGrade >= 90 && averageGrade <= 100)
      {
          letterGrade = "A";
      }
      else if (averageGrade >= 80 && averageGrade < 90)
      {
          letterGrade = "B";
      }
      else if (averageGrade >= 70 && averageGrade < 80)
      {
          letterGrade = "C";
      }
      else if (averageGrade >= 60 && averageGrade < 70)
      {
          letterGrade = "D";
      }
      else if (averageGrade >= 0 && averageGrade < 60)
      {
          letterGrade = "F";
      }
      return letterGrade;
    }
}