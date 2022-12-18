package d16_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji iscrtava timeline na youtube videu.
//        Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu,
//        a program iscrtava timeline tako sto deo koji je pogledan iscrtava
//        zvezdicama a ostatak crticama. Timeline je kontrola koja ima tacno 100 karaktera.

//        (Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa,
//        zaokruzicemo to na 9 zvezdica, ostatak do 100 su crtice)

//        Pretvorite vremena u minute i sekune i stavite ih ispod prikaza:
//  Primer izvrsenja:
//  Unesite duzinu videa (s): 203
//  Unesite trenutno vreme videa (s): 20
//  *********-------------------------------------------------------------------------------------------
//  0:20 / 3:23

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite duzinu videa (s): ");
        int duzinaVidea = s.nextInt();
        System.out.print("Unesite trenutno vreme videa (s): ");
        int trenutnoVreme = s.nextInt();

        int zvezdice = (100 * trenutnoVreme) / duzinaVidea;

        for (int i = 0; i < zvezdice; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < (100 - zvezdice); i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println((trenutnoVreme / 60) + ":" + (trenutnoVreme % 60) + " / "
                + (duzinaVidea / 60) + ":" + (duzinaVidea % 60));

    }
}