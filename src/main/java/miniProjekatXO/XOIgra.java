package miniProjekatXO;

import java.util.Scanner;

public class XOIgra {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime igraca X: ");
        String igracX = s.next();
        System.out.print("Unesite ime igraca O: ");
        String igracO = s.next();
        int potez = 0;

        XOTabla igra = new XOTabla();
        igra.setIgracX(igracX);
        igra.setIgracO(igracO);

        igra.pokreniIgru();

        while (!igra.pobednikX() && !igra.pobednikO() && !igra.popunjenaTabla()) {

            igra.stampaj();

            System.out.println("Na potezu igrac " + igra.getNaPotezu());
            System.out.print("Odigraj potez: ");
            potez = s.nextInt();
            if (igra.poljePrazno(potez)) {
                igra.odigrajPotez(potez);
                igra.zameniIgraca();
            } else {
                System.out.println("Potez nije validan");
            }
        }

        if (igra.pobednikX()) {
            System.out.println("Cestitamo! Pobednik je igrac X" + "\n" + "Bravo " + igra.getIgracX());
        } else if (igra.pobednikO()) {
            System.out.println("Cestitamo! Pobednik je igrac O" + "\n" + "Bravo " + igra.getIgracO());
        } else if (igra.popunjenaTabla()) {
            System.out.println("Igra je neresena.");
        }

    }
}
