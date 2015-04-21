//Siyi Feng
//Homework 12
//Multiply Program
/*This program asks inputs for the widths and heights
for two matrices and print out each of them and the multiplication of them*/
//
//import a scanner
import java.util.Scanner;
//import a random
import java.util.Random;


public class Multiply{

public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    boolean arg=true;
    int[] width=new int[2];
    int[] height=new int[2];
    
    for(int i=0;i<2;i++){
        System.out.println("Input an integer for the width of No. "+(i+1)+" matrix: ");
    if(myScanner.hasNextInt()){
    width[i]=myScanner.nextInt();
        if(width[i]>0){
            width[i]=width[i];
            
        }
        else{
            System.out.println("The width of the array must be postive integer.");
            i--;
            continue;
            
        }
    }//checking the width 
    else{
        System.out.println("The width of the array must be integer."); 
         myScanner.next();
         i--;
         continue;
    }
    
    System.out.println("Input an integer for the height of No. "+(i+1)+" matrix: ");
    if(myScanner.hasNextInt()){
    height[i]=myScanner.nextInt();
        if(height[i]>0){
            height[i]=height[i];
            if(i==1){break;}
            
            
        }
        else{
            System.out.println("The height of the array must be postive integer.");
            i--;
            continue;
            
        }
    }//checking the height of the array 
    else{
        System.out.println("The height of the array must be integer.");
        myScanner.next();
        i--;
        continue;
    }
   
    }//end of for loop
    

    
    //invoke the randomMatrix method to generate a 2D metrix 
    int[][] array1=randomMatrix(height[0],width[0]);
    
    //print out the matrix generated by random matrix with the printMatrix method 
    boolean arg1=true;
    
    while(arg1){
    System.out.println("For No.1 matrix, please enter true for row-major format; false for column-major format:");
    if(myScanner.hasNextBoolean()){
        boolean format=myScanner.nextBoolean();
        printMatrix(array1,format);
        break;
    }
    else{System.out.println("Please enter either true or false!");}
    myScanner.next();
    }
    
    
    //invoke the randomMatrix method to generate another 2D metrix again 
    int[][] array2=randomMatrix(height[1],width[1]);
    
    //print out the matrix generated by random matrix with the printMatrix method 
    while(arg1){
    System.out.println("For No. 2 matrix, please enter true for row-major format, false for column-major format:");
    if(myScanner.hasNextBoolean()){
        boolean format=myScanner.nextBoolean();
        printMatrix(array2,format);
        break;
    }
    else{System.out.println("Please enter either true or false!");}
    myScanner.next();
    }
   
    
    //invoke the matrixMultiply method to do the calculation
    int[][] finalArray=matrixMultiply(array1,array2);
    
    //print out the final array
    
    while(arg1){
    System.out.println("For the final calculated matrix, please enter true for row-major format, false for column-major format:");
    if(myScanner.hasNextBoolean()){
        boolean format=myScanner.nextBoolean();
        printMatrix(finalArray,format);
        break;
    }
    else{System.out.println("Please enter either true or false!");}
    myScanner.next();
    }
    
    
}//end of the main method 



//RANDOM MATRIX method------------------------------------
public static int[][] randomMatrix(int height, int width){
    
    Random rNumber = new Random();
    int[][] matrix = new int[height][width];
    
        for(int h=0;h<height;h++){
            for(int w=0;w<width;w++){
                int number1 = rNumber.nextInt(11);
                int number2 = rNumber.nextInt(11);
                matrix[h][w] = (number1 - number2 );
             
            }
        }
        
    return matrix;
}//end of the radom Matrix method 


//PRINT MATRIX method-----------------------------------------
public static void printMatrix(int[][] array, boolean format){
     //print out row-major format 
     if(format=true){
         if(array==null){
             System.out.println("the array was empty!");}
             for(int i=0;i<array.length;i++){
                 for(int j=0;j<array[0].length;j++){
                    System.out.print(array[i][j]+"  ");
                 }
                 System.out.println();
             }
         
         
     }//end of row-major 
     
     //print out column-major format 
     else{
         for(int j=0;j<array[0].length;j++){
             for(int i=0;i<array.length;i++){
                 System.out.print(array[i][j]+"  ");
             }
             System.out.println();
         }
     }//end of column-major 
     
}//end of print matrix method



//MATRIX MULTIPLY method---------------
public static int[][] matrixMultiply(int[][] array1,int[][] array2){
    int[][] finalArray=new int[array1.length][array2[0].length];
    //print out error
    if(array1[0].length!=array2.length){System.out.println("The multiplication cannot be executed because the width of No.1 matrix does not equal to the height of No.2 matrix.");
    System.exit(0);
    }
    for(int h=0;h<array1.length;h++){
        for(int w=0;w<array2[0].length;w++){
            for(int l=0;l<array1[0].length;l++){
            finalArray[h][w]+=(array1[h][l]*array2[l][w]);
            
            }
        }
    }
    return finalArray;
}//end of matrix multiply method 

}//end of the class

