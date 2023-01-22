package d19_01_2023;

public class Alpinista extends Planinar {

    private int poeni;

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public Alpinista(String id, String imeIPrezime){
        super(id, imeIPrezime);
    }

    public Alpinista(String id, String imeIPrezime, int poeni){
        super(id, imeIPrezime);
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + this.getId());
        System.out.println("Ime: " + this.getImeIPrezime());
        System.out.println("Broj poena: " + this.poeni);
    }

    @Override
    public int clanarina() {
        return 1500 - (this.poeni * 50);
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisina() <= 4000){
            return true;
        }
        return false;
    }
}
