package oasis.com.smartchemist.utils;

public class DetailPO {

    private String po_code,wholesaler_po_code,product_code,product_quantity,rate,free_quantity,product_amount,product_discount,product_total_tax,product_total_amount;

    public DetailPO(String po_code, String wholesaler_po_code, String product_code, String product_quantity, String rate, String free_quantity, String product_amount, String product_discount, String product_total_tax, String product_total_amount) {
        this.po_code = po_code;
        this.wholesaler_po_code = wholesaler_po_code;
        this.product_code = product_code;
        this.product_quantity = product_quantity;
        this.rate = rate;
        this.free_quantity = free_quantity;
        this.product_amount = product_amount;
        this.product_discount = product_discount;
        this.product_total_tax = product_total_tax;
        this.product_total_amount = product_total_amount;
    }

    public String getPo_code() {
        return po_code;
    }

    public String getWholesaler_po_code() {
        return wholesaler_po_code;
    }

    public String getProduct_code() {
        return product_code;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public String getRate() {
        return rate;
    }

    public String getFree_quantity() {
        return free_quantity;
    }

    public String getProduct_amount() {
        return product_amount;
    }

    public String getProduct_discount() {
        return product_discount;
    }

    public String getProduct_total_tax() {
        return product_total_tax;
    }

    public String getProduct_total_amount() {
        return product_total_amount;
    }
}
