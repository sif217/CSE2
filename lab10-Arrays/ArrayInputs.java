//Siyi Feng
//lab10 
//This program asks user to input the size of an array and input the integer elements of the array 
//
//import a scanner
import java.util.Scanner;
//declare a class
public class ArrayInputs{
    //main method 
    public static void main(String[] args){
        //define a scanner
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        int size=myScanner.nextInt();
       
       
       
       int[] array=new int[size];
       int i=0;
       
       
       for (i=0;i>=0;i++){
           if(i==size){
                    break;
                }
           System.out.print("Please enter a positive integer: ");
           
        if(myScanner.hasNextInt()){
            
            array[i]=myScanner.nextInt();
            
            if(array[i]>0){
                array[i]=array[i];
                
            }
            else{
                System.out.println("Sorry, the number you entered is negative.");
                --i;
                continue;
                 
            }
          
        }
        else{
            System.out.println("Sorry, you didn’t enter an integer.");
            myScanner.next();
            --i;
            continue;
          
        }
       }
       
       
       System.out.println("The array is: ");
       for(i=0;i<size;i++){
           System.out.println(array[i]);
       }
    }//end of the method
}//end of the class

/*
Please enter an integer for the size of an array: 10
Please enter a positive integer: 14.2
Sorry, you didn’t enter an integer.
Please enter a positive integer: -9
Sorry, the number you entered is negative.
Please enter 10 positive integer: 2 9 31 4 56 16 78 3 11 49
*/