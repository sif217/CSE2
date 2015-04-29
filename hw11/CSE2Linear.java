//Siyi Feng
//Homework 11
//Linear Program
/*This program asked user to enter 15 integer numbers 
and binear search another input and then shuffle the 
array and then use linear search to search another input*/
//
//import a scanner
import java.util.Scanner;
import java.util.Random;
//define a class
public class CSE2Linear{
    //define a method
    public static void main (String []args){
        //define and construct a scanner
        Scanner myScanner=new Scanner(System.in);
        //define variables and arrays
        int i=0;
        int[] grades=new int[15];
        
        //print out question
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        for(i=0;i<15;i++){
        if(myScanner.hasNextInt()){
            grades[i]=myScanner.nextInt();
            if(grades[i]>=0 && grades[i]<=100){
                
                if(i==0){
                    grades[i]=grades[i];
                }
                ////the element is not greater than the last element    
                else{
                if(grades[i]>=grades[i-1]){
                    grades[i]=grades[i];
                }
                else{
                    System.out.println("Please enter a integer greater than the last element!");
                    --i;
                continue;
                }
                }//else
            }//checking within range
            
            else{
                System.out.println("Please enter integer with 0 ~ 100!");
                --i;
                continue;
            }
        }//end of check ints
        
        else{
            System.out.print("Please enter integer only!");
            myScanner.next();
            --i;
            continue;
        }//end of print out non-int message
        
        }//end of for loop
        System.out.println();
        System.out.println("The grades, sorted, are: ");
        for(i=0;i<15;i++){
            System.out.print(grades[i]+" ");
        }
        
        //Binear Search
        System.out.println();
        System.out.print("Enter a grade to search for: ");
        int key1=myScanner.nextInt();
        
        int result = binarySearch(key1,grades);
        
        if(result == 4){
            System.out.println(key1 + " was not found in the list with 4 interations");
        }
        else{
            System.out.println(key1 + " was found in the list with "+ result+ " iterations");
        }
        
        
        System.out.println();
        //invoke scrambledArray method to shuffle the original array
        int[] scrambledArray = scrambledArray(grades);
        //list the numbers from scrambled array
        System.out.println("Scrambled: ");
        for(i=0;i<15;i++){
            System.out.print(scrambledArray[i]+" ");
        }
        
        
        //Linear Search 
        System.out.println();
        System.out.print("Enter a grade to search for: ");
        int key2=myScanner.nextInt();
        
        int result2 = linearSearch(key2,scrambledArray);
        
        if(result2 == 16){
            System.out.println(key2 + " was not found in the list with 15 iterations");
        }
        else{
            System.out.println(key2 + " was found in the list with "+(result2+1)+" iterations");
        }
    }//end of the main method 
    
    
    
    //binary search method
    public static int binarySearch(int keyNumber,int[] bsArray){
        int low = 0;
        int high = 15-1;
        int i=0;
        
        while (high >= low){
            int mid = (low +high)/2;
            
            if(keyNumber<bsArray[mid]) high = mid-1;
            else if(keyNumber == bsArray[mid]) { System.out.println("***"+i);return i;}
            else low = mid + 1;
            i++;
        }
        return i;
    }//end of binary Search method 
    
    
    
    //scrambledArray method 
     public static int[] scrambledArray(int[] sArray){
        Random rNumber = new Random();
        for (int i=15-1; i>0;i--){
            int index = rNumber.nextInt(i+1);
      
            int random = sArray[index];
            sArray[index] = sArray[i];
            sArray[i] = random;
        }//end of for loop
        
        int[] result = new int[15];
        for(int i=0;i<15;i++){
            result[i]=sArray[i];
        }
        return result;
    }//end of scrambledArray method 



    //linear search method 
    public static int linearSearch(int keyNumber, int[] lsArray){
        for(int i=0;i<15;i++){
            if(keyNumber == lsArray[i]) return i; 
        }
        return 16;
    }//end of linear Search method 

}//end of class

