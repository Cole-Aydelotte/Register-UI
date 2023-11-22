package com.shoppingcart;

import java.util.ArrayList;

import com.sms.Receipt;

public class Purchase 
{
    private ArrayList<Item> cart;
    private ArrayList<Purchasable> purrList;
    private Receipt receipt;

    /**
     * actual transaction occuring takes a ShoppingCart, PurchasableItems, and Phone number
     * iterates through each item in the cart, and for each item iterates over all of the 
     * purchasable items and removes the amount of quantiy the cart from the stock and 
     * then adds that item to the receipt, and sends the receipt.
     * 
     * TODO: Make it so you cannot buy more quantity than stock left
     * 
     * TODO: Make it so you can remove items from the purchasable list.
     */
    public Purchase(ShoppingCart passCart, PurchasableItems purchasableItems, int pN)
    {
        cart = passCart.getItems();
        purrList = purchasableItems.getItems();
        receipt = new Receipt(pN);

        for(int x = 0; x < cart.size(); x++)
        {
            for(int y = x + 1; y < purrList.size(); y++)
            {
                if (cart.get(x).getName() == purrList.get(y).getName())
                {
                    purrList.get(y).setStock((purrList.get(y).getStock() - cart.get(x).getQuantity()));
                    receipt.addItem(purrList.get(y).getName());
                }
            }
        }
        receipt.sendReceipt();
    }
}
