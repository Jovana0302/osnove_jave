package vezbanjeOOP;

import java.util.ArrayList;

public class History {

    private ArrayList<HistoryPage> poseceneStranice;

    public History(){
        this.poseceneStranice = new ArrayList<>();
    }

    public void otvoriStranicu(HistoryPage p){
        this.poseceneStranice.add(p);
    }

    public void obrisiPremaLinku(String link){
         for (int i = 0; i < this.poseceneStranice.size(); i++) {
              if (link.equals(this.poseceneStranice.get(i).getLink())){
                    this.poseceneStranice.remove(i);
              }
         }
    }

    public void obrisiKolacice(String link){
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            if (link.equals(this.poseceneStranice.get(i).getLink())){
                this.poseceneStranice.get(i).obrisiKolacice();
            }
        }
    }

    public void obrisiIstoriju(){
        for (int i = 0; i <= this.poseceneStranice.size(); i++) {
            this.poseceneStranice.remove(0);
        }
    }

    public void sacuvajKredencijale(String naziv, String username, String password){
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            if (naziv.equals(this.poseceneStranice.get(i).getNaziv())){
                this.poseceneStranice.get(i).sacuvajKredencijale(username, password);
            }
        }
    }

    public void pogledajIstoriju(){
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            this.poseceneStranice.get(i).stampaj();
        }
    }

    public void obrisiSveKolacice() {
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            this.poseceneStranice.get(i).obrisiKolacice();
        }
    }

    public void obrisiSveKolaciceZaSadnjihSatVremena(int sat, int minut){
        for (int i = 0; i < this.poseceneStranice.size(); i++) {
            if ((this.poseceneStranice.get(i).getVremeSat() == sat) && (this.poseceneStranice.get(i).getVremeMinut() <= minut)){
                this.poseceneStranice.get(i).obrisiKolacice();
            } else if ((this.poseceneStranice.get(i).getVremeSat() == sat - 1) && (this.poseceneStranice.get(i).getVremeMinut() >= minut)){
                this.poseceneStranice.get(i).obrisiKolacice();
            }
        }
    }

}
