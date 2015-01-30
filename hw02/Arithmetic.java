//Siyi Feng
//Homework 2
// Arithmetic Calculations Program
//
//  define a class
public class Arithmetic {
    public static void main(String[] args) {
        
        // input variables
        int nSocks=3;// number of pairs of socks
        double sockCost$=2.58;// cost per pair of socks (‘$’ is part of the variable name)
        int nGlasses=6;// number of drinking glasses
        double glassCost$=2.29;// cost per glass
        int nEnvelopes=1;// number of boxes of envelopes
        double envelopeCost$=3.25;// cost per box of envelopes
        double taxPercent=0.06;// tax percent in PA 
        
        // intermediate variables and output data
        // total cost of each kind of item
        double totalSockCost$; // total cost of socks
        double totalGlassCost$;// total cost of glasses
        double totalEnvelopeCost$; // total cost of boxes of envelopes
        // sales tax for each total cost of each item  and total tax
        double sockTax; // sales tax for sockes
        double glassTax; // sales tax for glasses
        double envelopeTax; // sales tax for boxes of envelopes
        double totalTax; // total tax of the transaction
        // total cost before or after tax
        double totalCostBeforeTax$; // total cost of purchases before tax
        double totalCostAfterTax$; // total cost of transaction with tax
        
        // calculations 
        // total cost of each kind of item
        totalSockCost$=nSocks*sockCost$;
        totalGlassCost$=nGlasses*glassCost$;
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        // sales tax for the total cost of each kind of item
        sockTax=(nSocks*sockCost$)*taxPercent;
        glassTax=(nGlasses*glassCost$)*taxPercent;
        envelopeTax=(nEnvelopes*envelopeCost$)*taxPercent;
        // total cost of purchases (before tax)
        totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        // total actually paid for this transaction, including sales tax
        totalTax=sockTax+glassTax+envelopeTax; // total tax of the transaction
        totalCostAfterTax$=totalTax+totalCostBeforeTax$; // total cost of the transaction with tax
    
        // print out results of calculations 
        // the heading of the chart
        System.out.println("The item is sock.");//item 1
        System.out.println("The number of socks is "+nSocks+".");//the number of item 1
        System.out.println("The cost per sock is $"+sockCost$+".");// price of item 1
        System.out.println("The sales tax of socks is $"+sockTax+".");// tax of item 1
        System.out.println("The item is drinking glass.");// item 2
        System.out.println("The number of drinking glasses is "+nGlasses+".");// the number of item 2 
        System.out.println("The cost per sock is $"+glassCost$+".");// price of item 2
        System.out.println("The sales tax of socks is $"+glassTax+".");// tax of item 2
        System.out.println("The item is envelope.");// item 3
        System.out.println("The number of boxes of envelopes is "+nEnvelopes+".");// the number of iiem 3
        System.out.println("The cost per sock is $"+envelopeCost$+".");// price of item 3
        System.out.println("The sales tax of socks is $"+envelopeTax+".");// tax of item 3
        System.out.println("The total cost of the purchases (before tax) is $"+totalCostBeforeTax$+".");// total cost before tax
        System.out.println("The total cost of the sales tax is $"+ totalTax+".");// total tax
        System.out.println("The total cost of the purchases (before tax) is $"+totalCostAfterTax$+".");// total cost before tax
    }
}