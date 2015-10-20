package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 15/10/2015.
 */
public class Tax {

    private String tax_code,tax_name,tax_percentage,tax_desc,active;

    public Tax(String tax_code, String tax_name, String tax_percentage, String tax_desc, String active) {
        this.tax_code = tax_code;
        this.tax_name = tax_name;
        this.tax_percentage = tax_percentage;
        this.tax_desc = tax_desc;
        this.active = active;
    }

    public String getTax_code() {
        return tax_code;
    }

    public String getTax_name() {
        return tax_name;
    }

    public String getTax_percentage() {
        return tax_percentage;
    }

    public String getTax_desc() {
        return tax_desc;
    }

    public String getActive() {
        return active;
    }
}
