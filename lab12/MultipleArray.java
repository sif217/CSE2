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
        
        
        System.out.println("Input the width of the matrix A and B:");
        int width = myScanner.nextInt();
        System.out.println("Input the height of the matrix A and B:");
        int height = myScanner.nextInt();
        
        System.out.println("For matrix A, input true for row-major representation; otherwise, for column-major representation.");
        boolean format1=myScanner.nextBoolean();
        int[][] arrayA=increasingMatrix(width,height,format1);
        System.out.println("For matrix B, input true for row-major representation; otherwise, for column-major representation.");
        format1=myScanner.nextBoolean();
        int[][] arrayB=increasingMatrix(width,height,format1);
        
        System.out.println("For matrix A, input true for printing the matrix in row-major format; otherwise, for column-major format.");
        boolean format2=myScanner.nextBoolean();
        printMatrix(arrayA,format2);
        System.out.println("For matrix B, input true for printing the matrix in row-major format; otherwise, for column-major format.");
        format2=myScanner.nextBoolean();
        printMatrix(arrayB,format2);
        
        
        System.out.println("Input the width of the matrix C:");
        width = myScanner.nextInt();
        System.out.println("Input the height of the matrix C:");
        height = myScanner.nextInt();
        System.out.println("For matrix C, input true for row-major representation; otherwise, for column-major representation.");
        format1=myScanner.nextBoolean();
        int[][] arrayC=increasingMatrix(width,height,format1);
        
        System.out.println("The sum of matrix A and B is:");
        int[][] sum1=addMatrix(arrayA, arrayB);
        printMatrix(sum1,true);
        System.out.println("The sum of matrix A and C is:");
        int[][] sum2=addMatrix(arrayA, arrayC);
        if(sum2!=null){printMatrix(sum2,true);}
    }
/*
Finally, implement the main method: 
Generate two random widths and heights, 
then generate three increasing matrices: 
matrices A and B with the first width/height, 
and matrix C with the second width/height.  
A should be row-major, B should be column-major.  
Print all of them.  Then attempt to add A to B and A to C, 
and print the sums.
*/
//increasingMatrix method---------------------------------------------------    
public static int[][] increasingMatrix(int width, int height,boolean format){
    int[][] myArray;
    int counter =1;
    if(format=true){
        myArray=new int[height][width];
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                myArray[i][j] = counter;
                counter++;
            }
        }
    }
    
    else{
        myArray=new int[width][height];
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                myArray[j][i]=counter;
                counter++;
            }
        }
    }    
    return myArray;
}//end of the increasingMatrix method


// printMatrix method ----------------------------------------
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




public static int[][] addMatrix(int [][] a, int[][] b){
    int[][] sum;
    if(a.length==b.length&&a[0].length==b[0].length){
        sum=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
    
        return sum;
    }
    
    else{
        System.out.println("the arrays cannot be added!");
        return null;
    }
}
}//end of class

/*
Implement translate(int[][] array).  
This method should read the input matrix, 
assuming that it is in a column major format, 
then copy its values into a newly allocated array in row major format. 
Output the new array.

Next, implement addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb) 
which accepts two arrays in row or column-major format 
(specified by formata and formatb - true for row major, col major for false).  
First, assess whether the arrays can be added: if they can only be added 
if they have the same width and height.  
If they cannot be added, print “the arrays cannot be added!” and return null.  
(this command is literally return null; null is the address of a pointer 
that points to nothing. )  Next, if one of the arrays is in column major format, 
translate it to a row-major format.  Finally, add the two matrices and output 
the result as a row-major matrix.  Matrix addition 
*/