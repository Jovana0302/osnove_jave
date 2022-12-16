package d14_12_2022;

import java.util.Scanner;

public class ZadatakSlack1 {
    public static void main(String[] args) {
//        Napisati program koji simulira paginaciju tabele. Korisnik sa tastature unosi:
//        -ukupan broj rezultata
//        -broj rezultata po strani
//        -stranu
//        Program ispisuje poruku koji rezultati ce biti prikazani.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ukupan broj rezultata: ");
        int rezultati = s.nextInt();
        System.out.print("Unesite broj rezultata po strani: ");
        int rezultatiPoStr = s.nextInt();
        System.out.print("Unesite stranu: ");
        int strana = s.nextInt();

        int pocetak = rezultatiPoStr * (strana - 1) + 1;
        int kraj = rezultatiPoStr * strana;

        if (kraj > rezultati && kraj < (rezultati + rezultatiPoStr)) {
            kraj = rezultati;
        } else if (kraj > rezultati && kraj > (rezultati + rezultatiPoStr)) {
            System.out.println("No results for page " + strana);
        }

        if (kraj <= rezultati) {
        System.out.println("Showing " + pocetak + " to " + kraj + " of " + rezultati + " entries");
        }
    }
}