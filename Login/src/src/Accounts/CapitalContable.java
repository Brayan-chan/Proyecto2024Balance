package src.Accounts;

import src.resources.TextFile;

public class CapitalContable {
    public String total(String nameFile) {
        double total = new Assed().totalAsset(nameFile) - new Liability().totalLiability(nameFile);
        String capital =  "Total capital: $" + total + '\n';
        System.out.println(capital);

        new TextFile(nameFile).updateTextFile("Total capital: $" + total);

        return capital;
    }
}