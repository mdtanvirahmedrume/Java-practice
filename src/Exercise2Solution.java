import java.util.Scanner;
import java.util.Random;
public class Exercise2Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int UserInput = scanner.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        if (UserInput == ComputerInput){
            System.out.println("Draw");
        } else if (UserInput == 0 && ComputerInput == 2 || UserInput == 1 && ComputerInput == 0 || UserInput == 2 && ComputerInput == 1) {
            System.out.println("You Are win..!");
        }else {
            System.out.println("Computer win..!");
        }
        System.out.println("Computer Choice: " + ComputerInput);
    }
}
