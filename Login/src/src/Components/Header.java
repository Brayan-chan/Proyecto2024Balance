package src.Components;

public class Header {
    private String nameEntity, initialDate, finalDate;
    public Header(String nameEntity, String initialDate, String finalDate) {
        this.nameEntity = nameEntity;
        this .initialDate = initialDate;
        this.finalDate = finalDate;
    }

    public String getNameEntity() {
        return nameEntity;
    }

    public void setNameEntity(String nameEntity) {
        this.nameEntity = nameEntity;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getRangeDate() {
        return "Balance general del " + initialDate + " al " + finalDate + "\n";
    }
}