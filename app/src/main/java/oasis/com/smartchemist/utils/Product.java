package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 23/09/2015.
 */
public class Product {

    private String product_code, product_name, packing_type,product_content,product_company_code,drug_type_code,drug_schedule_code, product_description;
    private int product_rank;

    public Product(String product_code, String product_name, String packing_type, String product_content, String product_company_code, String drug_type_code, String drug_schedule_code, String product_description, int product_rank) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.packing_type = packing_type;
        this.product_content = product_content;
        this.product_company_code = product_company_code;
        this.drug_type_code = drug_type_code;
        this.drug_schedule_code = drug_schedule_code;
        this.product_description = product_description;
        this.product_rank = product_rank;
    }

    public String getProduct_content() {
        return product_content;
    }

    public String getProduct_code() {
        return product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getPacking_type() {
        return packing_type;
    }

    public String getProduct_company_code() {
        return product_company_code;
    }

    public String getDrug_type_code() {
        return drug_type_code;
    }

    public String getDrug_schedule_code() {
        return drug_schedule_code;
    }

    public String getProduct_description() {
        return product_description;
    }

    public int getProduct_rank() {
        return product_rank;
    }
}
