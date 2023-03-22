package Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = 2;
    }

    public BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w); // call the parent class constructor
        this.weight = weight;
    }
}

