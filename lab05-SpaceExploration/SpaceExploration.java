//Siyi Feng
//Lab 05
//SpaceExploration Program
/*This program generates a random number with the range 
of 2000 to 2010, and list all the space exploration advances
*/
//
//define a class
public class SpaceExploration{
    // define a method
    public static void main(String[] args){
        int year=(int) (Math.random()*11)+2000;
        
        System.out.println("Here is a timeline of space exploration events from "+year+" to " +2000);
        switch (year){
           
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
               
            case 2009:
                System.out.println("2009: Spacecraft collies with comet");
                
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");
                
            case 2006:
                System.out.println("2005: Spacecraft returns with collections from a comet");
                
            case 2005:
                System.out.println("2005: Spacecraft collies with comet");
              
            case 2004:
                System.out.print("2004: First spacecraft orbits an asteroid");
               
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
                
            case 2002:
                System.out.println("2002: N/A");
               
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
        
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
        }
    }
}

/*

2000
First spacecraft orbits an asteroid
2001
First spacecraft lands on asteroid
2003
Largest infrared telescope released
2005
Spacecraft collies with comet
2006
Spacecraft returns with collections from a comet
2008
Kepler launched to study deep space
2010
SpaceX sucessfully sends spacecraft to orbit and back

*/

/*
int year =(int)(Math.random()*(upperBound+1)) + baseNum;
int year =(int)(Math.random()*11) + 2000;
Here is a timeline of space exploration events from 2003 to 2000:
2003: Largest infrared telescope released
2002: N/A
2001: First spacecraft lands on asteroid
2000: First spacecraft orbits an asteroid

Here is a timeline of space exploration events from 2001 to 2000:
2001: First spacecraft lands on asteroid
2000: First spacecraft orbits an asteroid
*/