//Siyi Feng
//Lab 08
//This program includes three methods and shows different out put
//
//import scanner
import java.util.Scanner;
public class RemoveElements{
    
  //main method  
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
 
  //randomInput method 
  public static int[] randomInput(){
      int[] random=new int[10];
      Scanner scan=new Scanner(System.in);
      for(int i=0;i<=9; i++){
          random[i]=(int) (Math.random()*10);
      }
      return random;
  }
  
  
  //delete method 
  public static int[] delete(int list[],int pos){
      //define array finalList
      int[] finalList;
      //check input pos is in the range 
      if(pos>=0&&pos<=9){
          //set the length of array finalList to 9 which is 10 -1 
          finalList= new int[9];
          int k=0;
      for (int j=0; j<=9;j++){
          //exclude the number in array list which equals to pos
          if(j!=pos){
              //convert array list into finalList 
              finalList[k]=list[j];
              k++;
          }
      }
      }
      //if the input of index is not vaild print out message and show the orginal array
      else{
          System.out.println("The index is not valid.");
          finalList = new int[10];
          finalList=list;
      }
      return finalList;
     
  }
  
  
  //remove method 
  public static int[] remove(int list[], int target){
      int k=0;
      int j=0;
      //define an arbitrary array with set length of 10 in which the first k numbers are vaild and follow with 0
      int[ ] middleList= new int [10];
      for (j=0;j<=9;j++){
          //exclude the numbers in array list which equal to target
          if(list[j]!=target){
              middleList[k]=list[j];
              k++;//k= the number of the vaild integers in array middle List 
          }
      }
      
      //print out message if target is found
      if(k<9){
          System.out.println("Element "+target+" has been found");
      }
      //print out message if target is not found
      else{
          System.out.println("Element "+target+" was not found");
      }
      
      //define an array finalList with a length of k 
      int[ ] finalList=new int [k];
      for(int l=0;l<k;l++){
          //convert the first k numbers(vaild numbers) in middleList into array finalList
          finalList[l]=middleList[l];
      }
      return finalList;
  }
 
 
  //listArray method 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }

    
    
}//the end of the class

