/**
 * The shopping cart class can be instantiated through a 
 * constructor with no parameter, this instatntiates the 
 * Items ArrayList. this list can be manipulated through
 * the following methods; addItem, removeItem, and
 * sortShoppingCart.
 */
class ShoppingCart 
{
    items;
    
    /**
     * empty constructor
     */
    ShoppingCart(){}
    
    /**
     * constructor that takes a ArrayList as a parameter and 
     * sets the private variable equal to the parameter.
     * @param theList
     */
    ShoppingCart(theList)
    {
        items = theList;
    }

    removeItem(it)
    {
        items.remove(it);
    }

    getItems()
    {
        return items;
    }
}