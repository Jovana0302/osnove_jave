package vezbanje;

import java.util.Scanner;

public class ZadatakSlack3 {
    public static void main(String[] args) {
//        Napisati program koji iscrtava coveculjka C na tabli dimenzija 5x5.
//            Korisnik unosi poziciju coveculjka. Pozicije u tabeli su kao sa slike.
//                Primer izvrsenja:
//        Unesite poziciju coveculjka: 17

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite poziciju coveculjka: ");
        int pozicija = s.nextInt();
        String c = " c |";
        String polje = "   |";

        for (int i = 0; i < 5 * 5; i++) {
            if (i == (pozicija - 1)) {
                System.out.print(c);
            } else {System.out.print(polje);
            }
            if (i % 5 == 4) {
                System.out.println();
            }
            }
        }
    }