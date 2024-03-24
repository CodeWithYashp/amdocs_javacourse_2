import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Assignment {
    public static void main(String[] args){
        HashMap<String, Integer> student = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Choose an option:");
            System.out.println("1: Add Student");
            System.out.println("2: Get Student's Score");
            System.out.println("3: Exit...");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter the student's name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the student's score: ");
                    int score = scanner.nextInt();
                    student.put(name, score);
                    break;

                case 2:
                    System.out.println("Please enter student's name to get the score...");
                    String studentname = scanner.nextLine();
                    Integer studentScore = student.get(studentname);
                    if(studentScore != null){
                        System.out.println("Score for " + studentname + " is " + studentScore);
                    }else {
                        System.out.println("Student not found...");
                    }
                    break;

                case 3:
                    System.out.println("Exiting....");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice....Please try again!");
            }
        }
    }
}
