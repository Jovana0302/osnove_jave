package d14_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//        tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();
        System.out.print("Unesite c: ");
        int c = s.nextInt();
        System.out.print("Unesite d: ");
        int d = s.nextInt();

        String p = "#";

        if (a < 0) {
            p = a + " " + p;
        } else {
            p = p + " " + a;
        }

        if (b < 0) {
            p = b + " " + p;
        } else {
            p = p + " " + b;
        }

        if (c < 0) {
            p = c + " " + p;
        } else {
            p = p + " " + c;
        }

        if (d < 0) {
            p = d + " " + p;
        } else {
            p = p + " " + d;
        }

        System.out.println("String p ima vrednost: " + p);
    }
}
