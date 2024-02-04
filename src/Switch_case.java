import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();

        switch (age){
            case 18:
                System.out.println("Your age Going to become Adult.");
                break;
            case 25:
                System.out.println("You are going to become a job.");
                break;
            case 35:
                System.out.println("I Think you have 2 Years Exprieance.");
                break;
            case 55:
                System.out.println("I Think you have 10 Years Exprieance.");
                break;
            default:
                System.out.println("Enjoy your life.");
        }






//        if (age>55){
//            System.out.println("You Are Experinced.");
//        } else if (age>45) {
//            System.out.println("You are Semi_exprinced.");
//        }
//        else {
//            System.out.println("You are Not Exprinced.");
//        }



    }
}
