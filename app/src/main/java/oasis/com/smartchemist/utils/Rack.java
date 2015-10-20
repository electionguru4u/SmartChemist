package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 14/10/2015.
 */
public class Rack {
    private String mrk_code, mrk_rack_name,mrk_desc;

    public Rack(String mrk_code, String mrk_rack_name, String mrk_desc) {
        this.mrk_code = mrk_code;
        this.mrk_rack_name = mrk_rack_name;
        this.mrk_desc = mrk_desc;
    }

    public String getMrk_code() {
        return mrk_code;
    }

    public String getMrk_rack_name() {
        return mrk_rack_name;
    }

    public String getMrk_desc() {
        return mrk_desc;
    }
}
