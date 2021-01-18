package classwork;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Student 1's name: ");
		String studentName = in.nextLine();
		Student student1 = new Student(studentName);
		System.out.println("Enter " + student1.getName() + "'s score for test1.");
		int firstx = in.nextInt();
		System.out.println("Enter " + student1.getName() + "'s score for test2.");
		int secondx = in.nextInt();
		student1.inputGrades(firstx, secondx);
		System.out.println();
		System.out.println(student1);
		
		System.out.println();
		
		System.out.println("Enter Student 2's name: ");
		String student2Name = in.next();
		Student student2 = new Student(student2Name);
		System.out.println("Enter " + student2.getName() + "'s score for test1.");
		int thirdx = in.nextInt();
		System.out.println("Enter " + student2.getName() + "'s score for test2.");
		int fourthx = in.nextInt();
		student2.inputGrades(thirdx, fourthx);
		System.out.println();
		System.out.println(student2);
		
		in.close();
	}
}
