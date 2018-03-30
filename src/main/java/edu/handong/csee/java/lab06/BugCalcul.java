package edu.handong.csee.java.lab06;
import java.util.Scanner;  

public class BugCalcul {
	
	static double GROWTH_RATE = 0.95; 
    static double ONE_BUG_VOLUME = 0.002; 
    
    public static void main (String [] args){
 
        double houseVolume;
    	int startPopulation;
    	Scanner keyboard = new Scanner (System.in);
        System.out.print ("Enter the total volume of your house in cubic feet: ");
        houseVolume = keyboard.nextDouble ();
        System.out.print ("Enter the estimated number of roaches in your house: ");
        startPopulation = keyboard.nextInt ();
        
        double population = startPopulation;
        double totalBugVolume = population * ONE_BUG_VOLUME;
        double newBugs, newBugVolume;
        int countWeeks = 0;
        
        while (totalBugVolume < houseVolume)
        {
            newBugs = population * GROWTH_RATE;
            
            newBugVolume = newBugs * ONE_BUG_VOLUME;
            
            population = population + newBugs;
            
            totalBugVolume = totalBugVolume + newBugVolume;
            
            countWeeks = countWeeks + 1;
        }
        System.out.print ("Starting with a roach population of " +startPopulation);
        System.out.print ("and a house with a volume of " + houseVolume +" cubic feet,");
        System.out.print ("after " + countWeeks + " weeks,");
        System.out.print ("the house will be filled with " + population + " roaches.");
        System.out.print ("They will fill a volume of " + totalBugVolume + " cubic feet.");
        System.out.print ("Better call Debugging Experts Inc.");
    }
}