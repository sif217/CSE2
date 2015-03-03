//Siyi Feng
//Homework 06
//RunFactorial Program
/*This program asks for 
an integer input between 9 to 
16 and print the factorial of it*/
//
//import a scanner
import java.util.Scanner;
//define a class
public class RunFactorial{
    //define a method
    public static void main(String[] args){
        //define and construct a scanner
        Scanner myScanner=new Scanner(System.in); 
        //define the inputted variable and the showed result variable 
        int number;
        int result=1;
        System.out.println("Please enter an integer that is between 9 and 16:");
        //while 
        //define the conditional variable 
        int ture=0;
        
        //infinite while loop until the condition is satisified
        while(ture==0){
            //if the input is an integer, execute the rest
            if(myScanner.hasNextInt()){
                //input an integer 
                number=myScanner.nextInt();
                //declare a number to show the number inputted at first
                int showNumber=number;
                    //if the inputted number is within the range    
                    if(number>=9 && number<=16){
                        //while the inputted number is larger than 1
                        while(number>1){
                            //decrement the inputted number by 1 every loop 
                            --number;
                            /*in the first loop: result=number*(number-1) 
                            in the rest of the loops: result=result*(decremental number-1) 
                            until inputted number becomes 1*/
                            result*=number;
                            
                            //if the number is decremented into 1, calculation is finished
                            if(number==1){
                                //print out result of the fractorial of the inputted number 
                                System.out.println("Input Accepted:");
                                System.out.println(showNumber+"!"+"= "+result);
                                //break both the inter loop and the outer loop 
                                ture=1;
                                break;
                            }//end of if
                        }//end of while
                    }//end of if
                    
                    //print out message when 
                    else{
                        System.out.println("Invalid input, enter again!");
                    }//end of else
        }//end of if 
            
            //if it is not integer print out message 
            else{
            System.out.println("Invalid input, enter again!");
            myScanner.next();
        }//end of else
        }//end of while
    }//end of method
    
}//end of class

