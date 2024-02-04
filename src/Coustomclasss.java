class employee{
    int id;
    String name;
    public void emDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My Name is: "+name);
    }
}
public class Coustomclasss {
    public static void main(String[] args) {
        System.out.println("***** This is our coustom class *****");
        employee tanvir = new employee();
        employee rumi = new employee();
         tanvir.id = 12;
         tanvir.name = "Tanvir ahmed";
         rumi.id = 113;
         rumi.name = "Rumi";

         tanvir.emDetails();
         rumi.emDetails();
//        System.out.println(tanvir.id);
//        System.out.println(tanvir.name);
    }
}
