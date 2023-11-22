/**
 * The PurchasableItems class has two constructors that instantiate
 * a private variable named Items this list can them be mutated by
 * the createItem list.
 */
class PurchasableItems
{
    Items;

    /**
     * Base case contructor; sets the private variable Items
     * equal to a new ArrayList containing Purchasables.
     */
    PurchasableItems()
    {
        Items = new Array;
    }

    /**
     * Constructor that takes a ArrayList containing Purchasables
     * as a parameter and sets the private variable Items equal to
     * the parameter list.
     */
    PurchasableItems(list)
    {
        Items = list;
    }

    /**
     * Calls the constructor of Purchasable using the three
     * parameters and a four digit number recieved from 
     * getBarcode().
     */
    createItem(stock, price, name)
    {
        barcode = getBarcode();
        for (x = 0; x < Items.size(); x++)
        {         
            do
            {
                barcode = getBarcode();
            }
            while(barcode == Items.get(x).getBarcode());
        }
        item = new Purchasable(stock, barcode, price, name);
        Items.add(item);
    }

    /**
     * Generates a unique four digit number and returns
     * the Result.
     */
    getBarcode()
    {
        randNum = rand.nextInt(1000, 9999);
        return randNum;
    }

    getItems()
    {
        return Items;
    }

    toString()
    {
        str = "";
        for (x = 0; x < Items.size(); x++)
        {
            if(x == 0)
            {
                str += "Stock: " + Items.get(x).getStock() + " Barcode: " + Items.get(x).getBarcode() + " Price: "  + Items.get(x).getPrice() + " Name: " + Items.get(x).getName() + ' ';
            }
            else
            {
                str += ", Stock: " + Items.get(x).getStock() + " Barcode: " + Items.get(x).getBarcode() + " Price: "  + Items.get(x).getPrice() + " Name: " + Items.get(x).getName() + ' ';
            }
        }
        return str;
    }
}