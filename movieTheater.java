import java.util.Scanner;

    public class movieTheater {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double age;
    String studentID;
    String day;

    System.out.print("Enter age: ");
    age = input.nextDouble();

    if (age < 12)
    {
    System.out.print("Child Discount");
    }
    else
    {
    if (age <= 18)
    {
    System.out.print("Do you have a student ID? (yes/no): ");
    studentID = input.next();

    if (studentID.equals("yes"))
    {
    System.out.print("Student Discount");
    }
    else
    {
    System.out.print("Full Price");
    }
    }
    else
    {
    System.out.print("Is today Wednesday? (yes/no): ");
    day = input.next();

    if (day.equals("yes"))
    {
    System.out.print("Mid-Week Discount");
    }
    else
    {
    System.out.print("Full Price");
    }
    }
    }
    }
}
