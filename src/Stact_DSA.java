public class Stact_DSA {
        int capacity = 3;
        int[] stack = new int[capacity];
        int top = -1;
        void push(int x){
            if(top<capacity - 1) {
                top = top + 1;
                stack[top] = x;
                System.out.println("Successfull added.. " + x);
            }
            else {
                System.out.print("Exception!.. Stack Over Flow");
            }
        }
        int pop(){
            if (top<0){
                System.out.println("Exception..! Stack Underflow");
                return -1;
            }
            int var = stack[top];
            top = top - 1;
            return stack[top];
        }
        int peek()
        {
            if (top<0){
                System.out.println("Exception..! Stack Underflow");
                return -1;
            }
            return stack[top];

        }

    public static void main(String[] args) {
        System.out.println("Impliment My stack..!");
        Stact_DSA obj = new Stact_DSA();
        obj.peek();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println("Peek Return.." + obj.peek());
        System.out.println("Now Time to call pop>>>!");
        System.out.println("The pop is: " + obj.pop());


    }
}
