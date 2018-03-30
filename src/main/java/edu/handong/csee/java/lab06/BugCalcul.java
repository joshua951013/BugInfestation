package edu.handong.csee.java.lab06;//package name
import java.util.Scanner;  //the following package is imported for the use

/**
 * This is class defining the BugCalcul object.
 * This will read in the data for the vol of the house 
 * and the number of bugs in the house then calculate the number of weeks that will take
 * the bug to fill the house as it reproduce. This will also calculate for the total number of bugs when 
 * the house is full of it. 
 * @author √÷¡ÿ»Ò
 *
 */
public class BugCalcul {// class named bugcalcul is made
	
	static double GROWTH_RATE = 0.95; // the constant with double type growth rate is given
    static double ONE_BUG_VOLUME = 0.002; // the constant with double type bugs vol is given

/**
 * This is the main method for the calculation.
 * instance var are given and with those data, we can get the result informed above.
 * 
 * @param args string array containing the command line arguments
 */
    
    public static void main (String [] args){// main is made
 
        double houseVolume; // instance var in double type
    	int startPopulation; // instance var in int type
    	Scanner keyboard = new Scanner (System.in); //instantiating the scanner
        System.out.println ("Enter the total volume of your house in cubic feet: ");// prints out the following 
        houseVolume = keyboard.nextDouble (); // gets in the data from the keyboard to houseVolume
        System.out.println ("Enter the estimated number of roaches in your house: ");// prints out the following
        startPopulation = keyboard.nextInt (); //gets in the data from the keyboard to startPopulation
        
        double population = startPopulation;// instance var with the type double and its value 
        double totalBugVolume = population * ONE_BUG_VOLUME; // instance var with the type double and its value 
        double newBugs, newBugVolume;// instance var with the type double 
        int countWeeks = 0;// instance var with the type int with its value
        
        while (totalBugVolume < houseVolume)// loop statement for the efficient calculation 
        {
            newBugs = population * GROWTH_RATE;// giving the value(calculation) for newbugs
            
            newBugVolume = newBugs * ONE_BUG_VOLUME;// giving the value(calculation) for newBugVolume
            
            population = population + newBugs;// giving the value(calculation) for population
            
            totalBugVolume = totalBugVolume + newBugVolume;// giving the value(calculation) for totalBugVolume
            
            countWeeks = countWeeks + 1; //add count with 1 and return its value to it
        }
        System.out.println ("Starting with a roach population of " +startPopulation); //prints out the following
        System.out.println ("and a house with a volume of " + houseVolume +" cubic feet,");//prints out the following
        System.out.println ("after " + countWeeks + " weeks,");//prints out the following
        System.out.println ("the house will be filled with " + population + " roaches.");//prints out the following
        System.out.println ("They will fill a volume of " + totalBugVolume + " cubic feet.");//prints out the following
        System.out.println ("Better call Debugging Experts Inc.");//prints out the following
    }
}