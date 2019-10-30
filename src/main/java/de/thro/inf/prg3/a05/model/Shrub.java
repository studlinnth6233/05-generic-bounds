package de.thro.inf.prg3.a05.model;

public class Shrub extends Plant
{
    /**
     * Constructor
     * Sets all basic attributes for the plant
     *
     * @param height The height of the plant
     * @param family The family of the plant
     * @param name   The name of the plant
     */
    public Shrub(double height, String family, String name)
    {
        super(height, family, name, PlantColor.GREEN);
    }
}