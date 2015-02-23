//Siyi Feng
//Feburary 21th 2015
//Homework 5
//ToHex Program
/*This program ask inputs of three numbers 
with the range of 0-255 and convert the 
number from binary to hexadecimal*/
// import a scanner 
import java.util.Scanner;
// define a class
public class ToHex{
    // define a method 
    public static void main(String[] args){
        // declare a scanner
        Scanner myScanner=new Scanner(System.in);
        // ask for three integers from 0 to 255
        System.out.println("Please enter three numbers representing RGB values:");    
    
    // check whether the inputs are integers
    if(myScanner.hasNextInt()){
        
        // declare variables
        int red=myScanner.nextInt();
        int green=myScanner.nextInt();
        int blue=myScanner.nextInt();
        int redResult, redRemainder,greenResult,greenRemainder,blueResult,blueRemainder;
        
        // calculate results of division and remainders
        redResult=red/16;
        redRemainder=red%16;
        greenResult=green/16;
        greenRemainder=green%16;
        blueResult=blue/16;
        blueRemainder=blue%16;
        
        // print out the statements
        System.out.print("The decimal numbers R:"+red+", G:"+green+", B:"+blue+", is represented in hexadecimal as: ");
        
        // if all the numbers are within the range
        if(red>=0 && red<=255 && green>=0 && green<=255 && blue>=0 && blue<=255){    
        
        // switch statement for the result of dividng the red number by 16 
        // if the result is 1-9 then print out 1-9 and if the result is 10-15 then print out A-F 
        switch(redResult){
        case 1:
            System.out.print("1");
            break;
        case 2:
            System.out.print("2");
            break;
        case 3:
            System.out.print("3");
            break;
        case 4:
            System.out.print("4");
            break;
        case 5:
            System.out.print("5");
            break;
        case 6:
            System.out.print("6");
            break;
        case 7:
            System.out.print("7");
            break;
        case 8:
            System.out.print("8");
            break;
        case 9:
            System.out.print("9");
            break;
        case 10:
            System.out.print("A");
            break;
        case 11:
            System.out.print("B");
            break;
        case 12:
            System.out.print("C");
        case 13:
            System.out.print("D");
            break;
        case 14:
            System.out.print("E");
            break;
        case 15:
            System.out.print("F");
            break;
        
        }
        //switch statement for the remainder of dividing the number by 16
        // if the result is 1-9 then print out 1-9 and if the result is 10-15 then print out A-F 
        switch(redRemainder){
        case 1:
            System.out.print("1");
            break;
        case 2:
            System.out.print("2");
            break;
        case 3:
            System.out.print("3");
            break;
        case 4:
            System.out.print("4");
            break;
        case 5:
            System.out.print("5");
            break;
        case 6:
            System.out.print("6");
            break;
        case 7:
            System.out.print("7");
            break;
        case 8:
            System.out.print("8");
            break;
        case 9:
            System.out.print("9");
            break;
        case 10:
            System.out.print("A");
            break;
        case 11:
            System.out.print("B");
            break;
        case 12:
            System.out.print("C");
        case 13:
            System.out.print("D");
            break;
        case 14:
            System.out.print("E");
            break;
        case 15:
            System.out.print("F");
            break;
        
        }
        
        // switch statement for the result of dividing the green number by 16
        // if the result is 1-9 then print out 1-9 and if the result is 10-15 then print out A-F 
        switch(greenResult){
        case 1:
            System.out.print("1");
            break;
        case 2:
            System.out.print("2");
            break;
        case 3:
            System.out.print("3");
            break;
        case 4:
            System.out.print("4");
            break;
        case 5:
            System.out.print("5");
            break;
        case 6:
            System.out.print("6");
            break;
        case 7:
            System.out.print("7");
            break;
        case 8:
            System.out.print("8");
            break;
        case 9:
            System.out.print("9");
            break;
        case 10:
            System.out.print("A");
            break;
        case 11:
            System.out.print("B");
            break;
        case 12:
            System.out.print("C");
        case 13:
            System.out.print("D");
            break;
        case 14:
            System.out.print("E");
            break;
        case 15:
            System.out.print("F");
            break;
        
        }
        // switch statement fo rthe remainder of dividing the green number by 16
        // if the result is 1-9 then print out 1-9 and if the result is 10-15 then print out A-F 
        switch(greenRemainder){
        case 1:
            System.out.print("1");
            break;
        case 2:
            System.out.print("2");
            break;
        case 3:
            System.out.print("3");
            break;
        case 4:
            System.out.print("4");
            break;
        case 5:
            System.out.print("5");
            break;
        case 6:
            System.out.print("6");
            break;
        case 7:
            System.out.print("7");
            break;
        case 8:
            System.out.print("8");
            break;
        case 9:
            System.out.print("9");
            break;
        case 10:
            System.out.print("A");
            break;
        case 11:
            System.out.print("B");
            break;
        case 12:
            System.out.print("C");
        case 13:
            System.out.print("D");
            break;
        case 14:
            System.out.print("E");
            break;
        case 15:
            System.out.print("F");
            break;
        
        }
        
        // switch statement for the result of dividing the blue number by 16
        // if the result is 1-9 then print out 1-9 and if the result is 10-15 then print out A-F 
        switch(blueResult){
        case 1:
            System.out.print("1");
            break;
        case 2:
            System.out.print("2");
            break;
        case 3:
            System.out.print("3");
            break;
        case 4:
            System.out.print("4");
            break;
        case 5:
            System.out.print("5");
            break;
        case 6:
            System.out.print("6");
            break;
        case 7:
            System.out.print("7");
            break;
        case 8:
            System.out.print("8");
            break;
        case 9:
            System.out.print("9");
            break;
        case 10:
            System.out.print("A");
            break;
        case 11:
            System.out.print("B");
            break;
        case 12:
            System.out.print("C");
        case 13:
            System.out.print("D");
            break;
        case 14:
            System.out.print("E");
            break;
        case 15:
            System.out.print("F");
            break;
        
        }
        // switch statement for the remainder of dviding teh blue number by 16
        // if the result is 1-9 then print out 1-9 and if the result is 10-15 then print out A-F 
        switch(blueRemainder){
        case 1:
            System.out.print("1");
            break;
        case 2:
            System.out.print("2");
            break;
        case 3:
            System.out.print("3");
            break;
        case 4:
            System.out.print("4");
            break;
        case 5:
            System.out.print("5");
            break;
        case 6:
            System.out.print("6");
            break;
        case 7:
            System.out.print("7");
            break;
        case 8:
            System.out.print("8");
            break;
        case 9:
            System.out.print("9");
            break;
        case 10:
            System.out.print("A");
            break;
        case 11:
            System.out.print("B");
            break;
        case 12:
            System.out.print("C");
        case 13:
            System.out.print("D");
            break;
        case 14:
            System.out.print("E");
            break;
        case 15:
            System.out.print("F");
            break;
        
        }
        
    }
        // else print out the statement asking for values with valid numbers
        else{
            System.out.println("Sorry, you must enter values between 0-255.");
        }
    }
    // else print out statement asks for integer inputs
    else {
        System.out.println("Sorry, your input must consist of integers.");
    }
   
    
    }
}
