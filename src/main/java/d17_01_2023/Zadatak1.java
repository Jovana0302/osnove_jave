package d17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer player = new VideoPlayer(180,100,20);
        player.stampaj();
        System.out.println();

        TimeControl time = new TimeControl();
        AudioControl audio = new AudioControl();
        QualityOptimizerControl quality = new QualityOptimizerControl(50);

        quality.izvrsiAkciju(player);

        time.pomeriUnapred();
        time.izvrsiAkciju(player);
        time.pomeriUnapred();
        time.izvrsiAkciju(player);
        player.stampaj();
        System.out.println();

        audio.pojacaj();
        audio.izvrsiAkciju(player);
        audio.pojacaj();
        audio.izvrsiAkciju(player);
        player.stampaj();
        System.out.println();

        time.pomeriUnazad();
        time.izvrsiAkciju(player);
        audio.smanji();
        audio.izvrsiAkciju(player);
        player.stampaj();

    }
}
