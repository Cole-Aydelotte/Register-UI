/**
 * The Item class has a constructor and a series of setters and
 * getters to access and mutate the local variables.
 */
class Item 
{
    name;
    price;
    quantity;
    
    /**
     * Constructor takes three parameters and the local variables 
     * are then instantiated with those values.
     */
    Item(name, price, quantity) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    getName()
    {
        return name;
    }
    
    getPrice()
    {
        return price;
    }
    
    getQuantity()
    {
        return quantity;
    }
    
    setQuantity(quantity)
    {
        this.quantity = quantity;
    }
}
