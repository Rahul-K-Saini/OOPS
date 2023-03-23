package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(100);
        Box box2 = new Box(20,23,23);
        BoxWeight box3 = new BoxWeight();
        BoxPrice box4 = new BoxPrice(22,44,56,77,22);
        System.out.println("The super child box price class " + box4.price);
        System.out.println(box.l);
        System.out.println(box1.l);
        System.out.println(box2.l);
        System.out.println(box3.weight +" "+ box3.h);

    }

}
