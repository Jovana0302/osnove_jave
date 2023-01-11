package d10_01_2023;

public class Video {

    private String id;
    private String naziv;
    private int duzina;
    private int likes;
    private int dislikes;
    private int pregledi;

    public Video(String id, String naziv, int duzina, int likes, int dislikes, int pregledi) {
        this.id = id;
        this.naziv = naziv;
        this.duzina = duzina;
        this.likes = likes;
        this.dislikes = dislikes;
        this.pregledi = pregledi;
    }

    public String getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getDuzina() {
        return duzina;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getPregledi() {
        return pregledi;
    }

    public void lajkuj(){
        this.likes = this.likes + 1;
    }

    public void dislajkuj(){
        this.dislikes = this.dislikes + 1;
    }

    public void pogledaj(){
        this.pregledi = this.pregledi + 1;
    }
}
