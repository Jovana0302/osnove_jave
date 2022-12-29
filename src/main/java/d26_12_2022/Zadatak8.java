package d26_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
//        (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();
        System.out.print("Unesite c: ");
        int c = s.nextInt();
        System.out.println("Najmanji broj: " + najmanji(a, b, c));
    }
    public static int najmanji (int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else {
            return 0;
        }
    }
}
