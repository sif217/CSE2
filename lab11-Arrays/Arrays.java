//Siyi Feng
//lab 11
//Array Program
/*This program asked user to enter 15 integer numbers 
and binear search another input and then shuffle the 
array and then use linear search to search another input*/
//
//import a scanner
import java.util.Scanner;
import java.util.Random;
//define a class
public class Arrays{
    //define a method
    public static void main (String []args){
        Scanner myScanner = new Scanner(System.in);
        Random rNumber = new Random();
        
        int[] array1=new int[50], array2=new int[50];
        for(int i=0;i<=49;i++){
            array1[i] = rNumber.nextInt(101);
        }
            
            array2[0] = rNumber.nextInt(101);
        for(int i=1;i<=49;i++){
            array2[i]=array2[i-1]+rNumber.nextInt(101);
        }
        
        int maximum=array1[0];
        int minimum=array1[0];
        for(int i=1;i<=49;i++){
            if(array1[i]>maximum) maximum=array1[i];
            else if(array1[i]<minimum) minimum=array1[i];
        }//end of for loop
        System.out.println("The maximum of array1 is: "+maximum);
        System.out.println("The minimum of array1 is: "+minimum);
        
        
        int maximum2=array2[0];
        int minimum2=array2[0];
        for(int i=1;i<=49;i++){
            if(array2[i]>maximum2) maximum2=array2[i];
            else if(array2[i]<minimum2) minimum2=array2[i];
        }//end of for loop
        System.out.println("The maximum of array2 is: "+maximum2);
        System.out.println("The minimum of array2 is: "+minimum2);
        
       
        for(int i=0;i<=49;i++){
            int currentMin=array2[i];
            int currentMinIndex=i;
            for(int j=i+1;j<50;j++){
                if(currentMin>array2[j]){
                    currentMin=array2[j];
                    currentMinIndex=j;
                }
                
                if(currentMinIndex != i){
                    array2[currentMinIndex]=array2[i];
                    array2[i]=currentMin;
                }
            }
            }
        
        
        
        int low=0, high=50-1;
        System.out.println("Enter an int: ");
        if(myScanner.hasNextInt()){
            int integer=myScanner.nextInt();
            if(integer>0){
                while(high>=low){
                    int mid=(high+low)/2;
                    if(integer<array2[mid]) high = mid-1;
                    else if(integer==array2[mid]) System.out.println("456 was found in the list");
                    else low=mid+1;
                }
                System.out.println("The number above the key was "+array2[low]);
                System.out.println("The number below the key was "+array2[high]);
            }
            else{
                System.out.println("You did not enter an int > 0");
            }
        }
        
        else{
            System.out.println("You did not enter an int");
        }
}//end of method
}//end of class
/*


Create two integer arrays (array1 and array2) of size 50.
Fill array1 with random integers between 0 and 100
Use linear search to print out the minimum and maximum values of array1.
Add increasing random numbers to array2. (The first number should be between 0 and 100).
Print out the minimum and maximum values of array2.
Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
Use binary search to search the array for the inputted value.
Say if the number was found or not found.
If the number was not found, print out the numbers below and above the searched for number.


The maximum of array1 is: 99
The minimum of array1 is: 2
The maximum of array2 is: 2352
The minimum of array2 is: 91
Enter an int: 456
456 was not found in the list
The number above the key was 468
The number above the key was 426

The maximum of array1 is: 99
The minimum of array1 is: 0
The maximum of array2 is: 2450
The minimum of array2 is: 23
Enter an int: 907
907 was not found in the list
The number above the key was 968
The number above the key was 875

The maximum of array1 is: 99
The minimum of array1 is: 0
The maximum of array2 is: 2676
The minimum of array2 is: 30
Enter an int: jdashfkd
You did not enter an int

The maximum of array1 is: 96
The minimum of array1 is: 3
The maximum of array2 is: 2459
The minimum of array2 is: 67
Enter an int: -4
You did not enter an int > 0


*/