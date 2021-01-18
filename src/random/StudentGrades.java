package random;
import java.util.Scanner;
public class StudentGrades
{
    public static void main(String[]args)
    {
    	
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your grades: ");
        int grade = in.nextInt();
        String letterGrade = getLetterGrade(grade);
        System.out.println(letterGrade);
        in.close();
    }
    
    public static String getLetterGrade(int grade)
    {
      String letterGrade = "F";
      if (grade >= 90 && grade <= 100)
      {
          letterGrade = "A";
      }
      else if (grade >= 80 && grade < 90)
      {
          letterGrade = "B";
      }
      else if (grade >= 70 && grade < 80)
      {
          letterGrade = "C";
      }
      else if (grade >= 60 && grade < 70)
      {
          letterGrade = "D";
      }
      else if (grade >= 0 && grade < 60)
      {
          letterGrade = "F";
      }
      return letterGrade;
    }
}