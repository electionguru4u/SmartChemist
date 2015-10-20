package oasis.com.smartchemist.utils;

/**
 * Created by FDS on 15/10/2015.
 */
public class DrugSchedule {
    private String drug_schedule_code,drug_schedule_name,drug_schedule_description;

    public DrugSchedule(String drug_schedule_code, String drug_schedule_name, String drug_schedule_description) {
        this.drug_schedule_code = drug_schedule_code;
        this.drug_schedule_name = drug_schedule_name;
        this.drug_schedule_description = drug_schedule_description;
    }

    public String getDrug_schedule_code() {
        return drug_schedule_code;
    }

    public String getDrug_schedule_name() {
        return drug_schedule_name;
    }

    public String getDrug_schedule_description() {
        return drug_schedule_description;
    }
}
