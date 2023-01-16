package vezbanjeOOP;

public class HistoryPage {

    private String naziv;
    private String link;
    private int vremeSat;
    private int vremeMinut;
    private String username;
    private String password;

    public String getNaziv() {
        return naziv;
    }

    public String getLink() {
        return link;
    }

    public int getVremeSat() {
        return vremeSat;
    }

    public int getVremeMinut() {
        return vremeMinut;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setVremeSat(int vremeSat) {
        this.vremeSat = vremeSat;
    }

    public void setVremeMinut(int vremeMinut) {
        this.vremeMinut = vremeMinut;
    }

    public HistoryPage(String naziv, String link, int vremeSat, int vremeMinut) {
        this.naziv = naziv;
        this.link = link;
        this.vremeSat = vremeSat;
        this.vremeMinut = vremeMinut;
    }

    public void sacuvajKredencijale(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void obrisiKolacice(){
        this.username = null;
        this.password = null;
    }

    public void stampaj(){
        if (this.username != null && this.password != null) {
            System.out.println(this.vremeSat + " - " + this.vremeMinut + " - " + this.naziv + "..." + this.link + " *");
        } else {
            System.out.println(this.vremeSat + " - " + this.vremeMinut + " - " + this.naziv + "..." + this.link);
        }
    }

}
