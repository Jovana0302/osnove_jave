package d10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor napisaoJe;

    public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor napisaoJe) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.napisaoJe = napisaoJe;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getNapisaoJe() {
        return napisaoJe;
    }

    public void print(){
        System.out.println("(" + this.isbn + ")");
        System.out.println("(" + this.naziv + ") (" + this.godinaIzdanja + ")");
        System.out.print("autor: ");
        this.napisaoJe.print();
        System.out.println();
    }
}
