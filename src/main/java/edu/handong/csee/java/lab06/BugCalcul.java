package edu.handong.csee.java.lab06;
import java.util.Scanner; // 

public class BugCalcul {
	
	
	
	public static void main(String[] args) {  // public method main is made
	
		double GrowthRate =0.95;
		double One_Bug_Vol=0.002;
		int StartPopul;
		int HouseVol;
		int CountWeeks=0;
		double population= 0;
		double TotalBugVol=0;
		double NewBugs;
		double NewBugVol;
		
		Scanner keyboard = new Scanner(System.in); //instantiating my keyboard
		System.out.println("Enter the total volume of your house in cubic feet:");
		HouseVol = keyboard.nextInt();
		System.out.println("Enter the estimated number of roaches in your house:");
		StartPopul = keyboard.nextInt();
		

        while (TotalBugVol < HouseVol)
        {
        	NewBugs = StartPopul * GrowthRate;
        	
            NewBugVol = NewBugs * One_Bug_Vol;

            population = population + NewBugs;

            TotalBugVol = TotalBugVol + NewBugVol;

            CountWeeks = CountWeeks + 1;
        }

        System.out.println("Starting with a roach population of "+StartPopul+" and a house with a volume of "+HouseVol+" cubic feet, after "+CountWeeks+" weeks, the house will be filled with"+population+"roaches. They will fill a volume of "+TotalBugVol+" cubic feet. Better call Debugging Experts Inc.");

		
		
		
		
		
		
	}
	
	
}
