package Universitet;

public class Test {
    public static void main(String[] args) {
        Subject math = new Subject();
        math.name = "Mathematics";
        math.id = 1;
        math.lecturer = "Petrov";

        Student student = new Student();
        student.name = "Ivan";
        student.recordBookNumber = 123;

        University university = new University();
        university.addSubject(math);

        university.enrollInCourse(student, math);
        student.displaySubjects();

        university.unenrollFromCourse(student, math);
        student.displaySubjects();
    }
}
