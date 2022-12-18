package d16_12_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.
//        Kada se ucita video difoltna jacina zvuka je 75.
//        Korisnik unosi 5 akcija. Jednu od sledecih:
//        pojacaj - pojacava zvuk za 10
//        smanji - smanjuje zvuk za 10.
//        mute - postavlja zvuk na 0.
//        Na kraju programa odstampati jacinu zvuka.
//        NAPOMENA: Jacina zvuka nikad ne moze da ode iznad 100 niti da padne ispod 0.
//
//        Primer izvrsenja:
//        Unesite akciju: pojacaj (objasnjenje: nakon ovoga je 85)
//        Unesite akciju: pojacaj (objasnjenje: nakon ovoga je 95)
//        Unesite akciju: pojacaj (objasnjenje: nakon ovoga je 100, jer ne moze da bude 105)
//        Unesite akciju: mute (objasnjenje: nakon ovoga je 0)
//        Unesite akciju: smanji (objasnjenje: nakon ovoga ostaje 0)
//        Jacina zvuka je 0.

        int zvuk = 75;

        for (int i = 0; i < 5; i++) {
            Scanner s = new Scanner(System.in);
            System.out.print("Unesite akciju: ");
            String akcija = s.next();
            if (akcija.equals("pojacaj")) {
                zvuk = zvuk + 10;
            } else if (akcija.equals("smanji")) {
                zvuk = zvuk - 10;
            } else if (akcija.equals("mute")) {
                zvuk = 0;
            }
            if (zvuk < 0) {
                zvuk = 0;
            } else if (zvuk > 100) {
                zvuk = 100;
            }
            System.out.println("Jacina zvuka je " + zvuk);
        }
    }
}
