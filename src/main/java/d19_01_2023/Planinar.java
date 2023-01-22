package d19_01_2023;

public abstract class Planinar {

    protected String id;

    protected String imeIPrezime;

    public Planinar(String id, String imeIPrezime) {
        this.id = id;
        this.imeIPrezime = imeIPrezime;
    }

    public String getId() {
        return id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public abstract void stampaj();

    public abstract int clanarina();

    public abstract boolean uspesanUspon(Planina planina);
}
