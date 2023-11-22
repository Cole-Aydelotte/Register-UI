class Receipt 
{
    items = new Array();
    phoneNumber;
    Receipt(pn)
    {
        this.phoneNumber = pn;
    }

    sendReceipt()
    {

    }

    addItem(item)
    {
        items.add(item);
    }
}
