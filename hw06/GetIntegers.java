//Siyi Feng
//Homework 06
//GetIntegers Program
/*This program asks user 
to input 6 non-negative integer 
and print out each one and the sum*/
//
//import a scanner
import java.util.Scanner;
//define a class
public class GetIntegers{
    public static void main(String[] args){
        //define and construct a scanner
        Scanner myScanner=new Scanner(System.in);
        int zero=0;
        int sum;
        System.out.println("Please enter 5 non-negative integers:");
        
        //to ask for a input 5 times
        for(int i=1;i<=5;i++){
            
            //look for next input integer, if it is true execute the rest 
            if(myScanner.hasNextInt()){
                
                //input an integer
                sum=myScanner.nextInt();
                
                    if(sum>=0){
                        zero=zero+sum;//equation of cumulated non-negrative integers
                        //if the fifth input have been inputed, print out result
                        if(i==5){
                            System.out.println("Sum is "+zero);
                        }//end of if
                    }//end of if
                    
                    //if the inputted integer is less than 0, print out error
                    else{
                        System.out.println("Invalid input, enter again");
                        //if the fifth input have been inputed, print out result
                        if(i==5){
                            System.out.println("Sum is "+zero);    
                        }//end of if
                    }//end of else 
            }//end of if 
            
            //if the input is not intger print out error
            else{
                System.out.println("Invalid input, enter again");
                //if the fifth input have been inputed, print out result
                if(i==5){
                        System.out.println("Sum is "+zero);  
                        break;
                }//end of if
                //finds and returns the next complete token from this scanner
                myScanner.next();
            }//end of else 
            
        }//end of for loop  
    }//end of method
    
}//end of class

