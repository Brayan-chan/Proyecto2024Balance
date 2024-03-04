package src.Accounts;

import src.Components.Accounts;
import src.resources.TextFile;

import java.util.ArrayList;

public class Assed extends Accounts {
     double current(String nameFile) {
        ArrayList<Accounts> currentAsset = createAccounts(
                "Caja",
                "Banco",
                "Inversiones temporales",
                "Mercancias",
               "Clientes",
                "Documentos por cobrar",
                "Deudores diversos",
                "Anticipo a proveedores"
        );
        return account(currentAsset, "Activo", "Circulante", nameFile);
    }

    double fixed(String nameFile) {
        ArrayList<Accounts> fixedAsset = createAccounts(
                "Terrenos",
                "Edificios",
                "Mobiliario y equipo",
                "Equipo de computo",
                "Equipo de entrega y reparto",
                "Depositos en garantia",
                "Inversiones permanentes",
                "Documentos por cobrar a largo plazo"
        );
        return account(fixedAsset, "Activo", "Fijo", nameFile);
    }

    double deferred(String nameFile) {
        ArrayList<Accounts> deferredAsset = createAccounts(
                "Gastos de investigación y desarrollo",
                "Gastos en etapas preoperativas de organización y administración",
                "Gastos de mercadotecnia",
                "Gastos de organización ",
                "Gastos de instalación ",
                "Papelería y útiles",
                "Propaganda y publicidad",
                "Primas de seguros",
                "Rentas pagadas por anticipado ",
                "Intereses pagados por anticipado"
        );
        return account(deferredAsset, "Activo", "Diferido", nameFile);
    }

    public double totalAsset(String nameFile) {
        double total = current(nameFile) + fixed(nameFile) + deferred(nameFile);
        System.out.println("Total de activo: $" + total);
        new TextFile(nameFile).updateTextFile("Total de activo: $" + total);

        return total;
    }
}