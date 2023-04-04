package ClassAssignments;

import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance,pin,amount,EnteredPin,i=2,n;
        pin = 1234;
        balance = 5000;
        System.out.print("Enter Your Pin Number:  ");
        EnteredPin = in.nextInt();
        while(EnteredPin!=pin && i>0){
            System.out.println("Wrong Pin Number "+ i + " Chances Remaining");
            System.out.print("Enter Your Pin Number:  ");
            EnteredPin = in.nextInt();
            i--;
        }
        if(i==0){
            System.out.println("You have entered Wrong Pin 3 times");
            System.out.println("ATM Blocked ! Contact Your Nearest Branch");
            System.out.println("Thank you for using SBI bank! Have a good day");
            System.exit(0);
        }
        System.out.println("    *******Welcome to SBI Bank******");
        System.out.print("Press 1 for Balance Check or Press 2 For withdraw: ");
        n = in.nextInt();
        if(n==1){
            System.out.println("Your Balance is "+ balance);
            System.out.println("Thank you for using SBI bank! Have a good day");
        } else if (n==2) {
            System.out.print("Enter the amount you want to withdraw: ");
            amount = in.nextInt();
            if(amount>balance){
                System.out.println("Insufficient Amount Entered");
                System.exit(0);
            }
            System.out.println("!!!! Collect Your Money !!!!");
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Money Withdraw Successful");
            System.out.println("Remaining Balance = " + (balance - amount));
            System.out.println("Thank you for using SBI bank! Have a good day");
        }

    }
}
