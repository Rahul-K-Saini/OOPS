public class Main{
    public static void main(String[] args) {
        Child obj = new Child(100,2,2,"The SI is ");
        obj.displaySI();
    }

}
class Child extends Parent {
    String message;
   Child(int p, int r, int t,String msg) {
          super(p,r,t);
          this.message = msg;
    }
    void displaySI(){
        System.out.println(message + SI(p, r, t));
    }

}
class Base{
    int p;
    int r;
    int t;
   
    Base(int p,int r,int t){
        this.p = p;
        this.r = r;
        this.t =t;
    }
}
class Parent extends Base{

    Parent(int p, int r, int t) {
        super(p, r, t);
    }
    double SI(int p,int r,int t){
        double si = (p*r*t)/100;
        return si;
    }
    
}
