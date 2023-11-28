class dbconnector
{
    /**
     * connects sql databse and will run dupfile.
     */
    connect()
    {
        const mysql = require('mysql');

        const connection = mysql.createConnection({
          host: 'localhost',
          user: 'project',
          password: 'project',
          database: 'Register_UI'
        });
        
        connection.connect((err) => {
          if (err) {
            console.error('Error connecting to database:', err);
            return;
          }
          console.log('Connected to database');
        });

        connection.query("mysql -u " + user +  " -p " + password + " < dupfile.sql");
    }

    insertInto(name, stock, price)
    {
        item = createItem(stock, price, name);
        barcode = item.getBarcode();
        connection.query('INSERT INTO PurchasableItems VALUES (name, stock, price, barcode);');
    }

}