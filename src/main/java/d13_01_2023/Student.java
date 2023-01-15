package d13_01_2023;

import java.util.ArrayList;

public class Student {

    private String brIndexa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public Student () {
        this.ispiti = new ArrayList<>();
    }

    public Student(String brIndexa, String imeIPrezime, String tipStudija) {
        this.brIndexa = brIndexa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }

    public double prosek(){
        int sumaPolozenih = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).jePolozenIspit()){
                sumaPolozenih += this.ispiti.get(i).getOcena();
            }
        }
        int brojPolozenih = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).jePolozenIspit()){
                brojPolozenih++;
            }
        }
        return sumaPolozenih / (brojPolozenih * 1.0);
    }

    public void stampaj(){
        System.out.println(this.brIndexa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampajIspit();
        }
        System.out.println(String.format("Prosecna ocena: %.2f", prosek()));
    }
}