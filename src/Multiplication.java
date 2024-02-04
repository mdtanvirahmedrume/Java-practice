import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "= "+num*i);
        }
    }
}
