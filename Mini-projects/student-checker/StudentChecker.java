import java.util.Scanner;
public class StudentChecker {
    // basic program to check if user is a student or not
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to CCAT student checker");
    
    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Please enter your 5 digit student ID: ");
    int studentId = scanner.nextInt();

    System.out.println("Checking if you are a student...");
    
    if (studentId <10000 || studentId > 99999) {
        System.out.println("Invalid student ID. Please enter a 5 digit student ID.");
    } 
    else {
      System.out.println("Hello " + name + ", with a student ID of " + studentId + ". You are currently enrolled in CCAT.");
    }
    scanner.close();  
    }
}