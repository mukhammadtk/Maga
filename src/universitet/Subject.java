package Universitet;

public class Subject {
    String name;
    int id;
    String lecturer;

    // Method to display subject details
    void display() {
        System.out.println("ID: " + id + " | Subject: '" + name + "' | Lecturer: " + lecturer);
    }
}
