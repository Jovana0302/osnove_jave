package d17_01_2023;

public class VideoPlayer {
    private int duzina;
    private int trenutnoVreme;
    private int zvuk;
    private int kvalitet;

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getZvuk() {
        return zvuk;
    }

    public void setZvuk(int zvuk) {
        this.zvuk = zvuk;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public VideoPlayer(){}

    public VideoPlayer(int duzina, int trenutnoVreme, int zvuk, int kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.zvuk = zvuk;
        this.kvalitet = kvalitet;
    }

    public VideoPlayer(int duzina, int trenutnoVreme, int zvuk) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.zvuk = zvuk;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme: " + this.trenutnoVreme / 60 + ":" + this.trenutnoVreme % 60);
        System.out.println("Zvuk: " + this.zvuk);
        System.out.println("Kvalitet: " + this.kvalitet);
    }

}
