// Siyi Feng
// Homework 4
// Banking Program
/* This program generates a random number from 1000 t0 5000 
and ask for choosing operation option of deposting, withdrawing, 
viewing account and output account balance
*/
// import a scanner
import java.util.Scanner;
// define a class
public class Banking{
    // define a method
    public static void main(String[] args){
        //declare a scanner
        Scanner myScanner;
        // construct a scanne
        myScanner = new Scanner(System.in);
        // declare a double randomly generated in the range of 1000 and 5000
        Double randomAmount = (double) ((Math.random()*(5000-1000))+1000);
        System.out.println("Welcome to your bank account!");
        // state the account balance
        System.out.println("Your account balance: $"+randomAmount);
        
        // list of operations
        System.out.println("Choose one of the following operations:");
        System.out.println("1.Depositing Money"); // operation 1
        System.out.println("2.Withdrawing Money"); // operation 2
        System.out.println("3.Viewing Balace"); // operation 3
        // asking for the choice of operation
        System.out.println("What is your choice? (Choose the operation by enter 1,2, or 3.)");
        // declare an integer
        String choice = myScanner.next();
        // declare a double
        double accountBalance;
        
        // if the user chooses to deposit
        if(choice.equals("1")){
            // asking how many dollars the uesr wants to deposit
            System.out.print("How many dollar(s) do you want to deposit? $");
            // declare a double
            double deposit = myScanner.nextDouble();
            // if the user enter a postive number to deposit
            if(deposit > 0){ 
                // new amount in account
                accountBalance = (randomAmount + deposit);
                System.out.println("Your Account balance is: $"+accountBalance);
            } // end of if
            
            // if the user does not enter a postive number
            else{
                System.out.print("Please, enter a postive number.");
            }
        } // end of else if 1
        
        // if the user chooses to withdraw amount
        else if(choice.equals("2")){
            // asking how many dollars the uesr wants to deposit
            System.out.print("How many dollar(s) do you want to withdraw? $");
            // declare a double
            double withdraw = myScanner.nextDouble();
            
            // if there are not enough amount in the user's account
            if(withdraw > randomAmount){
                System.out.print("You DO NOT have enough amount in your account.");
            }
            // if the user enter a postive number to withdraw less than the account balance
            else if(((withdraw) <= (randomAmount)) && (withdraw > 0)){ 
                // new amount in account
                accountBalance = (randomAmount - withdraw);
                // print the account balance
                System.out.println("Your Account balance is: $"+accountBalance);
            }
            // if the user enters a not positive number
            else{
                System.out.println("Please, enter a positve number.");
            }
        } // end of else if 2
        
        // if the user chooses to view the account balance only
        else if(choice.equals("3")){
            // state the account balance
            System.out.println("Your account balance: $"+randomAmount);
        } // end of else if 3
        
        // if the user enters stuffs other than 1, 2, and 3
        else{
            System.out.println("Please, only enter 1, 2, and 3.");
         }
        
    } // end of the method
    
} // end of the class



