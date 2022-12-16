package d14_12_2022;

import java.util.Scanner;

public class ZadatakSlack2 {
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

        int minut1 = minut + 5;
        int minut2 = minut1 + 5;
        int minut3 = minut2 + 5;
        int minut4 = minut3 + 5;
        int minut5 = minut4 + 5;
        int minut6 = minut5 + 5;

        String alarm = sat + ":" + minut;
        String alarm1 = sat + ":" + minut1;
        String alarm2 = sat + ":" + minut2;
        String alarm3 = sat + ":" + minut3;
        String alarm4 = sat + ":" + minut4;
        String alarm5 = sat + ":" + minut5;
        String alarm6 = sat + ":" + minut6;


        if (minut1 == 60) {
            minut1 = 0;
            minut2 = minut1 + 5;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut2 == 60) {
            minut2 = 0;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut3 == 60) {
            minut3 = 0;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut4 == 60) {
            minut4 = 0;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut5 == 60) {
            minut5 = 0;
            minut6 = minut5 + 5;
        } else if (minut6 == 60) {
            minut6 = 0;
        }

        if (minut1 == 61) {
            minut1 = 1;
            minut2 = minut1 + 5;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut2 == 61) {
            minut2 = 1;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut3 == 61) {
            minut3 = 1;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut4 == 61) {
            minut4 = 1;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut5 == 61) {
            minut5 = 1;
            minut6 = minut5 + 5;
        } else if (minut6 == 61) {
            minut6 = 1;
        }

        if (minut1 == 62) {
            minut1 = 2;
            minut2 = minut1 + 5;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut2 == 62) {
            minut2 = 2;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut3 == 62) {
            minut3 = 2;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut4 == 62) {
            minut4 = 2;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut5 == 62) {
            minut5 = 2;
            minut6 = minut5 + 5;
        } else if (minut6 == 62) {
            minut6 = 2;
        }

        if (minut1 == 63) {
            minut1 = 3;
            minut2 = minut1 + 5;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut2 == 63) {
            minut2 = 3;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut3 == 63) {
            minut3 = 3;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut4 == 63) {
            minut4 = 3;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut5 == 63) {
            minut5 = 3;
            minut6 = minut5 + 5;
        } else if (minut6 == 63) {
            minut6 = 3;
        }

        if (minut1 == 64) {
            minut1 = 4;
            minut2 = minut1 + 5;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut2 == 64) {
            minut2 = 4;
            minut3 = minut2 + 5;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut3 == 64) {
            minut3 = 4;
            minut4 = minut3 + 5;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut4 == 64) {
            minut4 = 4;
            minut5 = minut4 + 5;
            minut6 = minut5 + 5;
        } else if (minut5 == 64) {
            minut5 = 4;
            minut6 = minut5 + 5;
        } else if (minut6 == 64) {
            minut6 = 4;
        }

        if (minut >= 55 && minut <= 59){
            alarm1 = (sat + 1) + ":" + minut1;
            alarm2 = (sat + 1) + ":" + minut2;
            alarm3 = (sat + 1) + ":" + minut3;
            alarm4 = (sat + 1) + ":" + minut4;
            alarm5 = (sat + 1) + ":" + minut5;
            alarm6 = (sat + 1) + ":" + minut6;
        } else if (minut1 >= 55 && minut1 <= 59) {
            alarm2 = (sat + 1) + ":" + minut2;
            alarm3 = (sat + 1) + ":" + minut3;
            alarm4 = (sat + 1) + ":" + minut4;
            alarm5 = (sat + 1) + ":" + minut5;
            alarm6 = (sat + 1) + ":" + minut6;
        } else if (minut2 >= 55 && minut2 <= 59) {
            alarm3 = (sat + 1) + ":" + minut3;
            alarm4 = (sat + 1) + ":" + minut4;
            alarm5 = (sat + 1) + ":" + minut5;
            alarm6 = (sat + 1) + ":" + minut6;
        } else if (minut3 >= 55 && minut3 <= 59) {
            alarm4 = (sat + 1) + ":" + minut4;
            alarm5 = (sat + 1) + ":" + minut5;
            alarm6 = (sat + 1) + ":" + minut6;
        } else if (minut4 >= 55 && minut4 <= 59) {
            alarm5 = (sat + 1) + ":" + minut5;
            alarm6 = (sat + 1) + ":" + minut6;
        } else if (minut5 >= 55 && minut5 <= 59) {
            alarm6 = (sat + 1) + ":" + minut6;}

        System.out.println("Aktivirace se u: ");
        System.out.println(alarm);
        System.out.println(alarm1);
        System.out.println(alarm2);
        System.out.println(alarm3);
        System.out.println(alarm4);
        System.out.println(alarm5);
        System.out.println(alarm6);


    }
}