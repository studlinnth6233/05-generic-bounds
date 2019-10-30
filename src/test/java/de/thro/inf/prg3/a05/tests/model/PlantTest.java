package de.thro.inf.prg3.a05.tests.model;

import de.thro.inf.prg3.a05.model.Flower;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantColor;
import de.thro.inf.prg3.a05.model.Shrub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlantTest
{
	@Test
	void testCreateShrub()
	{
		double height = 1.4;
		String family = "Shrub";
		String name   = "Hans";

		Plant shrub = new Shrub(height, family, name);

		assertEquals(shrub.getHeight(), height);
		assertEquals(shrub.getFamily(), family);
		assertEquals(shrub.getName(),   name);
		assertEquals(shrub.getColor(),  PlantColor.GREEN);
	}

	@Test
	void testCreateFlower()
	{
		double height    = 0.3;
		String family    = "Flower";
		String name      = "Sepp";
		PlantColor color = PlantColor.BLUE;

		Plant flower = new Flower(height, family, name, color);

		assertEquals(flower.getHeight(), height);
		assertEquals(flower.getFamily(), family);
		assertEquals(flower.getName(),   name);
		assertEquals(flower.getColor(),  color);
	}

	@Test
	void testCreateFlowerException()
	{
		double height    = 0.3;
		String family    = "Flower";
		String name      = "Sepp";
		PlantColor color = PlantColor.GREEN;

		assertThrows(IllegalArgumentException.class, () -> new Flower(height, family, name, color));
	}
}