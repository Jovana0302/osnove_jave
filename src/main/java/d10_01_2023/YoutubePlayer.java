package d10_01_2023;

public class YoutubePlayer {
    private Video v;
    private int kvalitet;
    private String rezim;
    private int zvuk;
    private int trenutnoVreme;

    public Video getV() {
        return v;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public String getRezim() {
        return rezim;
    }

    public int getZvuk() {
        return zvuk;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public YoutubePlayer(){
        this.zvuk = 75;
        this.kvalitet = 144;
        this.rezim = "mini player";
    }

    public void ucitajVideo(Video v){
        this.v = v;
        this.trenutnoVreme = 0;
        this.v.pogledaj();
    }

    public void pojacaj(){
        this.zvuk = this.zvuk + 10;
        if (this.zvuk > 100) {
            this.zvuk = 100;
        }
    }

    public void smanji(){
        this.zvuk = this.zvuk - 10;
        if (this.zvuk < 0) {
            this.zvuk = 0;
        }
    }

    public void postaviKvalitet(double brzinaInterneta){
        if (brzinaInterneta < 2) {
            this.kvalitet = 144;
        } else if (brzinaInterneta < 4) {
            this.kvalitet = 240;
        } else if (brzinaInterneta < 6) {
            this.kvalitet = 360;
        } else if (brzinaInterneta < 8) {
            this.kvalitet = 720;
        } else {
            this.kvalitet = 1080;
        }
    }

    public void aktivirajMiniPlayerMod(){
        this.rezim = "mini player";
    }

    public void aktivirajBioskopskiMod(){
        this.rezim = "bioskopski rezim";
    }

    public void aktivirajPrekoCelogEkranaMod(){
        this.rezim = "preko celog ekrana";
    }

    public void premotajUnapred(Video v){
        this.trenutnoVreme = this.trenutnoVreme + 10;
        if (this.trenutnoVreme + 10 > this.v.getDuzina()) {
            this.trenutnoVreme = this.v.getDuzina();
        }
    }

    public void premotajUnazad(){
        this.trenutnoVreme = this.trenutnoVreme - 10;
        if (this.trenutnoVreme - 10 < 0) {
            this.trenutnoVreme = 0;
        }
    }

    public void iscrtajZvuk(){
        System.out.print("<: ");
        for (int i = 0; i < this.zvuk / 10; i++) {
            System.out.print("|");
            if (this.zvuk == 0) {
                System.out.println("/");
            }
        }
        System.out.println();
    }

    public void iscrtajRezim() {
        if (this.rezim.equals("mini player")) {
            System.out.println("[ ]");
        } else if (this.rezim.equals("bioskopski rezim")) {
            System.out.println("[ ..]");
        } else if (this.rezim.equals("preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }

    public void iscrtajTrenutnoVreme(Video v){
        System.out.print(this.trenutnoVreme / 60 + ":" + this.trenutnoVreme % 60 + " / " +
                this.v.getDuzina() / 60 + ":" + this.v.getDuzina() % 60 + "  ");
    }

    public void iscrtajTimeline(Video v){
        for (int i = 1; i <= 100; i++) {
            if (i <= this.trenutnoVreme * 100 / this.v.getDuzina()) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public void iscitaj(Video v, double brzinaInterneta){
        iscrtajTrenutnoVreme(v);
        System.out.print("Zvuk ");
        iscrtajZvuk();
        System.out.print("Timeline: ");
        iscrtajTimeline(v);
        postaviKvalitet(brzinaInterneta);
        System.out.println("Kvalitet: " + this.kvalitet);
        System.out.print("Rezim: ");
        iscrtajRezim();
        System.out.println(this.v.getNaziv());
        System.out.println("Likes " + this.v.getLikes() + " | Dislikes " + this.v.getDislikes());
        System.out.println(this.v.getPregledi() + " Pregleda");
    }

    public String shareVideo(Video v){
        return "https://youtu.be/" + this.v.getId();
    }

}
