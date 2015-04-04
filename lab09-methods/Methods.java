//Siyi Feng
//Lab 08
//This program includes three methods and shows different out put
//
//import scanner
import java.util.Scanner;
//define a class
public class Methods{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("The "+phase1()+" "+phase2()+" "+phaseThree()+" the "+phaseFour());
            System.out.println("Do want another sentence?(Enter Y/y for YES, else for NO):");
            String answer=scan.next(); 
            if(answer.equals("Y")||answer.equals("y")){
                continue;
            } 
            else{
                break;
            }
        }
    }
    


public static String phase1(){
    int randomNum=(int) (Math.random()*10);
    String phase=" ";
    switch (randomNum) {
            case 0:  phase = "feeble";
                     break;
            case 1:  phase = "equal";
                     break;
            case 2:  phase= "labored";
                     break;
            case 3:  phase = "rare";
                     break;
            case 4:  phase = "possible";
                     break;
            case 5:  phase = "faded";
                     break;
            case 6:  phase = "gusty";
                     break;
            case 7:  phase = "fantastic";
                     break;
            case 8:  phase = "eatable";
                     break;
            case 9:  phase = "boorish";
                     break;    
    }//end of switch
        return phase;
    }


public static String phase2(){
    int randomNum=(int) (Math.random()*10);
    String phase=" ";
    switch (randomNum) {
            case 0:  phase = "cracker";
                     break;
            case 1:  phase = "lake";
                     break;
            case 2:  phase= "bell";
                     break;
            case 3:  phase = "umbrella";
                     break;
            case 4:  phase = "egg";
                     break;
            case 5:  phase = "orange";
                     break;
            case 6:  phase = "ghost";
                     break;
            case 7:  phase = "bomb";
                     break;
            case 8:  phase = "toothbrush";
                     break;
            case 9:  phase = "cake";
                     break;    
    }//end of switch
        return phase;
}//end of phase2 method

public static String phaseThree(){
    int randomNum=(int) (Math.random()*10);
    String phaseThree=" ";
    switch (randomNum) {
            case 0:  phaseThree = "sparkles";
                     break;
            case 1:  phaseThree = "lands";
                     break;
            case 2:  phaseThree= "crashes";
                     break;
            case 3:  phaseThree = "attackes";
                     break;
            case 4:  phaseThree = "smashes";
                     break;
            case 5:  phaseThree = "murders";
                     break;
            case 6:  phaseThree = "frightens";
                     break;
            case 7:  phaseThree = "pokes";
                     break;
            case 8:  phaseThree= "embarrasses";
                     break;
            case 9:  phaseThree = "eats";
                     break; 
    }//end of switch
        return phaseThree;
}//end of phase3

public static String phaseFour(){
    int randomNum=(int) (Math.random()*10);
    String phaseFour=" ";
    switch (randomNum) {
            case 0:  phaseFour = "flower";
                     break;
            case 1:  phaseFour = "air";
                     break;
            case 2:  phaseFour= "sweater";
                     break;
            case 3:  phaseFour = "skirt";
                     break;
            case 4:  phaseFour = "sponge";
                     break;
            case 5:  phaseFour = "cable";
                     break;
            case 6:  phaseFour = "bird";
                     break;
            case 7:  phaseFour = "competition";
                     break;
            case 8:  phaseFour = "jam";
                     break;
            case 9:  phaseFour = "fish";
                     break;  
    }//end of switch
        return phaseFour;                
}//end of phase4

}//end of class


