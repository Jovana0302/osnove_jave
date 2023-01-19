package d16_01_2023;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba(){}

    public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja){
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime(){
        return this.imeIPrezime;
    }

    public String getJmbg(){
        return this.jmbg;
    }

    public int getGodinaRodjenja(){
        return this.godinaRodjenja;
    }

    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }

    public void setJmbg(String jmbg){
        this.jmbg = jmbg;
    }

    public void setGodinaRodjenja(int godinaRodjenja){
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj(){
        System.out.println("(" + this.imeIPrezime + "), (" + this.jmbg + "), (" + this.godinaRodjenja + ")");
    }

}
