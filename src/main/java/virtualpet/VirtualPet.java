package virtualpet;

public class VirtualPet {
	
	private int hunger;
	private int thirst;
	private int bathroom;
	private int energy;

	public VirtualPet(int hunger, int thirst, int bathroom, int energy) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.bathroom = bathroom;
		this.energy = energy;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBathroom() {
		return bathroom;
	}

	public int getEnergy() {
		return energy;
	}

	public void feed(int amountToFeed) {
		hunger -= amountToFeed;
	}

	public void water(int amountToWater) {
		thirst -= amountToWater;
	}

	public void letOut(int amountToBathroom) {
		bathroom -= amountToBathroom;
	}

	public void play(int amountToEnergy) {
		energy -= amountToEnergy;
	}

	public void tick() {
		hunger += 1;
		thirst += 1;
		bathroom += 1;
		energy += 1;
	}
}
