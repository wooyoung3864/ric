package codehs.student;

public class StudentTester {
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        SchoolClub gayClub = new SchoolClub(alan, "Gay", 69);
        SchoolClub methClub = new SchoolClub(ada, "Meth", 420);

        System.out.println(alan);
        System.out.println(gayClub);
        System.out.println(ada);
        System.out.println(methClub);
    }
}
