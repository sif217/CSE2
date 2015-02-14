// Siyi Feng
// Homework 4
// WhichNumber Program
/* This program inputs several question by using if/else if/else 
statement to and out put a 
*/
//
// import a scanner
import java.util.Scanner;
// define a class
public class WhichNumber{
    // define a method
    public static void main(String[] args){
        Scanner myScanner; // declare a scanner
        myScanner = new Scanner(System.in); // contruct a scanner
        // print out a line
        System.out.println("Think of a number between 1 and 10 inclusive.");
        // print out the instruction of answering the question
        System.out.println("Answer following questions with Y or y for yes and N or n for no.");
        
        // print out a question asking for whether a number is even
        System.out.print("Is your number even?");
        // declare a string 
        String even = myScanner.next();

        // if 1 the number is even
        if(even.equals("Y")||even.equals("y")){
            
            // print out a question asking for whether a number is even
            System.out.print("Is it divisible by 3?");
            // declare a string 
            String divisibleBy3 = myScanner.next();
            // if 2 the number is divisible by 3
            if (divisibleBy3.equals("Y")||divisibleBy3.equals("y")){
                
                // print out a question asking for whether the number is 6
                System.out.print("Is you number 6?");
                // declare a string
                String number6 = myScanner.next();
                // if 3 the number is 6
                if (number6.equals("Y")||number6.equals("y")){
                    System.out.println("Yay!");
                }// end of if 3
                //  if the num=ber is supposed to be 6 but the user is lying 
                else if (number6.equals("n")||number6.equals("N")){
                    System.out.println("If you are not lying, the number should be 6.");
                }// end of if
                // else if the input is valid
                else{
                    System.out.println("Sorry, that is not a valid input.");
                }
            } // end of if 2 and the only possible output is 6    
        
            // if 3 the number is not divisible by 3
            else if(divisibleBy3.equals("N")||divisibleBy3.equals("n")){
                
                // print out a question asking for whether the number is divisible by 4 
                System.out.print("Is the number divisible by 4?");
                // declare a string
                String divisibleBy4 = myScanner.next();
                // if 4 the number is divisible by 4
                if(divisibleBy4.equals("y")||divisibleBy4.equals("Y")){
                    
                    // print out a question asking about whether the number can be divided by 4 greater than 1
                    System.out.print("Is the nubmer divided by 4 greater than 1?");
                    // declare a string
                    String dividedBy4GreaterThan1 = myScanner.next();
                    
                    // if 5 the number is divded by 4 greater 1
                    if(dividedBy4GreaterThan1.equals("y")||dividedBy4GreaterThan1.equals("Y")){
                        // asking whether the number is 8
                        System.out.println("Is the number 8?");
                        // declare a string
                        String number8 = myScanner.next();
                        
                        // if 6 the number is 8
                        if(number8.equals("y")||number8.equals("Y")){
                            System.out.println("Yay!");
                        } // end of if 6
                        
                        // if 9 the number is not 8    
                        else if(number8.equals("n")||number8.equals("N")){
                        System.out.println("If you are not lying, the number should be 8.");
                        } // end of if 9
                        
                        // else if 7 the input is not valid
                        else{
                            System.out.println("Sorry, that is not a valid input.");
                        } // end of else if 7
                            
                    }// end of if 5
                    
                    // if 7 the number divided by 4 is not greater than 1 
                    else if(dividedBy4GreaterThan1.equals("n")||dividedBy4GreaterThan1.equals("N")){
                        // asking whether the number is 4
                        System.out.print("Is the number 4?");
                        // declare a string
                        String number4 = myScanner.next();
                        
                        // if 8 the number is 4
                        if(number4.equals("y")||number4.equals("Y")){
                            System.out.println("Yay!");
                        } // end of if 8
                        // if the number is not 4
                        else if(number4.equals("N")||number4.equals("n")){
                            System.out.println("If you are not lying, the number should be 4.");
                        } // end of if 9
                        // else if 5 the input is not valid
                        else{
                            System.out.println("Sorry, that is not a valid input.");
                        } // end of else 5
                        
                    } // end of if 7
                    
                    // else if 6 the input is not valid
                    else{
                        System.out.println("Sorry, that is not a valid input.");
                    } // end of else 6 
                
                    
                    
                } // end of if 4
                
                // if 5 the number is not divisible by 4
                else if(divisibleBy4.equals("n")||divisibleBy4.equals("N")){
                    // asking wether the nubmer is divisible by 5
                    System.out.print("Is it divisible by 5?");
                    // declare a string
                    String divisibleBy5 = myScanner.next();
                    
                    // if the number is divisible by 5
                    if(divisibleBy5.equals("y")||divisibleBy5.equals("Y")){
                        // asking whether the number is 10
                        System.out.print("Is the number 10?");
                        // declare a string
                        String number10 = myScanner.next();
                        // if the number is 10
                        if(number10.equals("y")||number10.equals("Y")){
                            System.out.println("Yay!");
                        }
                        // if the number is not 10
                        else if(number10.equals("n")||number10.equals("N")){
                            System.out.println("If you are not lying, the number should be 10.");
                        }
                        // else if the input is not valid
                        else{
                            System.out.println("Sorry, that is not a valid input.");
                        }
              
                    } // end of if 
                    // if the number is not divisible by 5
                    else if(divisibleBy5.equals("n")||divisibleBy5.equals("N")){
                        // asking whether the question is 2
                        System.out.print("Is the number 2?");
                        // declare a string
                        String number2 = myScanner.next();
                        // if the number is 2
                        if(number2.equals("Y")||number2.equals("y")){
                            System.out.print("Yay!");
                        }
                        // if the number is not 2
                        else if(number2.equals("n")||number2.equals("N")){
                            System.out.println("If you are not lying, the number should be 2.");
                        }
                        // else if the input is not valid 
                        else{
                            System.out.print("Sorry, that is not a valid input.");
                        }
                    }
                    
                    else{
                        System.out.println("Sorry, that is a not valid input.");
                    }
                    
                } // end of if 5  
                
                // else if 3 the answer is not valid
                else{
                    System.out.println("Sorry, that is not a valid input.");
                } // end of else 3
             
            } // end of if 3
            
            // else if 2 the number is not valid
            else{
                System.out.println("Sorry, that is not a valid input.");
            } // end of else if 2
        
        } // end of if 1
            
        // if 2 the number is not even
        else if(even.equals("n")||even.equals("N")){
                // print out a question asking for whether a number is even
                System.out.print("Is it dvisible by 3?");
                // declare a string 
                String divisibleBy3 = myScanner.next();
                // if the number is divisible by 3
                if(divisibleBy3.equals("y")||divisibleBy3.equals("Y")){
                    System.out.print("When divided by 3 is the result greater than 1?");
                    String dividedBy3GreaterThan1 = myScanner.next();
                    // if the number is divided by 3 greater than 1
                    if(dividedBy3GreaterThan1.equals("y")||dividedBy3GreaterThan1.equals("Y")){
                        System.out.print("Is the number 9?");
                        String number9 = myScanner.next();
                        if(number9.equals("y")||number9.equals("Y")){
                            System.out.print("Yay!");
                        }
                        else if(number9.equals("n")||number9.equals("N")){
                            System.out.print("If you are not lying, the number should be 9.");
                        }
                        else{
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    // if the number is divided by 3 not greater than1 
                    else if(dividedBy3GreaterThan1.equals("n")||dividedBy3GreaterThan1.equals("N")){
                        // asking whether the number is 3
                        System.out.print("Is the number 3?");
                        // declare a string
                        String number3 = myScanner.next();
                        // if the number is 3
                        if(number3.equals("y")||number3.equals("Y")){
                            System.out.println("Yay!");
                        }
                        // if the number is not 3 but the user is lying
                        else if(number3.equals("n")||number3.equals("N")){
                            System.out.println("If you are not lying, the number should be 3.");
                        }
                        // if the input is valid
                        else{
                            System.out.println("Sorry, that is not a valid input.");
                        }   
                    }
                    // if it is not a valid input 
                    else{
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
                // if the number is not divisible by 3
                else if(divisibleBy3.equals("n")||divisibleBy3.equals("N")){
                    System.out.print("Is it greater than 6?");
                        String greaterThan6 = myScanner.next();
                        
                        // if the number is greater than 6
                        if(greaterThan6.equals("y")||greaterThan6.equals("Y")){
                            System.out.print("Is the number 7?");
                            String number7 = myScanner.next();
                            // if the nubmer is 7
                            if(number7.equals("y")||number7.equals("Y")){
                                System.out.println("Yay!");
                            }
                            // if the number is not 7 but the user is lying
                            else if(number7.equals("n")||number7.equals("N")){
                                System.out.println("If you are not lying, the answer should be 7.");
                            }
                            // if it is not a valid input
                            else{
                                System.out.println("Sorry, that is not a valid input.");
                            }
                       
                        } // end of greater than 6
                        
                        //if the number is not greater than 6
                        else if(greaterThan6.equals("n")||greaterThan6.equals("N")){
                            System.out.print("Is it less than 3?");
                            String lessThan3 = myScanner.next();
                            // if the number is less than 3
                            if(lessThan3.equals("Y")||lessThan3.equals("y")){
                                System.out.print("Is the number 1?");
                                String number1 = myScanner.next();
                                // if the number is 1
                                if(number1.equals("y")||number1.equals("Y")){
                                    System.out.println("Yay!");
                                }
                                // if the number is not equal to 1
                                else if(number1.equals("N")||number1.equals("N")){
                                    System.out.println("If you are not lying, the number should be 1.");
                                }
                                // if it is not a valid input
                                else{
                                    System.out.println("Sorry, that is not a valid input.");
                                }
                            }
                            // if the number is less than 3
                            else if(lessThan3.equals("n")||lessThan3.equals("N")){
                                // asking whether the number is 5
                                System.out.print("Is the number 5?");
                                // dclare a string
                                String number5 = myScanner.next();
                                // if the number is 5
                                if(number5.equals("y")||number5.equals("Y")){
                                    System.out.println("Yay!");
                                }
                                // if the number is not 5
                                else if(number5. equals("n")||number5.equals("N")){
                                    System.out.println("If you are not lying, the numbe should be 5.");
                                }
                                // if it is not a valid input
                                else{
                                    System.out.print("Sorry, that is not a valid number.");
                                }
                                }
                            // if it is not a valid input
                            else{
                                System.out.println("Sorry, that is not a valid input.");
                            }
                        }
                        // if it is not a valid input 
                        else{
                            System.out.println("Sorry, that is not a valid input.");
                        }
                }
                // else if the input is not valid
                else{
                    System.out.println("Sorry, that is not a valid input");
                }
                
                
        } // end of if 2
        
        // else if 1 the number is not valid
        else{
            System.out.println("Sorry, that is not a valid input.");
        } // end of else if 1
        
        
    } // end of method 
    
} // end of the class
