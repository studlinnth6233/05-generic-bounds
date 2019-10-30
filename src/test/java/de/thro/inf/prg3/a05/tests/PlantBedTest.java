package de.thro.inf.prg3.a05.tests;

import de.thro.inf.prg3.a05.PlantBed;
import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.model.Flower;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantColor;
import de.thro.inf.prg3.a05.model.Shrub;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTest
{
    @Test
    public void testAddShrubs()
    {
        PlantBed<Shrub> bed = new PlantBed<>();

        IntStream.range(0, 5).mapToObj(i -> new Shrub(0.0, "", "")).forEach(bed::add);

        assertEquals(bed.size(), 5);
    }

    @Test
    public void testAddFlowers()
    {
        PlantBed<Flower> bed = new PlantBed<>();

        IntStream.range(0, 5).mapToObj(i -> new Flower(0.0, "", "", PlantColor.BLUE)).forEach(bed::add);

        assertEquals(bed.size(), 5);
    }

    @Test
    public void testAddBoth()
    {
        PlantBed<Plant> bed = new PlantBed<>();

        IntStream.range(0, 5).mapToObj(i -> new Shrub(0.0, "", "")).forEach(bed::add);
        IntStream.range(0, 5).mapToObj(i -> new Flower(0.0, "", "", PlantColor.BLUE)).forEach(bed::add);

        assertEquals(bed.size(), 10);
    }

    @Test
    public void testGetByColor()
    {
        PlantBed<Flower> bed = new PlantBed<>();

        Arrays.stream(PlantColor.values()).filter(color -> color != PlantColor.GREEN).map(color -> new Flower(0.0, "", "", color)).forEach(bed::add);

        assertEquals(bed.size(), PlantColor.values().length - 1);

        SimpleList<Flower> filtered = bed.getPlantsByColor(PlantColor.RED);

        assertEquals(filtered.size(), 1);
    }
}