//import a scanner
import java.util.Scanner;
//import a random
import java.util.Random;

public class Love{
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        Random myRandom=new Random();
        //DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
        
        double[][][][] array4D;
            array4D= new double[3][][][];
            
        int integer1;
        int integer2;
        double random;
        System.out.println("integer1:");
        integer1=myScanner.nextInt();
        integer2=myScanner.nextInt();
        for(int i=0;i<3;i++){
            array4D[i]=new double[(myRandom.nextInt(integer2-integer1)+integer1)][][];
            for(int j=0;j<array4D[i].length;j++){
                        array4D[i][j]=new double[(myRandom.nextInt(integer2-integer1)+integer1)][];
                    for(int l=0;l<array4D[i][j].length;l++){
                        array4D[i][j][l]=new double[(myRandom.nextInt(integer2-integer1)+integer1)];
                        for(int q=0;q<array4D[i][j][l].length;q++){
                                random=Math.random()*30;
                             array4D[i][j][l][q]= random;
                             System.out.println(array4D[i][j][l][q]);
                        }
                    }
                }
            }
    
	
       }
       }
    
        
    
    
/*
DecimalFormat oneDigit = new DecimalFormat("#,##0.0");//format to 1 decimal place

System.out.println(oneDigit.format(anyVariable)); //generic usage
*/