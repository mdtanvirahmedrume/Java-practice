import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your age: ");

        a = scanner.nextInt();

        if(a>18){
            System.out.println("Yes, You can Drive.");
        }
        else{
            System.out.println("No, You can't Drive.");
        }
    }
}
