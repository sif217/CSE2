//Siyi Feng
//lab 13
//lab13 Program
//This program 
//
//import random
import java.util.Random;
//define a class
public class Lab13{
   
    public static void main (String [] args){
         Random r=new Random();
        int[][] array2D=new int[5][];
        for(int i=0;i<5;i++){
          array2D[i]=new int[i*3+5];  
        }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<array2D[i].length;j++){
                array2D[i][j]=r.nextInt(40);
            }
        }
        
        for(int i=0;i<5;i++){
            System.out.print("row "+(i+1)+":");
            for(int j=0;j<array2D[i].length;j++){
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
     
       for(int i=0;i<5;i++){
            
            for(int j=0;j<array2D[i].length;j++){
                int currentElement=array2D[i][j];
            int k;
            for(k=j-1;k>=0 && array2D[i][k]>currentElement;k--){
                array2D[i][k+1]=array2D[i][k];
            }
            array2D[i][k+1]=currentElement;
            }
            
        }
        System.out.println();
        System.out.println("The sorted array:");
        for(int i=0;i<5;i++){
            
            for(int j=0;j<array2D[i].length;j++){
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] Narray2D=new int[5][20];
        for(int i=0;i<5;i++){
            for(int j=0;j<array2D[i].length;j++){
                Narray2D[i][j]=0;
            }
        }
        
       
        
        for(int i=0;i<5;i++){
            
            for(int j=0;j<array2D[i].length;j++){
                Narray2D[i][j]=array2D[i][j];
            }
            
        }
        
        System.out.println();
        System.out.println("The array after sorting and copying:");
        for(int i=0;i<5;i++){
            
            for(int j=0;j<Narray2D[i].length;j++){
                System.out.print(Narray2D[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }//the end of the main method 
}//the end of the class


/*
 Write a program that creates a two dimensional 
 ragged array of five rows of ints. 
 The length the 0th row should be 5, the 1th row 8, etc. 
 The jth row should have length equal to j*3+5. Then:
Fill the array with random numbers in the range 0...39.
Display the array.
Sort each row of the array in ascending order.
Display the array.
Convert each member array into a new member array 
that is the same size as the largest member array, 
and initialize all new array members to zero.

*/