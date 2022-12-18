package d16_12_2022;

import java.util.Scanner;

public class ZadatakAlarm {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite sat: ");
        int sat = s.nextInt();
        System.out.print("Unesite minut: ");
        int minut = s.nextInt();

        System.out.println(sat + ":" + minut);
        int alarmMinuti = minut + 5;

        for (int i = 0; i < 6; i++) {
            if (alarmMinuti >= 60) {
                alarmMinuti = alarmMinuti - 60;
                sat = sat + 1;
                System.out.println(sat + ":" + alarmMinuti);
            } else {
                System.out.println(sat + ":" + alarmMinuti);
            }
            alarmMinuti = alarmMinuti + 5;
        }
    }
}
