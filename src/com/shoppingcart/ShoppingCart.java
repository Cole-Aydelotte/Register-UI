package com.shoppingcart;

import java.util.ArrayList;

/**
 * The shopping cart class can be instantiated through a 
 * constructor with no parameter, this instatntiates the 
 * Items ArrayList. this list can be manipulated through
 * the following methods; addItem, removeItem, and
 * sortShoppingCart.
 */
public class ShoppingCart 
{
    private ArrayList<Item> items;
    
    /**
     * empty constructor
     */
    public ShoppingCart(){}
    
    /**
     * constructor that takes a ArrayList as a parameter and 
     * sets the private variable equal to the parameter.
     * @param theList
     */
    public ShoppingCart(ArrayList<Item> theList)
    {
        items = theList;
    }

    public void removeItem(Item it)
    {
        items.remove(it);
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }
}