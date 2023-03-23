package Inheritance;

public class Box {
    double w;
    double l;
    double h;

    public Box() {
        this.l = 1;
        this.h = 1;
        this.w = 1;
    }
    public Box(double l,double h,double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    public Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

}
