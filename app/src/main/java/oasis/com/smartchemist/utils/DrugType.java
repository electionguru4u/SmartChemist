package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 23/09/2015.
 */
public class DrugType {
    private String drug_type_code,drug_type_name,drug_type_description;

    public DrugType(String drug_type_code, String drug_type_name, String drug_type_description) {
        this.drug_type_code = drug_type_code;
        this.drug_type_name = drug_type_name;
        this.drug_type_description = drug_type_description;
    }

    public String getDrug_type_code() {
        return drug_type_code;
    }

    public String getDrug_type_name() {
        return drug_type_name;
    }

    public String getDrug_type_description() {
        return drug_type_description;
    }
}
