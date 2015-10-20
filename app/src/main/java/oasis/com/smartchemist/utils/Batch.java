package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 14/10/2015.
 */
public class Batch {
    private String mbt_code, mpd_code, mbt_batch_no, mbt_mfg_date, mbt_expiry_date, mbt_mrp;

    public Batch(String mbt_code, String mpd_code, String mbt_batch_no, String mbt_mfg_date, String mbt_expiry_date, String mbt_mrp) {
        this.mbt_code = mbt_code;
        this.mpd_code = mpd_code;
        this.mbt_batch_no = mbt_batch_no;
        this.mbt_mfg_date = mbt_mfg_date;
        this.mbt_expiry_date = mbt_expiry_date;
        this.mbt_mrp = mbt_mrp;
    }

    public String getMbt_code() {
        return mbt_code;
    }

    public String getMpd_code() {
        return mpd_code;
    }

    public String getMbt_batch_no() {
        return mbt_batch_no;
    }

    public String getMbt_mfg_date() {
        return mbt_mfg_date;
    }

    public String getMbt_expiry_date() {
        return mbt_expiry_date;
    }

    public String getMbt_mrp() {
        return mbt_mrp;
    }

}
