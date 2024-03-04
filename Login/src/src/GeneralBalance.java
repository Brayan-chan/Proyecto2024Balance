package src;

import src.resources.TextFile;

public class GeneralBalance {
    private String nameEntity, initialDate, finalDate, nameCEO, nameAuthor;

    String readEntry(String message) {
        System.out.print(message);
        return new java.util.Scanner(System.in).nextLine();
    }

    String header() {
        nameEntity = readEntry("Nombre de la entidad: ");
        initialDate = readEntry("Fecha inicial: ");
        finalDate = readEntry("Fecha final: ");

        return nameEntity + "\nBalance general del " + initialDate + " al " + finalDate;
    }

    String footer() {
        nameCEO = readEntry("Autorizado por: ");
        nameAuthor = readEntry("Elaborado por: ");

        return "Autorizado por: " + nameCEO +  " (Gerente general)"+ "\t" + '\t'
                + "Elaborado por: " + nameAuthor + " (Contador general)" ;
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

    public String getNameCEO() {
        return nameCEO;
    }

    public void setNameCEO(String nameCEO) {
        this.nameCEO = nameCEO;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getRangeDate() {
        return "Balance general del " + initialDate + " al " + finalDate;
    }

    private void newGeneralBalance() {
        try {
            System.out.println("Ingresa el nombre del nuevo balance general");
            String nameFile = new java.util.Scanner(System.in).nextLine() + ".txt";

            TextFile textFile = new TextFile(nameFile);
            textFile.updateTextFile(new GeneralBalance().header());

            String totalCapital = new src.Accounts.CapitalContable().total(nameFile);
            //String footer = new GeneralBalance().footer();
            textFile.updateTextFile(new GeneralBalance().footer());

        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
    public static void main(String[] args) {
        new GeneralBalance().newGeneralBalance();
    }
}