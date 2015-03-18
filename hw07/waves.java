//Siyi Feng
//Homework 07
//Number Waves Program
//This program askes to input the a number within 1 to 30 and output a number wave
// 
//import a scanner
import java.util.Scanner;
//define a class
public class waves{
    public static void main(String[] args){
        //define and construct a scanner
        Scanner myScanner=new Scanner(System.in);
        
        //declare integers needed for indexes 
        int loop,line,number;
       
            //ask for input
            System.out.print("Enter a number between 1 and 30:");
            if(myScanner.hasNextInt()){
                //declare an input
                int input=myScanner.nextInt();
                
                //START OF VALID RANGE IF STATEMENT
                if(input>=1&&input<=30){
                    
                    //START OF FOR LOOP****************************
                    System.out.println("FOR LOOP:");
                    
                    for(loop=1;loop<=input;loop++){
                        
                        //if loop is an odd number
                        if(loop%2!=0){
                            //make the order of lines decreasing; for example: 3, 2, 1
                            for(line=loop;line<=loop&&line>0;line--){
                            //for each line print out the number of loop as many as the lines 
                            for(number=1;number<=line;number++){
                                System.out.print(loop);
                            }//end of the for loop
                            //indent
                            System.out.println("");
                        }//end of the for loop
                        }//end of if
                        
                        //if the number of loop is an even number
                        if(loop%2==0){
                            //make the order of the number of lines increasing; for example:1, 2 ,3 
                            for(line=1;line<=loop;line++){
                            //for each line print out the number of loop as mny as the number of the line
                            for(number=1;number<=line;number++){
                                System.out.print(loop);
                            }//end of the for loop
                            System.out.println("");
                        }//end of the for loop
                        }//end of if
                        
                    }//end of the for loop
                    //END OF FOR LOOP***************************
                    
                    //SPACE LINE
                    System.out.println("");
                    
                    //reset the numbers of loop,line and nubmer
                    loop=0;
                    line=0;
                    number=0;
                    
                    //START OF WHILE LOOP######################
                    System.out.println("WHILE LOOP:");
                    
                    //while the number of loop is alway less then the number of input, execute the rest
                    while(loop<input){
                        //post-increment 
                        loop++;
                        //if the number of loop is an odd number
                        if(loop%2!=0){
                            //the number of line equals to the number of loop plus one
                            line=loop+1;
                            /*while the number of line is always larger than zero
                            make the order of the number of the line decreasing; for example:3,2,1*/
                            while(line>0){
                            //post-decrement
                            line--;
                                /*while the number of number is always less than the number of line
                                for each line print out the number of loop as many as the number of the line */
                                while(number<line){
                                    System.out.print(loop);
                                    number++;
                                    //if number equals to line, reset number equals to zero and break the current while loop
                                    if(number==line){
                                        System.out.println("");
                                        number=0;
                                        break;
                                    }//end of if 
                                }//end of while
                         
                            }//end of while
                        }//end of if 
                        
                        //if the number of loop is an even number
                        if(loop%2==0){
                            /*while the number of line is always larger than zero
                            make the order of the number of the line increasing; for example:1,2,3*/
                            while(line<loop){
                            line++;
                                /*while the number of number is always less than the number of line
                                for each line print out the number of loop as many as the number of the line */
                                while(number<line){
                                    System.out.print(loop);
                                    number++;
                                    //if number equals to line, reset number equals to zero and break the current while loop
                                    if(number==line){
                                        System.out.println("");
                                        number=0;
                                        break;
                                    }//end of if 
                                }//end of while
                        
                                if(line==loop){
                                    line=0;
                                    break;
                                }//end of if    
                            }//end of while
                        }//end of if 
                        
                        if(loop==input){
                            break;
                        }//end of if
                    }
                    
                    //END OF WHILE LOOP#########################
                    
                    //SPACE LINE
                    System.out.println("");
                    
                    System.out.println("");
                    //reset loop,line and numer
                    loop=0;
                    line=0;
                    number=0;
                    
                    //START OF DO-WHILE LOOP$$$$$$$$$$$$$$$$$$$
                    System.out.println("DO-WHILE LOOP:");
                    
                    //while loop is less than input, exxcute the rest
                    do{
                        loop++;
                        //if loop is an odd number 
                        if(loop%2!=0){
                            line=loop+1;
                            /*while the number of line is always larger than zero
                            make the order of the number of the line decreasing; for example:3,2,1*/
                            do{
                            line--;
                                //print out the number of loop as many as the number of the lines
                                do{
                                    System.out.print(loop);
                                    number++;
                                    //if number equals to line, indent and break current do-while loop
                                    if(number==line){
                                        System.out.println("");
                                        number=0;
                                        break;
                                    }//end of if 
                                }while(number<line);//end of while
                        
                            }while(line>1);//end of while
                        }//end of if
                        
                        //reset line equals to zero
                        line=0;
                       
                        //if loop is an even number
                        if(loop%2==0){
                            /*while the number of line is always larger than zero
                            make the order of the number of the line increasing; for example:1,2,3*/
                            do{
                            line++;
                                //print out the number of loop as many as the number of the lines
                                do{
                                    System.out.print(loop);
                                    number++;
                                    //if number equals to line, indent and break current do-while loop
                                    if(number==line){
                                        System.out.println("");
                                        number=0;
                                        break;
                                    }//end of if 
                                }while(number<line);//end of while
                                //if line equals to loop, reset line equals to zero and break the current do-while loop
                                if(line==loop){
                                    line=0;
                                    break;
                                }//end of if    
                            }while(line<loop);//end of while
                        }//end of if 
                        
                        //if loop equals to input, break current do-while loop
                        if(loop==input){
                            break;
                        }//end of if
                    }while(loop<input);
                    
                    //END OF DO-WHILE LOOP$$$$$$$$$$$$$$$$$$$$$
                    
                    
                }//END OF VALID RANGE IF STATEMENT
                
                else{
                    //print out error
                    System.out.println("Plase input an integer between 1 and 30.");
                }//end of else statement
            }//end of if statement
            
            else{
                //print out error
                System.out.println("Plase input an integer between 1 and 30.");
                myScanner.next();//clear scanner
            }//end of else statement
            
        
        
    }//the end of the main method
    
}//the end of the class