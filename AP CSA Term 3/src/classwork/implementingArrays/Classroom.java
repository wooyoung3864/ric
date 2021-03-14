package classwork.implementingArrays;

public class Classroom {
    Student[] students;
    int numStudentsAdded;

    public Classroom(int numStudents) {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }

    public void addStudent(Student name) {
        students[numStudentsAdded] = name;
        ++numStudentsAdded;
    }

    public void printStudents() {
        for(Student stud : students) {
            System.out.println(stud);
        }
    }

    public Student getMostImprovedStudent() {
        int highestScore = students[0].getExamRange();
        int score = 0;
        Student mostImprovedStudent = students[0];

        for(int i = 0; i < students.length; ++i) {
            if(score > highestScore) {
                highestScore = score;
                mostImprovedStudent = students[i];
            }
        }
        return mostImprovedStudent;
    }
}
