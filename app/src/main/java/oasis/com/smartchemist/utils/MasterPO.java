package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 15/10/2015.
 */
public class MasterPO {

    private String po_code,po_date,po_time,wholesaler_code,no_of_items,total_amount_without_tax,disc_per,disc_amt,tax,credit_note,goods_return_amount,expired_goods_amount,cheque_dd_discount,cash_discount,other_amount,total_amount_with_tax,rounding_factors,total_amount_with_rounding_factors,due_date,financial_year;

    public MasterPO(String po_code, String po_date, String po_time, String wholesaler_code, String no_of_items, String total_amount_without_tax, String disc_per, String disc_amt, String tax, String credit_note, String goods_return_amount, String expired_goods_amount, String cheque_dd_discount, String cash_discount, String other_amount, String total_amount_with_tax, String rounding_factors, String total_amount_with_rounding_factors, String due_date, String financial_year) {
        this.po_code = po_code;
        this.po_date = po_date;
        this.po_time = po_time;
        this.wholesaler_code = wholesaler_code;
        this.no_of_items = no_of_items;
        this.total_amount_without_tax = total_amount_without_tax;
        this.disc_per = disc_per;
        this.disc_amt = disc_amt;
        this.tax = tax;
        this.credit_note = credit_note;
        this.goods_return_amount = goods_return_amount;
        this.expired_goods_amount = expired_goods_amount;
        this.cheque_dd_discount = cheque_dd_discount;
        this.cash_discount = cash_discount;
        this.other_amount = other_amount;
        this.total_amount_with_tax = total_amount_with_tax;
        this.rounding_factors = rounding_factors;
        this.total_amount_with_rounding_factors = total_amount_with_rounding_factors;
        this.due_date = due_date;
        this.financial_year = financial_year;
    }

    public String getPo_code() {
        return po_code;
    }

    public String getPo_date() {
        return po_date;
    }

    public String getPo_time() {
        return po_time;
    }

    public String getWholesaler_code() {
        return wholesaler_code;
    }

    public String getNo_of_items() {
        return no_of_items;
    }

    public String getTotal_amount_without_tax() {
        return total_amount_without_tax;
    }

    public String getDisc_per() {
        return disc_per;
    }

    public String getDisc_amt() {
        return disc_amt;
    }

    public String getTax() {
        return tax;
    }

    public String getCredit_note() {
        return credit_note;
    }

    public String getGoods_return_amount() {
        return goods_return_amount;
    }

    public String getExpired_goods_amount() {
        return expired_goods_amount;
    }

    public String getCheque_dd_discount() {
        return cheque_dd_discount;
    }

    public String getCash_discount() {
        return cash_discount;
    }

    public String getOther_amount() {
        return other_amount;
    }

    public String getTotal_amount_with_tax() {
        return total_amount_with_tax;
    }

    public String getRounding_factors() {
        return rounding_factors;
    }

    public String getTotal_amount_with_rounding_factors() {
        return total_amount_with_rounding_factors;
    }

    public String getDue_date() {
        return due_date;
    }

    public String getFinancial_year() {
        return financial_year;
    }
}
