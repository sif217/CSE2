//Siyi Feng
//lab 12
//MultipleArray Program
/*This program asked user to enter 15 integer numbers 
and binear search another input and then shuffle the 
array and then use linear search to search another input*/
//
//import a scanner
import java.util.Scanner;
import java.util.Random;
//define a class
public class MultipleArray{
    //define a method
    public static void main (String []args){
        Scanner myScanner= new Scanner(System.in);
        
        int[][] Array1=increasingMatrix();
        
    }
    
public static int[][] increasingMatrix(){
    import java.util.Scanner;
    System.out.println("Input three variables to indicate the width, height and integer sizes of a matrix");
    int width = myScanner.nextInt();
    int height = myScanner.nextInt();
    System.out.println("true if the matrix is to be generated in row-major representation. It generates a column-major representation of the matrix otherwise.");
    boolean format=myScanner.nextBoolean();
    
    int[][] myArray;
    if(format=true){
         myArray=new int[width][height];
         myArray[0][0]=1;
         myArray[0] = new int[width]; 
         for(int i=1;i<width;i++){
            myArray[i] = new int[width]; 
            myAray[i][1]= myArray[i-1][width]+1;
            for(int j=1;j<height;j++){
            myArray[i][j]=myArray[i][j-1]+1;
            }
        }
    }
    
    return myArray;
}//end of the increasingMatrix method



}//end of class

/*
First, implement a method called increasingMatrix() 
that accepts three input variables:  
The first two, width and height, are integer sizes for a matrix.  
The last, a boolean called format, 
is true if the matrix is to be generated in row-major representation. 
It generates a column-major representation of the matrix otherwise.  
increasingMatrix() outputs a two dimensional array of integers that 
uses a row- or column-major representation of a matrix whose elements
start at 0 in the upper left and increase by 1 along each row, 
and continuing onto the next row..  
The matrix to the right exemplifies this condition.
*/