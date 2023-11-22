class Purchasable
{
    stock;
    barcode;
    price;
    name;

    /**
     * A constructor that takes four parameters and intatiates the private
     * variables with those values.
     */
    Purchasable(stock, barcode, price, name)
    {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.stock = stock;
    }

    getPrice()
    {
        return price;
    }

    getBarcode()
    {
        return  barcode;
    }

    getName()
    {
        return name;
    }

    getStock()
    {
        return stock;
    }

    setStock(num)
    {
        this.stock = num;
    }
}