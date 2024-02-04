public class Methods_Java {
    int logic(int a, int b){
        int c;
        if (a>b){
            c = a + b;
        }else {
            c = (a+b) * 2;
        }
        return c;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c;
        Methods_Java obj = new Methods_Java();
        c = obj.logic(a,b);
        int a1 = 3;
        int b1 = 4;
        int c1;
        c1 = obj.logic(a1, b1);
        System.out.println("C: " + c);
        System.out.println("C1: " + c1);
    }
}
