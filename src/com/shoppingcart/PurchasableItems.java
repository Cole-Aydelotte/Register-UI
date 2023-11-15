package com.shoppingcart;
import java.util.ArrayList;
import java.util.Random;

public class PurchasableItems
{
    private ArrayList<Purchasable> Items;

    /**
     * Base case contructor; sets the private variable Items
     * equal to a new ArrayList containing Purchasables.
     */
    public PurchasableItems()
    {
        Items = new ArrayList<>();
    }

    
    
    /**
     * Constructor that takes a ArrayList containing Purchasables
     * as a parameter and sets the private variable Items equal to
     * the parameter list.
     */
    public PurchasableItems(ArrayList<Purchasable> list)
    {
        Items = list;
    }

    /**
     * Calls the constructor of Purchasable using the three
     * parameters and a four digit number recieved from 
     * getBarcode().
     */
    public void createItem(int stock, double price, String name)
    {
        int barcode = getBarcode();
        for (int x = 0; x < Items.size(); x++)
        {         
            do
            {
                barcode = getBarcode();
            }
            while(barcode == Items.get(x).getBarcode());
        }
        Purchasable item = new Purchasable(stock, barcode, price, name);
        Items.add(item);
    }

    /**
     * Generates a unique four digit number and returns
     * the Result.
     */
        public int getBarcode()
    {
        Random rand = new Random();
        int randNum = rand.nextInt(1000, 9999);
        return randNum;
    }

    public ArrayList<Purchasable> getItems()
    {
        return Items;
    }

    @Override
    public String toString()
    {
        String to = "";
        for (int x = 0; x < Items.size(); x++)
        {
            if(x == 0)
            {
                to += Items.get(x);
            }
            else
            {
                to += ", " + Items.get(x);
            }
        }
        return to;
    }
}