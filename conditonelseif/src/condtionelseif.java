import java.util.Scanner;

public class condtionelseif {
    public static void main(String[] args) {
        int marks;

        System.out.println("Enter marks");

        Scanner obj = new Scanner(System.in);

        marks = obj.nextInt();
        if (marks >= 60 && marks <= 100) {
            System.out.println("first student");
        } else if (marks > 45 && marks <= 60) {

            System.out.println("second Student");
        } else {
            System.out.println("failed");

        }

    }
}