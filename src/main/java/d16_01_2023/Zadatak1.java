package d16_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Igrac igrac1 = new Igrac("Pera Peric", "151299957887", 1999, 10, "odbrambeni", false);
//        Igrac igrac2 = new Igrac("Marko Markovic", "080599687654", 1996, 1, "napadac", true);
//        Trener trener1 = new Trener("Nikola Nikolic", "090898556454", 1985, 15, "kondicioni");
//        Trener trener2 = new Trener("Milos Milosevic", "230499176345", 1991, 10, "personalni");
//
//        igrac1.stampaj();
//        igrac2.stampaj();
//        trener1.stampaj();
//        trener2.stampaj();

        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> igraci = new ArrayList<>();

        System.out.print("Unesite broj igraca: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime igraca: ");
            String ime = s.next();
            System.out.print("Unesite prezime igraca: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg igraca: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja igraca: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Unesite broj koji igrac nosi: ");
            int broj = s.nextInt();
            System.out.print("Unesite poziciju igraca: ");
            String pozicija = s.next();
            System.out.print("Da li je igrac kapiten? ");
            boolean jeKapiten = s.nextBoolean();
            System.out.println();
            igraci.add(new Igrac(ime + " " + prezime, jmbg, godinaRodjenja, broj, pozicija, jeKapiten));
        }

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }

        ArrayList<Trener> treneri = new ArrayList<>();
        System.out.print("Unesite broj trenera: ");
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("Unesite ime trenera: ");
            String ime = s.next();
            System.out.print("Unesite prezime trenera: ");
            String prezime = s.next();
            System.out.print("Unesite jmbg trenera: ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja trenera: ");
            int godinaRodjenja = s.nextInt();
            System.out.print("Unesite godine iskustva trenera: ");
            int godineIskustva = s.nextInt();
            System.out.print("Unesite tip trenera: ");
            String tip = s.next();
            System.out.println();
            treneri.add(new Trener(ime + " " + prezime, jmbg, godinaRodjenja, godineIskustva, tip));
        }

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }

    }
}
