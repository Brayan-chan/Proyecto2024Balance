package src.Components;

import src.resources.TextFile;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Accounts {
    public Accounts() { }
    private String name;

    public Accounts(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Accounts> createAccounts(String... names) {
        ArrayList<Accounts> accounts = new ArrayList<>();
        for (int i = 0; i < names.length; i++)  {
            accounts.add(new Accounts(names[i]));
        }
        return accounts;
    }

    public double account(ArrayList<Accounts> accounts, String type, String clasification, String nameFile) {
        System.out.println(clasification);
        new TextFile(nameFile).updateTextFile( type + " " + clasification);

        double[] values = new double[accounts.size()];
        ArrayList<Accounts> nonEmptyAccounts = new ArrayList<>();
        double total = 0;

        try {
            for (int i = 0; i < accounts.size(); i++) {
                System.out.print(accounts.get(i).getName() + " $");
                values[i] = new java.util.Scanner(System.in).nextDouble();
            }
            for (int i = 0; i < accounts.size(); i++) {
                if (values[i] != 0) {
                    nonEmptyAccounts.add(accounts.get(i));
                    total += values[i];

                    if (i < nonEmptyAccounts.size()) {
                        new TextFile(nameFile).updateTextFile(nonEmptyAccounts.get(i).getName() + " $" + values[i]);
                    }
                }
            }
            System.out.println("Total de  " + clasification.toLowerCase() + ": $" + total);

            new TextFile(nameFile).updateTextFile("Total de " + clasification.toLowerCase() + ": $" + total);

        } catch (InputMismatchException | NumberFormatException | ArithmeticException | NoSuchFieldError  | IndexOutOfBoundsException e) {
            System.err.println("Se produjo un error. Intenta de nuevo" + '(' + e.getMessage() + ')');
            account(accounts, type, clasification, nameFile);
        }
        return total;
    }
}