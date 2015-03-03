//Siyi Feng
//Lab 06
//SmileGenerator Program
/*This program uses non-nested for loop,while loop 
and do-while loop to generate line of :):):):):)*/
//
//define a class
public class SmileGenerator{
    public static void main(String[] args){
        System.out.println("while loop");
        //while loop
        int [] index={1,2,3,4,5};
        for(int x:index){
            System.out.print(":)");
            
        }//end of for loop
        
        System.out.println("");
        System.out.println("while loop");
       //while loop 
        int start=0;
        while(start<5){
            System.out.print(":)"); 
            start++;
        if (start==5){
                break;
        }//end of if    
        }//end of while loop
        
        System.out.println("");
        System.out.println("do-while loop");
        //do-while loop
        int startdo=0;
        do{
            System.out.print(":)"); 
            startdo++;
            if(startdo==5){
                startdo=6;
            }
            }
        while(startdo<5);
        
        System.out.println("");
        System.out.println("Step 2");
        // step 1
        int numberSmileyFace=(int) (Math.random()*100);
        int zeroSmileyFace=0;
        while(zeroSmileyFace<numberSmileyFace){
           System.out.print(":)"); 
           zeroSmileyFace++;
           if(zeroSmileyFace==numberSmileyFace){
               zeroSmileyFace=0;
               break;
               
           }//end of if statement
        }
        
        System.out.println("");
        System.out.println("Step 3");
        // step 2
        while(zeroSmileyFace<numberSmileyFace){
           System.out.print(":)"); 
           zeroSmileyFace++;
           if(zeroSmileyFace==30||zeroSmileyFace==60||zeroSmileyFace==90){
               System.out.println("");
           }//end of if statement
           else if(zeroSmileyFace==numberSmileyFace){
               zeroSmileyFace=0;
               break;
            }//end of else-if statement
        }//end of while loop
        
       
           
        System.out.println("");
        System.out.println("Step 4"); 
        int line=1;
        int numberSmile=0;
        
        while(line<5){
            while(numberSmile<line){
                System.out.print(":)");
                numberSmile++;
                if(numberSmile==line){
                    numberSmile=0;
                    line++;
                    System.out.println("");
                    break;
                }//end of if statement
            }//end of internal while loop
                
            if (line==5){
              break;
            }//end of if statement
        }//end of while loop
        
    }//end of method 
}//end of class
