package d29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        post1.setPoster("Milan Jovanovic");
        post1.setProfile("Pera Peric");
        post1.setPost("Happy Birthday!");

        post1.like();
        post1.like();
        post1.like();

        post1.share();

        post1.print();

        FacebookPost post2 = new FacebookPost();
        post2.setPoster("Milan Jovanovic");
        post2.setProfile("Pera Peric");
        post2.setPost("Congrats!");

        post2.like();
        post2.dislike();
        post2.like();
        post2.like();

        post2.share();
        post2.share();

        post2.print();
    }
}
