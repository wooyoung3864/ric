package classwork;
import java.util.Scanner;
public class CitationGenerator {
		public static void main(String[] args)
		{
				Scanner in = new Scanner(System.in);
				
				System.out.println("Enter the author's name as 'Last name, First name' : ");
				String name = in.nextLine();
							
				System.out.println("Enter the title of the book: ");
				String title = in.nextLine();
				
				System.out.println("Enter the publisher of the book: ");
				String publisher  = in.nextLine();
				
				System.out.println("Enter the year the book was published: ");
				int year = in.nextInt();
				
				System.out.println(name + ", " + title + ".");
				System.out.println(publisher + ", " + year + ".");
				
				in.close();				
		}
}
