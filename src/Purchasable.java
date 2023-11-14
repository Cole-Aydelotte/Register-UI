public class Purchasable
{
    private int stock;
    private int barcode;
    private double price;
    private String name;

    public Purchasable(int stock, int barcode, double price, String name)
    {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice()
    {
        return price;
    }

    public int getBarcode()
    {
        return  barcode;
    }

    public String getName()
    {
        return name;
    }

    public int getStock()
    {
        return stock;
    }
}
