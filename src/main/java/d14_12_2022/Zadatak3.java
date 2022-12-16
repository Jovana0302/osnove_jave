package d14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//        Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite x koordinatu za T1: ");
        int xT1 = s.nextInt();
        System.out.print("Unesite y koordinatu za T1: ");
        int yT1 = s.nextInt();
        System.out.print("Unesite x koordinatu za T2: ");
        int xT2 = s.nextInt();
        System.out.print("Unesite y koordinatu za T2: ");
        int yT2 = s.nextInt();
        System.out.print("Unesite x koordinatu za M: ");
        int xM = s.nextInt();
        System.out.print("Unesite y koordinatu za M: ");
        int yM = s.nextInt();

        if ((xM > xT1 && xM < xT2) && (yM < yT1 && yM > yT2)) {
            System.out.println("Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto unutar forme");
        }
    }
}
