//Siyi Feng
//Homework 13
//FourDwin Program
/*This program asks use insertion sort and selection sort to sort 4D and 3D arrays*/
//
//import a scanner
import java.util.Scanner;
//import a random
import java.util.Random;
//import a decimalFormat
import java.text.DecimalFormat;

public class FourDwin{
    public static void main (String [] args){
        Scanner myScanner=new Scanner(System.in);
        Random myRandom=new Random();
        /*DecimalFormat twoDecimals = new DecimalFormat("##.00");*/
        boolean arg=true;
        int integer1=0;
        int integer2=0;
        
        //while loop to keep asking if the conditions are not satisfied 
        while(arg==true){
            
            //ask for input for X
            System.out.print("Enter an integer X:");
            if(myScanner.hasNextInt()){
                integer1=myScanner.nextInt();
            }
            else{
                System.out.print("Invalid input.");
                myScanner.next();
                continue;
            }
            
            //ask for input for Y>X
            System.out.println("Enter an integer Y where Y > X:");
            if(myScanner.hasNextInt()){
                integer2=myScanner.nextInt();
                if(integer2>integer1){
                    integer2=integer2;
                    arg=false;
                }
                else{
                    System.out.println("Invalid input.");
                    continue;
                }
            }
            else{
                System.out.print("Invalid input.");
                myScanner.next();
                continue;
            }//end of else
            
        }//end of while loop
        
        //generate a 4D array
        double[][][][] array4D;
            array4D= new double[3][][][];
            
            
            for(int i=0;i<3;i++){
            array4D[i]=new double[(myRandom.nextInt(integer2-integer1)+integer1)][][];
                for(int j=0;j<array4D[i].length;j++){
                        array4D[i][j]=new double[(myRandom.nextInt(integer2-integer1)+integer1)][];
                    for(int l=0;l<array4D[i][j].length;l++){
                        array4D[i][j][l]=new double[(myRandom.nextInt(integer2-integer1)+integer1)];
                        for(int q=0;q<array4D[i][j][l].length;q++){
                            array4D[i][j][l][q]= Math.random()*30;
                        }
                    }
                }
            }//end of for loop
            
            System.out.println("Original Array:");
            printArray(array4D);
            
           
            double[][][][]sArray3D=sort3DArray(array4D);
            
            
            System.out.println("Sorted Array:");
            double[][][][]sArray4D=sort4DArray(sArray3D);
            printArray(sArray4D);
            statArray(array4D);
        /*
        Write a main method that:
	Loops to ask and check for valid user input (2 integers).
Creates a 4D ragged array based on these values.
Fills the 4D array with random doubles.
	Prints out the initial array, the sorted array, and its statistics.
        */
    }//end of the main method 
    
    public static void statArray(double[][][][] array4D){
        DecimalFormat oneDigit = new DecimalFormat("0.0");
        DecimalFormat threeDigit = new DecimalFormat("0.000");
        int sumI=0;
            for(int i=0;i<3;i++){
                for(int j=0;j<array4D[i].length;j++){
                    for(int l=0;l<array4D[i][j].length;l++){
                        sumI+=array4D[i][j][l].length;
                    }
                }
            }//end of for loop 
        
        
        System.out.println("Members: "+ sumI);
        double sum=0;
        
        for(int i=0;i<3;i++){
                for(int j=0;j<array4D[i].length;j++){
                    for(int l=0;l<array4D[i][j].length;l++){
                        for(int q=0;q<array4D[i][j][l].length;q++){
                            sum+=array4D[i][j][l][q];
                        }
                    }
                }
            }//end of for loop
            
        System.out.println("Sum:   "+oneDigit.format(sum));
        System.out.println("Mean:  "+threeDigit.format(sum/sumI));
    }//end of statArray method 
    
    //sort4DArray method 
    //this sort4DArray method uses insertion sorting to sort sub-3D array by the length of them from smallest to largest 
    //if there are arrays have the same length, the array with the lowest value of the lowest value in that array goes first
    public static double[][][][] sort4DArray(double sArray4D[][][][]){
        for(int i=1;i<3;i++){
                
            double[][][] currentElement=sArray4D[i];
            int k;
            for(k=i-1;k>=0 && sArray4D[k].length>currentElement.length;k--){
                sArray4D[k+1]=sArray4D[k];
            }
            sArray4D[k+1]=currentElement;
            
        }//end of for loop
        
            
            return sArray4D;
    }//end of sort4DArray method 
    
    //sort3D Array method 
    //this method essentially uses selection sorting to sort the elements of the innermost arrays
    public static double[][][][] sort3DArray(double sArray3D[][][][]){
        for(int i=0;i<3;i++){
                for(int j=0;j<sArray3D[i].length;j++){
                    for(int l=0;l<sArray3D[i][j].length;l++){
                        for(int q=0;q<sArray3D[i][j][l].length-1;q++){
                            
                            double currentMin=sArray3D[i][j][l][q];
                            int currentMinIndex=q;
                            
                            for(int k=q+1;k<sArray3D[i][j][l].length;k++){
                                if(currentMin>sArray3D[i][j][l][k]){
                                    currentMin=sArray3D[i][j][l][k];
                                    currentMinIndex=k;
                                }//end of if
                            }//end of for
                            
                            if(currentMinIndex != q){
                                sArray3D[i][j][l][currentMinIndex]=sArray3D[i][j][l][q];
                                sArray3D[i][j][l][q]=currentMin;
                            }//end of if
                        }//end of for of q
                    }
                }
            }//end of for loop
            return sArray3D;
    }//end of sort3DArray
    
    public static void printArray(double[][][][] array4D){
        DecimalFormat oneDigit = new DecimalFormat("0.0");
        
        for(int i=0;i<3;i++){
            System.out.println("{");
                for(int j=0;j<array4D[i].length;j++){
                    System.out.print("{");
                    for(int l=0;l<array4D[i][j].length;l++){
                        System.out.print("{");
                        for(int q=0;q<array4D[i][j][l].length;q++){
                            if(q==array4D[i][j][l].length-1){
                                System.out.print(oneDigit.format(array4D[i][j][l][q]));
                            }
                            else{
                                System.out.print(oneDigit.format(array4D[i][j][l][q])+", ");
                            }
                        }
                        if(l==array4D[i][j].length-1){System.out.print("}");}
                        else System.out.print("}, ");
                    }
                    if(j==array4D[i].length-1){System.out.print("}");}
                    else System.out.print("}, ");
                }
                if(i==array4D.length-1){System.out.println(); System.out.println("}");}
                    else {System.out.println();System.out.println("}, ");}
            }//end of for loop
            System.out.println();
    }//end of the printArray method 
}

