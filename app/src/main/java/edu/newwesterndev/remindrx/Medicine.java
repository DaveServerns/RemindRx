package edu.newwesterndev.remindrx;

/**
 * Created by phil on 2/25/17.
 */

public class Medicine {

    private String medName;
    private int doseQuantity;
    private String remindTime;

    public  Medicine(String medName, int doseQuantity, String remindTime){
        this.medName = medName;
        this.doseQuantity = doseQuantity;
        this.remindTime = remindTime;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medName='" + medName + '\'' +
                ", doseQuantity=" + doseQuantity +
                ", remindTime='" + remindTime + '\'' +
                '}';
    }
}
