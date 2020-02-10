package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void shouldDecreaseHungerBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5); 
		underTest.feed(4); 
		int hunger = underTest.getHunger();
		assertEquals(1, hunger); 
	}

	@Test
	public void shouldDecreaseThirstBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.water(4);
		int thirst = underTest.getThirst();
		assertEquals(1, thirst);
	}

	@Test
	public void shouldDecreaseBathroomBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.letOut(4);
		int bathroom = underTest.getBathroom();
		assertEquals(1, bathroom);
	}

	@Test
	public void shouldDecreaseEnergyBy4() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.play(4);
		int energy = underTest.getEnergy();
		assertEquals(1, energy);
	}
	
	@Test
	public void shouldIncreaseHungerBy1() {
		VirtualPet underTest = new VirtualPet(5, 5, 5, 5);
		underTest.tick();
		int hunger = underTest.getHunger();
		assertEquals(6, hunger);
	}
}