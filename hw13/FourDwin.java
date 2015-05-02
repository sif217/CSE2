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
            
           
            
            
            
            System.out.println("Sorted Array:");
            double[][][][]sArray4D=sort4DArray(array4D);
            printArray(sArray4D);
            statArray(array4D);
       
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
        
        if(sumI==0){System.out.println("Doesn't have a mean.");}
        
        else {System.out.println("Mean:  "+threeDigit.format(sum/sumI));}
    }//end of statArray method 
    
    
    //sort4DArray method 
    //this sort4DArray method uses insertion sorting to sort sub-3D array by the length of them from smallest to largest 
    //if there are arrays have the same length, the array with the lowest value of the lowest value in that array goes first
    public static double[][][][] sort4DArray(double sArray4D[][][][]){
        int[] size=new int[3];
        size[0]=0;size[1]=0;size[2]=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<sArray4D[i].length;j++){
                for(int l=0;l<sArray4D[i][j].length;l++){
                    size[i]+=sArray4D[i][j][l].length;
                }
            }
        }
        
        
        for(int i=1;i<3;i++){
                
            double[][][] currentElement=sArray4D[i];
            int currentIndex=i;
            int k;
            
            for(k=i-1;k>=0 && size[k]>size[currentIndex];k--){
                sArray4D[k+1]=sArray4D[k];
            }
            sArray4D[k+1]=currentElement;
            currentIndex=k+1;
            
        }//end of for loop
        
        //find the lowest value in each 3D array
        double lowest[]=new double[3];
        lowest[0]=100000;lowest[1]=1000000;lowest[2]=1000000;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<sArray4D[i].length;j++){
                for(int l=0;l<sArray4D[i][j].length;l++){
                    for(int q=0;q<sArray4D[i][j][l].length;q++){
                    if(sArray4D[i][j][l][q]<lowest[i]){lowest[i]=sArray4D[i][j][l][q];}
                    }
                }
            }
        }
        
        
       //to swap the 3D arrays who have the same length but the one with the lower value of the lowest value in its sub-array goes first     
        double[][][] temp;
        double tempLowest;
        int tempSize;
        for(int z=0;z<3;z++){
            temp=sArray4D[z];
            tempLowest=lowest[z];
          
            for(int y=0;y<3;y++){
                if(size[y]==size[z] && z>y && lowest[z]<lowest[y]){
                    sArray4D[z]=sArray4D[y];
                    lowest[z]=lowest[y];
                    
                    sArray4D[y]=temp;
                    lowest[y]=tempLowest;
                 
                    
                }
            }
            
        }//end of for
        
        
            return sort3DArray(sArray4D);
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

