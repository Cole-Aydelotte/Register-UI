package com.sms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Receipt 
{
    ArrayList<String> items = new ArrayList();
    int phoneNumber;
    public Receipt(int pn)
    {
        this.phoneNumber = pn;
    }

    public void sendReceipt()
    {

    }

    public void addItem(String item)
    {
        items.add(item);
    }
}
