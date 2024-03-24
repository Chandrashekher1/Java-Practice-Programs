import java.util.Scanner;

public class Fgrade {
    public Fgrade() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks  :");
        int marks = sc.nextInt();
        Grade(marks);
    }

    static void Grade(int marks) {
        if (marks <= 40) {
            System.out.println("Fail");
        } else if (marks <= 50 && marks > 40) {
            System.out.println("Grade : DD");
        } else if (marks <= 60 && marks > 50) {
            System.out.println("Grade : CD");
        } else if (marks <= 70 && marks > 60) {
            System.out.println("Grade : BC");
        } else if (marks <= 80 && marks > 70) {
            System.out.println("Grade : BB");
        } else if (marks <= 90 && marks > 80) {
            System.out.println("Grade : AB");
        } else if (marks <= 100 && marks > 90) {
            System.out.println("Grade : AA");
        } else {
            System.out.println("Wrong input ");
        }

    }
}