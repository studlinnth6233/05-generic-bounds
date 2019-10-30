package de.thro.inf.prg3.a05.utils;

import de.thro.inf.prg3.a05.PlantBed;
import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility
{
    private PlantBedUtility() { }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> plantBed)
    {
        Map<PlantColor, SimpleList<T>> result = new HashMap<>();

        for (PlantColor color : PlantColor.values())
            result.put(color, plantBed.getPlantsByColor(color));

        return result;
    }
}