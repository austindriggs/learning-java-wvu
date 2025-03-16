/**
* @author Austin Driggs
* CS 110 Section 011
* Horse Assignment
* 9/16/22
*/

import java.util.Scanner;

public class HorseAssignment {
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);

    //User inputs for name, breed, age, and weight
        System.out.print("Enter the name of your horse: ");
        String name = scan.nextLine();

        System.out.print("\nEnter the breed of your horse: ");
        String breed = scan.nextLine();

        System.out.print("\nEnter the age of your horse: ");
        int age = scan.nextInt();

        System.out.print("\nEnter the weight in pounds of your horse: ");
        double weight = scan.nextDouble();
    
    // Calculations for amount of feed needed
        double baseGrainAmount = weight / 100.0;
        double lowGrainAmount = baseGrainAmount * 0.4;
        double highGrainAmount = baseGrainAmount * 0.6;
        double averageGrainAmount = (lowGrainAmount + highGrainAmount) / 2.0;
        double yearGrainAmount = averageGrainAmount * 365;

        double yearFeedBags = Math.ceil(yearGrainAmount / 50);

    // Input for the cost of the feed
        System.out.print("\nEnter the name of the type of feed that will be fed to the horse: ");
        String dummyScanner1 = scan.nextLine();
        String feedName = scan.nextLine();

        System.out.print("\nEnter the price for a 50lb bag of " + feedName + " feed: ");
        double feedPrice = scan.nextDouble();

        double yearFeedCost = yearFeedBags * feedPrice;

    // Output for feed
        System.out.printf("\n%s, a %d year old %s horse weighing %.1f pounds, should receive %.1f pounds of %s feed per day. " 
        		+ "A 50lb bag will cost $%.2f.\n%s will eat %.1f pounds per year which is %.0f bags at a total cost of $%.2f.", 
        		name, age, breed, weight, averageGrainAmount, feedName, feedPrice, name, yearGrainAmount, yearFeedBags, yearFeedCost);

    // User input for hay
        System.out.print("\n\nEnter the type of hay: ");
        String dummyScanner2 = scan.nextLine();
        String hayType = scan.nextLine();

        System.out.print("\nEnter the cost per 50lb bale of hay: ");
        Double hayPrice = scan.nextDouble();

    // Calculations for hay
        // Horses eat on average half of a 50 pound bale of hay each day
        double hayBales = Math.ceil(0.5 * 365.0);
        double hayCost = hayBales * hayPrice;
    
    // Output for hay
        System.out.printf("\n%s will also eat approximately 1/2 of a bale of %s hay per day. "
        		+ "\nThis will require %.0f bales at a cost of $%.2f per bale. "
        		+ "\nThis will be $%.2f per year.", name, hayType, hayBales, hayPrice, hayCost);

    // Final calculations
        double totalCost = hayCost + yearFeedCost;
        System.out.printf("\n\n%s will cost a total of $%.2f to feed each year for grain and hay.", name, totalCost);
    
    }
}