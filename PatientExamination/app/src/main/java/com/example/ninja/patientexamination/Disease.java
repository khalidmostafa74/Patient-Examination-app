package com.example.ninja.patientexamination;

/**
 * Created by ninja on 14/03/2018.
 */

public class Disease {
    private String diseaseName;
    private String symptomName;

    public Disease() {
    }

    public Disease(String diseaseName, String symptomName) {
        this.diseaseName = diseaseName;
        this.symptomName = symptomName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }
}
