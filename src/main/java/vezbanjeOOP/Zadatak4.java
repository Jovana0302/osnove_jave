package vezbanjeOOP;

public class Zadatak4 {
    public static void main(String[] args) {

        InstagramImage image = new InstagramImage(1, 100, 1, 100, "instagram.com/korsnik-itbootcamp/dodela.jpg");
        InstagramImage image1 = new InstagramImage(1, 100, 1, 100, "instagram.com/korsnik-itbootcamp/dodela1.jpg");

        InstagramPost post = new InstagramPost();
        post.setOpis("Dodela diploma QA");
        post.dodajSliku(image);

        image.dodajTag(new InstagramTag(30, 30, new InstagramUser("milan", "Milan Jovanovic", "milan@gmail.com")));
        image.dodajTag(new InstagramTag(60, 60, new InstagramUser("vlada", "Vladimir Minic", "vlada@gmail.com")));

        post.dodajSliku(image1);
        image1.dodajTag(new InstagramTag(50, 50, new InstagramUser("milena", "Milena Djordjevic", "milena@gmail.com")));

        post.stampajPost();
    }
}
