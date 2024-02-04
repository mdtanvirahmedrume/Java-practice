import static java.lang.Long.sum;
public class Variable_Arguments {
        static int sum(int...arri)
        {
            int result = 0;
            for (int a:arri){
                result += a;  //result = result + a;

            }
            return result;
        }
    public static void main(String[] args) {
        System.out.println("Wellcome to Varargs Tutorial..!");
        System.out.println("The sum of 4 and 5: " + sum(4, 5));
        System.out.println("The sum of 4, 5 and 3: " + sum(4, 5, 3));
        System.out.println("The sum of 4,0,6,7, and 5: " + sum(4, 5, 0, 6, 7));
    }
}
