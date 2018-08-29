import cs1.Keyboard;
import java.util.Scanner;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99


public class KingsIsland
{
	public static void main(String[] args)
	{
		Scanner myscanner = new Scanner(System.in);
		//Declare variables for the number of people, parking cost, food cost, total cost, cost per person
        int people;
        double parking, food, total, costperperson, ticket;


		//Prompt for and read in the number of people in the group
        System.out.print("Enter the number of people: ");
        people = Keyboard.readInt();
        ticket = 32.99 * people;

		//Prompt for and read in the cost of parking
		System.out.print("Enter the cost of parking: ");
        parking = Keyboard.readDouble();


		//Prompt for and read in the amount spent on food
		System.out.print("Enter the amount spent on food: ");
        food = Keyboard.readDouble();


		//Calculate the total expenses
		total = ticket + parking + food;
		System.out.println("Total Cost: " + total);
		costperperson = total/people;



		//Calculate the average per person
		System.out.println("Cost per person: " + costperperson);


		//Display results


	}
}