package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Rahul");
//        obj.num; // error
        System.out.println(obj.getnum()); // you can access the private variables by making their get and set functions
        // otherwise you won't hence error above
        obj.setnum(35);
        System.out.println(obj.getnum());
        // as for protected variables you can access them here as we are in the same package but in different package you can't
        System.out.println(obj.name);

    }
}
