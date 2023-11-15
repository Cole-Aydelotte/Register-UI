package com.Tests;

import static org.junit.Assert.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.shoppingcart.Purchasable;
import com.shoppingcart.PurchasableItems;

public class ShoppingCartTest
{
    @Test
    public void purchaseTest()
    {
        PurchasableItems pur = new PurchasableItems();
        
        pur.createItem(1,1,"Carrots");
        pur.createItem(2,2,"Chocolate");
        pur.createItem(3,3,"Cabbage");

        ArrayList<Purchasable> list = pur.getItems();

        for(int x = 0; x < list.size(); x++)
        {
            assertEquals(x + 1, list.get(x).getStock());
        }

        for(int x = 0; x < list.size(); x++)
        {
            assertEquals(x + 1, list.get(x).getPrice());
        }
    }
    
    @Test
    public void uniqueTest()
    {
        PurchasableItems pur = new PurchasableItems();
        ArrayList<Purchasable> list = pur.getItems();
        String test = "i";
        for(int x = 0; x < 1000; x++)
        {
            pur.createItem(3,3,test);
            list = pur.getItems();
            test += 'i';
        }


        for (int i = 0; i < list.size() - 1; i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(i).equals(list.get(j))) 
                {
                    assertNotEquals(list.get(i).getBarcode(), list.get(j).getBarcode());
                }
            }
        }
    }

    public static void main(String[] args)
    {
        PurchasableItems pur = new PurchasableItems();
        pur.createItem(1,1,"Carrots");
        pur.createItem(2,2,"Chocolate");
        pur.createItem(3,3,"Cabbage");
        System.out.println(pur);
    }
}