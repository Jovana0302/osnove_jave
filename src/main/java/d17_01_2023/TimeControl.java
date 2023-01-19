package d17_01_2023;

public class TimeControl extends Control {

    private boolean pomerenoUnapred;

    private VideoPlayer player;

    public TimeControl(){
        super();
    }

    public void pomeriUnapred(){
        this.pomerenoUnapred = true;
    }

    public void pomeriUnazad(){
        this.pomerenoUnapred = false;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        this.player = player;
        if (this.pomerenoUnapred){
            this.player.setTrenutnoVreme(this.player.getTrenutnoVreme() + 15);
        } else {
            this.player.setTrenutnoVreme(this.player.getTrenutnoVreme() - 15);
        }
        if (this.player.getTrenutnoVreme() + 15 > this.player.getDuzina()) {
            this.player.setTrenutnoVreme(this.player.getDuzina());
        }
        if (this.player.getTrenutnoVreme() - 15 < 0) {
            this.player.setTrenutnoVreme(0);
        }
    }

}
