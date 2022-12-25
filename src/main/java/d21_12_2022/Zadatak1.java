package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//        i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//        Primer:
//        Unesite pozicjiu od 0 do 9: 3
//        Unesite novu vrednost: 11
//        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(8);
        brojevi.add(9);
        brojevi.add(10);

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite poziciju od 0 do 9: ");
        int pozicija = s.nextInt();
        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        brojevi.set(pozicija, novaVrednost);

        System.out.println(brojevi.get(pozicija));
    }
}
