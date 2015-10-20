package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 14/10/2015.
 */
public class Stock {
    private String stock_code,batch_code,tax_code,quantity,shelf_code;

    public Stock(String stock_code, String batch_code, String tax_code, String quantity, String shelf_code) {
        this.stock_code = stock_code;
        this.batch_code = batch_code;
        this.tax_code = tax_code;
        this.quantity = quantity;
        this.shelf_code = shelf_code;
    }

    public String getStock_code() {
        return stock_code;
    }

    public String getBatch_code() {
        return batch_code;
    }

    public String getTax_code() {
        return tax_code;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getShelf_code() {
        return shelf_code;
    }
}
