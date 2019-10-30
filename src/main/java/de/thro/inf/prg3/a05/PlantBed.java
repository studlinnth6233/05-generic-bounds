package de.thro.inf.prg3.a05;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.collections.SimpleListImpl;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantColor;

public class PlantBed<T extends Plant>
{
    private SimpleList<T> plants;

    /**
     * Constructor
     * Initialize the internal list of plants
     */
    public PlantBed()
    {
        this.plants = new SimpleListImpl<>();
    }

    /**
     * Add a new plant to the bed
     *
     * @param plant The plant to add
     */
    public void add(T plant)
    {
        this.plants.add(plant);
    }

    /**
     * Get the amount of plants in the bed
     *
     * @return The amount of plants in the bed
     */
    public int size()
    {
        return this.plants.size();
    }

    /**
     * Create a list only containing plants in the desired color
     *
     * @param color The color to filter for
     *
     * @return List only containing plants in the desired color
     */
    SimpleList<T> getPlantsByColor(PlantColor color)
    {
        return this.plants.filter(plant -> plant.getColor() == color);
    }
}