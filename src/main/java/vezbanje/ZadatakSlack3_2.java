package vezbanje;

import java.util.Scanner;

public class ZadatakSlack3_2 {
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

        for (int i = 0; i < pozicija - 1; i++) {
            System.out.print(polje);
            if (i % 5 == 4) {
                System.out.println();
            }
        }

        System.out.print(c);

        if (pozicija % 5 == 1) {
            for (int i = 0; i < 4; i++) {
                System.out.print(polje);
            }
        } else if (pozicija % 5 == 2) {
            for (int i = 0; i < 3; i++) {
                System.out.print(polje);
            }
        } else if (pozicija % 5 == 3) {
            for (int i = 0; i < 2; i++) {
                System.out.print(polje);
            }
        } else if (pozicija % 5 == 4) {
            for (int i = 0; i < 1; i++) {
                System.out.print(polje);
            }
        } else if (pozicija % 5 == 0) {
        }

        System.out.println();

        if (pozicija % 5 == 1) {
            for (int i = 0; i < 5 * 5 - pozicija - 4; i++) {
                System.out.print(polje);
                if (i % 5 == 4) {
                    System.out.println();
                }
            }
        } else if (pozicija % 5 == 2) {
            for (int i = 0; i < 5 * 5 - pozicija - 3; i++) {
                System.out.print(polje);
                if (i % 5 == 4) {
                    System.out.println();
                }
            }
        } else if (pozicija % 5 == 3) {
            for (int i = 0; i < 5 * 5 - pozicija - 2; i++) {
                System.out.print(polje);
                if (i % 5 == 4) {
                    System.out.println();
                }
            }
        } else if (pozicija % 5 == 4) {
            for (int i = 0; i < 5 * 5 - pozicija - 1; i++) {
                System.out.print(polje);
                if (i % 5 == 4) {
                    System.out.println();
                }
            }
        } else if (pozicija % 5 == 0) {
            for (int i = 0; i < 5 * 5 - pozicija; i++) {
                System.out.print(polje);
                if (i % 5 == 4) {
                    System.out.println();
                }
            }
        }
    }
}