package de.thro.inf.prg3.a05.tests.utils;

import de.thro.inf.prg3.a05.PlantBed;
import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.model.Flower;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantColor;
import de.thro.inf.prg3.a05.model.Shrub;
import de.thro.inf.prg3.a05.utils.PlantBedUtility;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedUtilityTest
{
    @Test
    public void testGetByColor()
    {
        PlantBed<Flower> bed = new PlantBed<>();

        for (PlantColor color : PlantColor.values())
        {
            if (color != PlantColor.GREEN)
            {
                for (int i = 0; i < 5; i ++)
                    bed.add(new Flower(0.0, "", "", color));
            }
        }

        Map<PlantColor, SimpleList<Flower>> map = PlantBedUtility.splitBedByColor(bed);

        assertEquals(map.keySet().size(), PlantColor.values().length);

        for (Map.Entry<PlantColor, SimpleList<Flower>> entry : map.entrySet())
            if (entry.getKey() != PlantColor.GREEN)
                assertEquals(entry.getValue().size(), 5);
    }
}