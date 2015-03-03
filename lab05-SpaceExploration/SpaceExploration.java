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
    public static void mian(String[] args){
        int year1=(int) (Math.random()*11)+2000;
        int year2=(int) (Math.random()*11)+2000;
        System.out.print("Here is a timeline of space exploration events from "+year1+" to "+year2);
        switch (year){
            case 2000:
                System.out.print("2000: First spacecraft orbits an asteroid");
                break;
            case 2001:
                System.out.print("2001: First spacecraft lands on asteroid");
                break;
            case 2002:
                System.out.print("2002: N/A");
                break;
            case 2003:
                System.out.print("2003: Largest infrared telescope released");
                break;
            case 2004:
                System.out.print("2004: First spacecraft orbits an asteroid");
                break;
            case 2005:
                System.out.print("2005: Spacecraft collies with comet");
                break;
            case 2006:
                System.out.print("2005: Spacecraft returns with collections from a comet");
                break;
            
            case 2008:
                System.out.print("2008: Kepler launched to study deep space");
                break;
            case 2009:
                System.out.print("2009: Spacecraft collies with comet");
                break;
            case 20010:
                System.out.print("2010: SpaceX sucessfully sends spacecraft to orbit and back");
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