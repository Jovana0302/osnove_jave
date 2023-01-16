package vezbanjeOOP;

public class InstagramUser {
    private String username;
    private String imeIPrezime;
    private String email;

    public InstagramUser(String username, String imeIPrezime, String email) {
        this.username = username;
        this.imeIPrezime = imeIPrezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getEmail() {
        return email;
    }
}
