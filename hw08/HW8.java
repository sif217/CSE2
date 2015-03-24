//Siyi Feng
//Homework 08
//HW8 Program
//This program use different methods to display a game scence 
// 
//import a scanner
import java.util.Scanner;
//define a class
public class HW8{
      //the main method
      public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//the end of main method
    
      //the 4th part
      //a method that asks user to input C or c to continue the game
      public static String getInput(Scanner scan, String string){
        String userInput=scan.next();
        if (userInput.equals("C")||userInput.equals("c")){
            return userInput;
        }
        else{
          System.out.println("Yea right LOSER!");
          System.exit(0);
        }
      return userInput;
      }//end of getInput 
    
      //the 5th part
      //a method that asks user to input AaEe to continue the game
      public static String getInput(Scanner scan, String string, int trial){
        int i=0;
        
        // an infinite for loop to run the rest code until conditions are satisfied 
        for(int round=1;round>0;round++){
          String userInput2=scan.next();
          int randomNumber= (int) (Math.random()*2);
          int randomNumber2= (int) (Math.random()*11);
          
          //when user inputs A or a if random generated number equals to 1 10 times move to next part
          if(userInput2.equals("A")||userInput2.equals("a")){
            if(randomNumber==0){
              System.out.println("MISS!");
            }
            else if(randomNumber==1){
              System.out.println("Critical Hit!");
              i++;
              if(i==10){
                System.out.println("You kill the GIANT!");
                return userInput2;
              }
            }
          }//end of if
          
          // when user inputs E or e move on to next part when random generated number is equal to 10 otherwise re-enter AaEe 
          else if(userInput2.equals("E")||userInput2.equals("e")){
            if(randomNumber2==10){
              System.out.println("You escape the GIANT!");
              return userInput2;
            }
            else{
              System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
              continue;
            }
          }//end of else if
          
          else{
            System.out.println("Excuted by the GIANT!Game Over!");
            System.exit(0);
          }//end of else
        
        }
      return "";    
      }//end of getInput
      
      //the 6th part
      //use switch statement to show the results of the choice of box
      public static String getInput(Scanner scan){
        String boxChoice=scan.next();
        switch (boxChoice) {
          case "1":
            System.out.println("It is a chance to play this game again! Have fun!");
            return "1";
          case "2":
            System.out.println("It is GPA4.00Hero! Have a good day!");
            return "2";
          case "3":
            System.out.println("It is golden ring! You are luck!");
            return "3";
          default:
            System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
            System.exit(0);
            
            
        }//end of switch 
      return "";
      }//end of getInput
      
      //the method for generate the giant pattern
      public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    //the method to generate the cave pattern
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //the method to generate the boxes patterns
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

}//THE END OF HW8 
    
    
