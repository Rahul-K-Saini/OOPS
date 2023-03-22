package ClassAssignments; // Package (Folder Name)

import java.util.Scanner; // Importing utility Class Scanner to take input from user

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Creating the object of Scanner Class
        Ternary even = new Ternary(); // And an object of Ternary Class // Here the object name is even to check if no. is even
        System.out.print("Enter a number to check if its Even or Odd: ");
        even.num = in.nextInt(); //Assigning the user  input value to the Instance variable
        String res = (even.num%2 == 0 || even.num ==0 ) ? "Even" : "Odd"; // use of Ternary operator to print Even or Odd
        System.out.println(res);
        Ternary vote = new Ternary(); // New object of Ternary Class called vote for eligibility of candidate to vote
        System.out.print("Please Enter your age: ");
        vote.age = in.nextInt(); // Same Taking input of their age from user
        System.out.println((vote.age>=18) ? "You can vote": "You can't vote");

    }
}
