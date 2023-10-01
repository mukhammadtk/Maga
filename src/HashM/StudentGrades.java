package HashM;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        Map< Student , Integer> studentGrades = new HashMap<>();
        studentGrades.put(new Student("Dima" , 1), 80);
        studentGrades.put(new Student("Tanya" , 2) , 90);
        studentGrades.put(new Student("Imba" , 3) , 100);
        System.out.println(calculateAverageGrade(studentGrades));
    }
    public static int calculateAverageGrade(Map<Student , Integer> studentGrades){
        int totalGrades = 0;
        for(int grade : studentGrades.values()){
            totalGrades += grade;

        }return totalGrades / studentGrades.size();
    }

}


