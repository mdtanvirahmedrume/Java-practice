import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("User INPUT Process....!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many subject you Have: ");
        int sub = scanner.nextInt();
        int totalmarks = 0;
        int marks = 0;
        for (int i = 0; i < sub; i++) {
            System.out.println("Enter Your Marks " + (i + 1) + ": ");
             marks = scanner.nextInt();
        }
        System.out.println("Total marks: " + (totalmarks += marks));
        System.out.println("The percentage of Marks: "+ ((double)totalmarks/sub));
    }
}