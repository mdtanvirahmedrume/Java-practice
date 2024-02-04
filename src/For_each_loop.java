public class For_each_loop {
    public static void main(String[] args) {
        int[] marks = {10,20,24,26,3,7,265,657,67547,35,76,39};
        System.out.println("The length is: "+marks.length);

        System.out.println("** All Marks **");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
