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
    
    public ShoppingCart(){}
    
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