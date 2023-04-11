package ClassAssignments;

import java.util.Scanner;

class Messages{
    static String goodbye = "# Thank you for using SBI bank! Have a good day #";
    static String welcome = "    ******* Welcome to SBI Bank ******     ";
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long balance,amount;
        int pin,EnteredPin,i=2,n;
        pin = 1234;
        balance = 50000;
        System.out.println(Messages.welcome);
        System.out.print("Enter Your Pin Number:  ");
        EnteredPin = in.nextInt();
        while(EnteredPin!=pin && i>0){
            System.out.println("Wrong Pin Number "+ i + " Chances Remaining");
            System.out.print("Enter Your Pin Number:  ");
            EnteredPin = in.nextInt();
            i--;
        }
        if(i<=0){
            System.out.println("You have entered Wrong Pin 3 times");
            System.out.println("ATM Blocked ! Contact Your Nearest Branch");
            System.out.println(Messages.goodbye);
            System.exit(1);
        }
        System.out.print("Press 1 for Balance Check or Press 2 For withdraw: ");
        n = in.nextInt();
        if(n==1){
            System.out.println("Your Balance is "+ balance);
            System.out.println(Messages.goodbye);
        } else if (n==2) {
            System.out.print("Enter the amount you want to withdraw: ");
            amount = in.nextInt();
            if(amount>balance){
                System.out.println("Insufficient Amount Available");
                System.out.println("Check your Bank Balance and Try Again");
                System.exit(1);
            }
            System.out.print("Transaction in Progress");
            for (int j = 0; j < 5; j++) {
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.print(" . ");
            }
            System.out.println();
            System.out.println("!!!! Collect Your Money !!!!");
            System.out.println();
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Money Withdraw Successful");
            System.out.println("Remaining Balance = " + (balance - amount));
            System.out.println(Messages.goodbye);
        }

    }
}

