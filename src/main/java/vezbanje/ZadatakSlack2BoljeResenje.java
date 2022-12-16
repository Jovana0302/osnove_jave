package vezbanje;

import java.util.Scanner;

public class ZadatakSlack2BoljeResenje {
    public static void main(String[] args) {
//        Napisati program koji simulira alarm.
//        Alarm se ponavlja na svakih 5minuta narednih pola sata.
//        Korisnik unosi sat i minut za koji zeli da navije alarm
//        a program prikazuje vremena u kojima ce se alarm aktivirati
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite sat: ");
        int sat = s.nextInt();
        System.out.print("Unesite minut: ");
        int minut = s.nextInt();

        int alarmMinuti = minut + 5;

        if (alarmMinuti >= 60) {
            alarmMinuti = alarmMinuti - 60;
            sat = sat + 1;
            System.out.println(sat + ":" + alarmMinuti);
        } else {
            System.out.println(sat + ":" + alarmMinuti);
        }

        alarmMinuti = alarmMinuti + 5;

        if (alarmMinuti >= 60) {
            alarmMinuti = alarmMinuti - 60;
            sat = sat + 1;
            System.out.println(sat + ":" + alarmMinuti);
        } else {
            System.out.println(sat + ":" + alarmMinuti);
        }

        alarmMinuti = alarmMinuti + 5;

        if (alarmMinuti >= 60) {
            alarmMinuti = alarmMinuti - 60;
            sat = sat + 1;
            System.out.println(sat + ":" + alarmMinuti);
        } else {
            System.out.println(sat + ":" + alarmMinuti);
        }

        alarmMinuti = alarmMinuti + 5;

        if (alarmMinuti >= 60) {
            alarmMinuti = alarmMinuti - 60;
            sat = sat + 1;
            System.out.println(sat + ":" + alarmMinuti);
        } else {
            System.out.println(sat + ":" + alarmMinuti);
        }

        alarmMinuti = alarmMinuti + 5;

        if (alarmMinuti >= 60) {
            alarmMinuti = alarmMinuti - 60;
            sat = sat + 1;
            System.out.println(sat + ":" + alarmMinuti);
        } else {
            System.out.println(sat + ":" + alarmMinuti);
        }

        alarmMinuti = alarmMinuti + 5;

        if (alarmMinuti >= 60) {
            alarmMinuti = alarmMinuti - 60;
            sat = sat + 1;
            System.out.println(sat + ":" + alarmMinuti);
        } else {
            System.out.println(sat + ":" + alarmMinuti);
        }

    }
}
