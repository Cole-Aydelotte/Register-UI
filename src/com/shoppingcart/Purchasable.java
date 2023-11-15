package com.shoppingcart;

public class Purchasable
{
    private int stock;
    private int barcode;
    private double price;
    private String name;

    /**
     * A constructor that takes four parameters and intatiates the private
     * variables with those values.
     */
    public Purchasable(int stock, int barcode, double price, String name)
    {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice()
    {
        return price;
    }

    public int getBarcode()
    {
        return  barcode;
    }

    public String getName()
    {
        return name;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int num)
    {
        this.stock = num;
    }
}