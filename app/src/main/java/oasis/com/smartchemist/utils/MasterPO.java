package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 15/10/2015.
 */
public class MasterPO {
    private String po_code,wholesaler_po_code,employee_code,retailer_code,date,time,no_of_items,total_amount,total_discount,total_tax,total_bill;

    public MasterPO(String po_code, String wholesaler_po_code, String employee_code, String retailer_code, String date, String time, String no_of_items, String total_amount, String total_discount, String total_tax, String total_bill) {
        this.po_code = po_code;
        this.wholesaler_po_code = wholesaler_po_code;
        this.employee_code = employee_code;
        this.retailer_code = retailer_code;
        this.date = date;
        this.time = time;
        this.no_of_items = no_of_items;
        this.total_amount = total_amount;
        this.total_discount = total_discount;
        this.total_tax = total_tax;
        this.total_bill = total_bill;
    }

    public String getPo_code() {
        return po_code;
    }

    public String getWholesaler_po_code() {
        return wholesaler_po_code;
    }

    public String getEmployee_code() {
        return employee_code;
    }

    public String getRetailer_code() {
        return retailer_code;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getNo_of_items() {
        return no_of_items;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public String getTotal_discount() {
        return total_discount;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public String getTotal_bill() {
        return total_bill;
    }
}
