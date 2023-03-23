import java.util.Random;

public class Classes {
    public static void main(String[] args) {
        Car alto = new Car(120,200000,3.8f,"Alto");
        Car swift = new Car(150,500000,3.8f,"Swift");
        Car AltoLX = new Car(alto);
        System.out.println(AltoLX.price);
        System.out.println("The price of "+swift.model +" is "+ swift.price);
        System.out.println("The price of "+alto.model+ " is " +alto.price);

    }
}
 class Car{
    String model;
    int speed;
    int price;
    float rating;

    /* This is a constructor
    // constructed to make the default function accepts the many arguments
    // Can pass arguments while creating objects
    */
    Car(int speed,int price,float rating, String model){
        this.rating = rating;
        this.model = model;
        this.price = price;
        this.speed = speed;
    }
    // Creating another construct that takes another object as a parameter
     // It overrides the variables values with passed objects
    Car(Car other){
        this.model = other.model;
        this.speed = other.speed;
        this.price = other.price;
        this.rating = other.rating;
    }

}

// Final Keyword

//class random{
//    final int RANDOM_VAL = 30;
//    random(int ran){
//        this.RANDOM_VAL = ran; // HERE IS THE ERROR THAT SAYS THAT YOU CANT MODIFY THE FINAL KEYWORD
//
//    }
//}