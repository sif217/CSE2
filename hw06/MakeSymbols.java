//Siyi Feng
//Homework 06
//MakeSymbols Program
/*This program uses do-while loop to generate an integer between 0 and 100 
and print out the integer first and then print out "*" if it is even
or "&" it if odd*/
//
//define a class
public class MakeSymbols{
    //define a method
    public static void main(String[] args){
        //define a variable of the random generated integer with the rage of 0 to 100
        int randomNumber=(int) (Math.random()*100+1);
        //define the conditional variable 
        int i=1;
        //print out the randomly generated number 
        System.out.println("Random number generated: "+randomNumber);
        System.out.print("The out pattern:");
        
        //do=while loop that excutes once before check the condition
        do{
            //if the randomly generated number is even, print out * sign as many time as the generated number
            if(randomNumber%2==0){
                System.out.print("*");
                //increment iidentifier by 1
                i++;
            }
            //if the randomly generated number is odd, print out & sign as many time as the generated number
            else{
                System.out.print("&");
                //increment iidentifier by 1
                i++;
            }
            
        }while(i<(randomNumber-1));//if condition is satisfied then continue the loop
        
    }//end of method
    
}//end of class






