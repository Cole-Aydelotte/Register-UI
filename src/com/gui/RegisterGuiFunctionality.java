package com.gui;

import com.shoppingcart.Item;
import com.shoppingcart.Purchasable;
import java.util.ArrayList;
import com.shoppingcart.PurchasableItems;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;

public class RegisterGuiFunctionality 
{
    private ArrayList<Item> cartItems;
    PurchasableItems items;
    public RegisterGuiFunctionality()
    {
        cartItems = new ArrayList<>();
        items = new PurchasableItems();
    }

    /**
     * Takes a search term as a parameter then checks to see
     * if the searchterm is in any of the purchasable items.
     */
    public void searchPurchasable(String searchTerm)
    {
        ArrayList<Purchasable> purItems;
        ArrayList<Purchasable> searchResults = new ArrayList<>();
        

        purItems = items.getItems();
        for (int x = 0; x < purItems.size(); x++)
        {
            if (purItems.get(x).getName().toLowerCase().contains(searchTerm.toLowerCase()))
            {
                searchResults.add(purItems.get(x));
            }
        }
        // update the Product list model
    }
}