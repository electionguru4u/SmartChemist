package oasis.com.smartchemist.utils;

public class Wholesaler {
    private String code,one_all_code,name,address,city,landline_no,mobile_no,email_id,description,validity,active,products_last_updated,stock_last_udated;

    public Wholesaler(String code, String one_all_code, String name, String address, String city, String landline_no, String mobile_no, String email_id, String description, String validity, String active, String products_last_updated, String stock_last_udated) {
        this.code = code;
        this.one_all_code = one_all_code;
        this.name = name;
        this.address = address;
        this.city = city;
        this.landline_no = landline_no;
        this.mobile_no = mobile_no;
        this.email_id = email_id;
        this.description = description;
        this.validity = validity;
        this.active = active;
        this.products_last_updated = products_last_updated;
        this.stock_last_udated = stock_last_udated;
    }

    public String getCode() {
        return code;
    }

    public String getOne_all_code() {
        return one_all_code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getLandline_no() {
        return landline_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getDescription() {
        return description;
    }

    public String getValidity() {
        return validity;
    }

    public String getActive() {
        return active;
    }

    public String getProducts_last_updated() {
        return products_last_updated;
    }

    public String getStock_last_udated() {
        return stock_last_udated;
    }
}
