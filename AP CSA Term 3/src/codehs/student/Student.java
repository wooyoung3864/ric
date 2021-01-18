package codehs.student;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    public Student(String fName, String lName, int gLevel, String mySchool)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = gLevel;
        school = mySchool;
    }

    public Student(String fName, String lName, int gLevel)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = gLevel;

        if(gLevel >= 9 && gLevel <= 12){
            school = "high school";
        }
        if(gLevel >= 6 && gLevel <= 8){
            school = "middle school";
        }
        if(gLevel >= 1 && gLevel <= 5)
        {
            school = "elementary school";
        }
    }

    public String getFirstName()
    {
        return firstName;
    }


    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school + ".";
    }

}
