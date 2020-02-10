package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet myPet = new VirtualPet(15, 15, 15, 15);
		System.out.println(
				"-----------****--------(00)------***------------------");
		System.out.println(
				"Welcome to Dayton Virtual Pet Program for All (DVPPA),Please Name your pet:");
		String petName = input.nextLine().trim();
		String petType = "";
		if (petName.equalsIgnoreCase("Bolt"))
			petType = "Disney Superhero Dog";
		else if (petName.equalsIgnoreCase("Magic"))
			petType = "Malvel Cat";
		else if (petName.equalsIgnoreCase("Bunny"))
			petType = "Zootopia Rabbit Police Officer";
		else if (petName.equalsIgnoreCase("Babe"))
			petType = " Pig raised by sheepdogs";
		else if (petName.equalsIgnoreCase("Simba"))
			petType = "The Lion King";
		else if (petName.equalsIgnoreCase("Mickey"))
			petType = "Mouse";
		else if (petName.substring(0, 1).equalsIgnoreCase("Ariel"))
			petType = "The Little Mermaid";
		else if (petName.substring(0, 1).equalsIgnoreCase("Mr. Big"))
			petType = "Crime Mafia Boss Rat";
		else if (petName.substring(0, 1).equalsIgnoreCase("c"))
			petType = "Crocodile of Botsanga";
		else if (petName.substring(0, 1).equalsIgnoreCase("Duluth"))
			petType = "DragonFyl Eagle";
		else if (petName.substring(0, 1).equalsIgnoreCase("ElBogo"))
			petType = "Elephant Chief Bogo";
		else if (petName.substring(0, 1).equalsIgnoreCase("Falcon"))
			petType = "Falco Bird";
		else if (petName.substring(0, 1).equalsIgnoreCase("Gaselle"))
			petType = "Pop Star Giraffe AKA Shakira";
		else
			petType = "Unknown";
		System.out.println("Your Pet's name " + petName + ". Pet type: " + petType + ".");

		String optionEntered = "";
		while (!optionEntered.equals("5")) {
			System.out.println(
					petName + "'s current status: Hunger=" + myPet.getHunger() + "/100, Thirst=" + myPet.getThirst()
							+ "/100, Bathroom=" + myPet.getBathroom() + "/100, and Energy=" + myPet.getEnergy() + "/100.");
			System.out.println("What would you like to do with " + petName + "?");
			System.out.println(
					"Please choose a number: 1 to Feed, 2 to Water, 3 to Go to the bathroom, 4 to Play, or 5 to Quit.");
			optionEntered = input.nextLine();

			if (optionEntered.equals("1")) {
				myPet.feed(10);
				myPet.water(-4);
				System.out.println("You have fed :" + petName + ", now thirst has increased.");
			}
			if (optionEntered.equals("2")) {
				myPet.water(10);
				myPet.letOut(-4);
				System.out.println("You have given water to :" + petName
						+ ", now to go to the bathroom has increased.");
			}
			if (optionEntered.equals("3")) {
				myPet.letOut(10);
				System.out.println("You have let: " + petName + "  to go to the bathroom.");
			}
			if (optionEntered.equals("4")) {
				myPet.play(10);
				System.out.println("You played with: " + petName + ".");
			}
			if (optionEntered.equals("5")) {
				System.out.println("Goodbye, " + petName + " the " + petType + "!!!");
				input.close();
				System.exit(0);
			}
			myPet.tick();
			System.out.println("Just to remind you that it been a while,others needs your attention!!!.");
		}
	}
}
