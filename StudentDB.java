import java.util.Scanner;

public class StudentDB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many of new students to enroll: ");
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];  // Creating an array of new students

        for (int n = 0; n < numOfStudents; n++) { // Creating of new students
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
            System.out.println("");
        }
    }
}
