package classwork.implementingArrays;

public class ClassroomTester {
    public static void main(String... args) {
        Student ric = new Student("Ric", "Jung", 12);
        Student steph = new Student("Steph", "Cho", 9);

        Classroom classroom = new Classroom(2);

        classroom.addStudent(ric);
        classroom.addStudent(steph);
        classroom.printStudents();

        ric.addExamScore(69);
        ric.addExamScore(85);
        ric.addExamScore(97);

        steph.addExamScore(4);
        steph.addExamScore(55);
        steph.addExamScore(71);

        System.out.println(ric.getExamRange());
        System.out.println(steph.getExamRange());

        System.out.println();

        System.out.println("The most improved students is: " + classroom.getMostImprovedStudent().getName());
    }
}
