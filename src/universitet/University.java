package Universitet;

public class University {
    Subject[] availableSubjects = new Subject[10];  // just for demonstration, a limit of 10 subjects is set

    // Method to add a subject
    void addSubject(Subject subject) {
        for (int i = 0; i < availableSubjects.length; i++) {
            if (availableSubjects[i] == null) {
                availableSubjects[i] = subject;
                return;
            }
        }
    }

    // Method to remove a subject
    void removeSubject(Subject subject) {
        for (int i = 0; i < availableSubjects.length; i++) {
            if (availableSubjects[i] == subject) {
                availableSubjects[i] = null;
                return;
            }
        }
    }

    // Method to enroll a student in a course
    void enrollInCourse(Student student, Subject subject) {
        student.addSubject(subject);
    }

    // Method to unenroll a student from a course
    void unenrollFromCourse(Student student, Subject subject) {
        student.removeSubject(subject);
    }
}

