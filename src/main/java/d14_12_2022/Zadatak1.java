package d14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        - Ime
//        - Prezime
//        - godinu rodjenja
//        I stampa informacije u formatu:
//      [ime] [prezime] - [starost] god

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = s.next();
        System.out.print("Unesite prezime: ");
        String prezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        int starost = 2022 - godinaRodjenja;

        System.out.println(ime + " " + prezime + " - " + starost + " god");

    }
}
