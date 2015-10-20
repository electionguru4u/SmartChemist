package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 14/10/2015.
 */
public class Shelf {
    private String msf_code,mrk_code, msf_shelf_name,msf_desc;

    public Shelf(String msf_code, String mrk_code, String msf_shelf_name, String msf_desc) {
        this.msf_code = msf_code;
        this.mrk_code = mrk_code;
        this.msf_shelf_name = msf_shelf_name;
        this.msf_desc = msf_desc;
    }

    public String getMsf_code() {
        return msf_code;
    }

    public String getMrk_code() {
        return mrk_code;
    }

    public String getMsf_shelf_name() {
        return msf_shelf_name;
    }

    public String getMsf_desc() {
        return msf_desc;
    }
}
