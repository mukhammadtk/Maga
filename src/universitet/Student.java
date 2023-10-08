package Universitet;

public class Student {
    String name;
    int recordBookNumber;
    Subject[] subjects = new Subject[3];  // each student can study up to 3 subjects

    // Method to add a subject to the list
    void addSubject(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                return;
            }
        }
        System.out.println("Student is already studying 3 subjects!");
    }

    // Method to remove a subject from the list
    void removeSubject(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == subject) {
                subjects[i] = null;
                return;
            }
        }
    }

    // Method to display the list of subjects
    void displaySubjects() {
        System.out.println("Student " + name + " is studying:");
        for (Subject subject : subjects) {
            if (subject != null) {
                subject.display();
            }
        }

    }
}
