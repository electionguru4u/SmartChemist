package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 24/09/2015.
 */
public class Company {
    private String company_code,company_name,company_desc;

    public Company(String company_code, String company_name, String company_desc) {
        this.company_code = company_code;
        this.company_name = company_name;
        this.company_desc = company_desc;
    }

    public String getCompany_desc() {
        return company_desc;
    }

    public String getCompany_code() {
        return company_code;
    }

    public String getCompany_name() {
        return company_name;
    }
}
