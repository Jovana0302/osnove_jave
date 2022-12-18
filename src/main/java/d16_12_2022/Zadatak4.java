package d16_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//                Primer izvrsenja:
        //        Unesite dimenziju table: 5
        //        _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|

                Scanner s = new Scanner(System.in);
        System.out.print("Unesite dimenziju tabele: ");
        int x = s.nextInt();

        for (int i = 0; i < x * x; i++) {
            System.out.print("_|");
            if (i % x == (x - 1)) {
                System.out.println();
            }
        }
    }
}
