//Siyi Feng
//Janaury 30th 2015
//Lab 2
//Cyclometer Program
//This program 
//
// define a class
public class Cyclometer {
    // define main method 
   	public static void main(String[] args) {
   	    
   	    // input data
	   	int secsTrip1=480;  // time used for trip 1 
       	int secsTrip2=3220; // time used for trip 2
		int countsTrip1=1561; // counts of wheel rotation of trip 1  
		int countsTrip2=9037; // counts of wheel rotation of trip 2
		
		// intermediate variables and output data
		double wheelDiameter=27.0,  // the diameter of the wheel    
		PI=3.14159, //  the constant, pi
		feetPerMile=5280,  // 1 mile=5280 ft
		inchesPerFoot=12,   // 1 ft=12 inches
		secondsPerMinute=60;  // 1 min=60 sec
		double distanceTrip1, distanceTrip2,totalDistance;  // declare variables
		
		// print out the numbers of seconds and the counts
		System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
	        		
	    // calculation of distances of trip 1 and trip 2 
	    distanceTrip1=countsTrip1*wheelDiameter*PI;// total distance of trip 1 in inches
	    distanceTrip1/=inchesPerFoot*feetPerMile; // total distance of trip 1 in miles
	    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // total distance of trip 2 in miles
	    totalDistance=distanceTrip1+distanceTrip2;// total distance of both trip 1 and trip 2
	    
	    // print out the distances of trip 1 and trip 2 in the unit of mile and the total distance of both trip 1 and trip 2
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
    	System.out.println("The total distance was "+totalDistance+" miles");
	}  //end of main method   
} //end of class