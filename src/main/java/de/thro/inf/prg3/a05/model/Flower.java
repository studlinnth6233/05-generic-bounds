package de.thro.inf.prg3.a05.model;

public class Flower extends Plant
{
    /**
     * Constructor
     * Sets all basic attributes for the plant
     *
     * @param height The height of the plant
     * @param family The family of the plant
     * @param name   The name of the plant
     * @param color  The color of the plant
     */
    public Flower(double height, String family, String name, PlantColor color)
    {
        super(height, family, name, color);

        if (color == PlantColor.GREEN)
            throw new IllegalArgumentException("Flower can't be green !!!");
    }
}