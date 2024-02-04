class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getID(){
        return id;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee myEmployee = new MyEmployee();
        myEmployee.setName("Tanvir Ahmed");
        System.out.println("My Name is: "+ myEmployee.getName());
        myEmployee.setId(10);
        System.out.println("My id is: "+ myEmployee.getID());
    }
}
