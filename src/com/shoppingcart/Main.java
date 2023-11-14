package com.shoppingcart;

public class Main
{
     public static void main(String[] args)
    {
        PurchasableItems pur = new PurchasableItems();
        pur.createItem(1,1,"Carrots");
        pur.createItem(2,2,"Chocolate");
        pur.createItem(3,3,"Cabbage");
        System.out.println(pur);
    }
}