//Siyi Feng
//Lab 07
//ZigZag Program
/*This program prints out star sign*/
//
//import a scanner
import java.util.Scanner;
//define a class
public class ZigZag{
    public static void main(String[] args){
        
        //question 1 print out "*" as many as the integer as nStar
        int nStar=10;
        int i,j;
        for (i=0;i<nStar;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        //question 2 
        for(i=0;i<nStar;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        
        //question 3
        for (i=0;i<nStar;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        
        
        
        //question 4 
        Scanner myScanner=new Scanner(System.in);//construct a scanner
        
        
        
        int ture=0;
        while(ture==0){
            System.out.print("Enter an int between 3 and 33:");
            if(myScanner.hasNextInt()){
                
                int inputVariable=myScanner.nextInt();
                
            if(inputVariable>=3 && inputVariable<=33){
                for (i=0;i<inputVariable;i++){
                    System.out.print("*");
                }
                 System.out.println("");
                 
                for(i=0;i<inputVariable;i++){
                    if(i==0){
                        System.out.print("");
                    }
                    
                    else{
                    for(j=0;j<i-1;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println("");
                    }
                }
                //end of for
                 
                for (i=0;i<inputVariable;i++){
                    System.out.print("*");
                    
                    if(i==(inputVariable-1)){
                        System.out.println("");
                        System.out.println("Enter y or Y to go again:");
                        String again=myScanner.next();
                        if(again.equals("y") || again.equals("Y")){
                            ture=0;
                            break;
                        }
                        else{
                            ture=1;
                            break;
                        }
                    }
                }
            }
            
            else{
                System.out.print("The number is out of range [3,33]");
            }
            
            }
            
            else{
                System.out.println("The number is out of range [3,33]");
                myScanner.next();
            }
        }//end of while loop
        
            
        
        
    }//end of method
}//end of class

/*import java.util.Scanner. 
Then write a loop(s) that appear above the loops
you wrote above and forces the user to enter 
an int between 3 and 33, storing the int in nStars.
(Recall the Scanner method hasNextInt(). 
Your loop(s) will be controlled by two boolean conditions, 
hasNextInt() and the value of nextInt() being in the range 3-33, 
inclusive.) Below is a sample run of the program and below 
that some comments that provide a framework for writing the code.
*/