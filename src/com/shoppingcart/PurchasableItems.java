package com.shoppingcart;
import java.util.ArrayList;
import java.util.Random;

public class PurchasableItems
{
    private ArrayList<Purchasable> Items;


    public PurchasableItems()
    {
        Items = new ArrayList<>();
    }

    public PurchasableItems(ArrayList<Purchasable> list)
    {
        Items = list;
    }
    
    public void createItem(int stock, double price, String name)
    {
        int barcode = getUniqueBarcode();
        for (int x = 0; x < Items.size(); x++)
        {
            do
            {
                barcode = getUniqueBarcode();
            }
            while(barcode != Items.get(x).getBarcode()); // Changes barcode in loop until doesnt equal an existing barcode
        }
        Purchasable item = new Purchasable(stock, barcode, price, name);
        Items.add(item);
    }

    public int getUniqueBarcode()
    {
        Random rand = new Random();
        int randNum = rand.nextInt(1000, 9999);
        return randNum;
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