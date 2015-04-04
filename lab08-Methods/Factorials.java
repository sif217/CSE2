//Siyi Feng
//Lab 08
//This program includes three methods and shows different out put
//
//import a scanner
import java.util.Scanner;
//
public class Factorials{
public static void main (String [] args){
    System.out.println("Enter a integer:");
    Scanner scan=new Scanner(System.in);
    int input=scan.nextInt();
    int result=0;
    for(int i=1;i<=input;i++){
        result+=factorial(i);
    }
    print(input,result);
}//end of the main method

public static int factorial(int c){
    int o=1;
    for(int j=1;j<=c;j++){
    o*=j;
    }
    System.out.println(o);
    return o;
}//end of the factorial method

public static void print(int a, int b){
    System.out.println("The super factorial of "+a+" is "+b);
}//end of the print method 
}//end of class
