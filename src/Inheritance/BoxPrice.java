package Inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(double w,double h,double l,double weight,double price){
//        super(l,h,w,weight);
        this.price = price;
    }
}