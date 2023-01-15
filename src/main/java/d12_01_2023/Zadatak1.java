package d12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
        ispiti.add(new ZeleniKarton("Manuelno teorija", "Dragoljub B.", 9));
        ispiti.add(new ZeleniKarton("SQL", "Milan J.", 7));
        ispiti.add(new ZeleniKarton("Git", "Vlada M.", 9));
        ispiti.add(new ZeleniKarton("Java", "Milan J.", 5));
        ispiti.add(new ZeleniKarton("Java OOP", "Vlada M.", 8));
        ispiti.add(new ZeleniKarton("Test cases", "Dragoljub B.", 10));
        ispiti.add(new ZeleniKarton("Bug reports", "Dragoljub B.", 7));
        ispiti.add(new ZeleniKarton("CV", "Milena Dj.", 5));
        ispiti.add(new ZeleniKarton("Motivaciono pismo", "Milena Dj.", 6));
        ispiti.add(new ZeleniKarton("Selenium", "Milan J.", 8));
        ispiti.add(new ZeleniKarton("Postman", "Vlada M.", 10));

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
        }

        int suma = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            suma = suma + ispiti.get(i).getOcena();
        }

        double avg = suma / (ispiti.size() * 1.0);
        System.out.println(String.format("Prosecna ocena: %.2f", avg));

        int sumaPolozenih = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).jePolozenIspit()) {
                sumaPolozenih = sumaPolozenih + ispiti.get(i).getOcena();
            }
        }

        int brojPolozenih = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).jePolozenIspit()) {
                brojPolozenih++;
            }
        }

        double avgPolozenih = sumaPolozenih / (brojPolozenih * 1.0);
        System.out.println(String.format("Prosecna ocena polozenih ispita: %.2f", avgPolozenih));

    }
}
