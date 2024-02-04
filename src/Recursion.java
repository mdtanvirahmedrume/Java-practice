public class Recursion {
    static int factorial(int n) {

       if (n == 0 || n ==1){
           return 1;
       }else {
           return n * factorial(n - 1);
       }
    }
    static int factorial_2(int m){
        int pro = 1;
        for (int i = 1; i <= m; i++) {
            pro = pro * i;

        }
        return pro;
    }
    public static void main(String[] args) {
        int r = 5;
        int q = 5;
        System.out.println("The recursion no 1: " + factorial(r));
        System.out.println("The recursion no 2: " + factorial_2(q));
    }
}
