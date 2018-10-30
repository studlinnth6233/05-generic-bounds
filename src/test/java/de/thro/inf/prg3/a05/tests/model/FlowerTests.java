package de.thro.inf.prg3.a05.tests.model;

import de.thro.inf.prg3.a05.model.Flower;
import de.thro.inf.prg3.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Peter Kurfer
 * Created on 11/2/17.
 */
class FlowerTests {

	@Test
	void testCreateGreenFlower() {
		assertThrows(IllegalArgumentException.class, () -> new Flower("Rosa", "Abracadabra", 0.5, PlantColor.GREEN));
	}

	@Test
	void testCreateFlowerWithEmptyName() {
		assertThrows(IllegalArgumentException.class, () -> new Flower("Rosa", null, 0.5, PlantColor.RED));
	}

	@Test
	void testCreateFlowerWithEmptyFamily() {
		assertThrows(IllegalArgumentException.class, () -> new Flower(null, "Abracadabra", 0.5, PlantColor.RED));
	}

	@Test
	void testCreateFlowerWithNegativeHeight() {
		assertThrows(IllegalArgumentException.class, () -> new Flower("Rosa", "Abracadabra", -0.5, PlantColor.RED));
	}

	@Test
	void testGetCorrectColor() {
		Flower f = new Flower("Rosa", "Abracadabra", 0.5, PlantColor.RED);
		assertEquals(PlantColor.RED, f.getColor());
	}

	@Test
	void testGetCorrectHeight() {
		Flower f = new Flower("Rosa", "Abracadabra", 0.5, PlantColor.RED);
		assertEquals(0.5, f.getHeight(), 0.0000001);
	}

	@Test
	void testGetCorrectName() {
		Flower f = new Flower("Rosa", "Abracadabra", 0.5, PlantColor.RED);
		assertEquals("Abracadabra", f.getName());
	}

	@Test
	void testGetCorrectFamily() {
		Flower f = new Flower("Rosa", "Abracadabra", 0.5, PlantColor.RED);
		assertEquals("Rosa", f.getFamily());
	}
}
