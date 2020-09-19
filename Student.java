import java.util.Scanner;

public class Student {

    private String first_name;
    private String last_name;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    Scanner in = new Scanner(System.in);

    // Constructor: prompt user to enter student's name and year
    public Student() {
        System.out.print("Enter student first name: ");
        this.first_name = in.next();
        System.out.print("Enter student last name: ");
        this.last_name = in.next();
        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter courses to enroll ('Q' to quit): ");
            String course = in.nextLine();
            if (course.equals("Q") || course.equals("q")) {
                break;
            }
            courses = courses + "\n  " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        } while (true);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment $: ");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show info about student
    public String showInfo() {
        return "Name: " + first_name + " " + last_name +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + tuitionBalance;
    }
}
