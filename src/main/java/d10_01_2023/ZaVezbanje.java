package d10_01_2023;

public class ZaVezbanje {
    public static void main(String[] args) {

        Video v = new Video("v6tuOipj5mk", "Ariana Grande - positions (official video)",
                            130,22,31, 34893482);
        YoutubePlayer p = new YoutubePlayer();

        p.ucitajVideo(v);

        p.pojacaj();
        p.pojacaj();
        p.smanji();

        p.aktivirajPrekoCelogEkranaMod();

        p.premotajUnapred(v);
        p.premotajUnapred(v);
        p.premotajUnazad();

        v.lajkuj();
        v.dislajkuj();

        p.iscitaj(v, 7);

        System.out.println("Link: " + p.shareVideo(v));
    }
}
