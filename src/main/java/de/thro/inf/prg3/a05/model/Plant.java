package de.thro.inf.prg3.a05.model;

public abstract class Plant implements Comparable<Plant>
{
    private double height;
    private String family;
    private String name;

    private PlantColor color;

    /**
     * Constructor
     * Sets all basic attributes for the plant
     *
     * @param height The height of the plant
     * @param family The family of the plant
     * @param name   The name of the plant
     * @param color  The color of the plant
     */
    public Plant(double height, String family, String name, PlantColor color)
    {
        this.height = height;
        this.family = family;
        this.name   = name;
        this.color  = color;
    }

    /**
     * GETTER : height
     *
     * @return The height of the plant
     */
    public double getHeight()
    {
        return this.height;
    }

    /**
     * GETTER : family
     *
     * @return The family of the plant
     */
    public String getFamily()
    {
        return this.family;
    }

    /**
     * GETTER : name
     *
     * @return The name of the plant
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * GETTER : color
     *
     * @return The color of the plant
     */
    public PlantColor getColor()
    {
        return this.color;
    }

    /**
     * Compares the plant to another one
     * Compares by name
     *
     * @param other The plant to compare to
     *
     * @return -1 / 0 / 1 based on order
     */
    @Override
    public int compareTo(Plant other)
    {
        return this.name.compareTo(other.name);
    }
}