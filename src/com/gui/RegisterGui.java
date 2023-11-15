package com.gui;

import javax.swing.*;

import com.shoppingcart.Purchasable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterGui extends JFrame 
{
    private DefaultListModel<Purchasable> productListModel,cartListModel;
    private JList<Purchasable> productList;
    private JTextField searchField;
    private JButton addToCartButton, checkoutButton;
    private JList<Purchasable> carList;

    public RegisterGui()
    {
        setTitle("Kiosk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        //search bar
        searchField = new JTextField();
        searchField.setPreferredSize(new Dimension(300, 30));
        searchField.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                RegisterGuiFunctionality reg = new RegisterGuiFunctionality();
                reg.searchPurchasable(searchField.getText());
            }
        });

        
    }
}