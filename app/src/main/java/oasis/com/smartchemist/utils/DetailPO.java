package oasis.com.smartchemist.utils;

public class DetailPO {

    private String po_code,batch_code,qty,free_qty,rate,tax_code,total_tax,total_amount_with_tax;

    public DetailPO(String po_code, String batch_code, String qty, String free_qty, String rate, String tax_code, String total_tax, String total_amount_with_tax) {
        this.po_code = po_code;
        this.batch_code = batch_code;
        this.qty = qty;
        this.free_qty = free_qty;
        this.rate = rate;
        this.tax_code = tax_code;
        this.total_tax = total_tax;
        this.total_amount_with_tax = total_amount_with_tax;
    }

    public String getPo_code() {
        return po_code;
    }

    public String getBatch_code() {
        return batch_code;
    }

    public String getQty() {
        return qty;
    }

    public String getFree_qty() {
        return free_qty;
    }

    public String getRate() {
        return rate;
    }

    public String getTax_code() {
        return tax_code;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public String getTotal_amount_with_tax() {
        return total_amount_with_tax;
    }
}
