package com.shoppingcart;

/**
 * The Item class has a constructor and a series of setters and
 * getters to access and mutate the local variables.
 */
public class Item 
{
    private String name;
    private double price;
    private int quantity;
    
    /**
     * Constructor takes three parameters and the local variables 
     * are then instantiated with those values.
     */
    public Item(String name, double price, int quantity) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
