package d13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student s = new Student("123", "Pera Peric", "osnovne");
        s.dodajIspit(new Ispit("Manuelno teorija", 9, "Dragoljub B."));
        s.dodajIspit(new Ispit("SQL", 5, "Milan J."));
        s.dodajIspit(new Ispit("Git", 8, "Vlada M."));
        s.dodajIspit(new Ispit("Java", 7, "Milan J."));
        s.dodajIspit(new Ispit("Java OOP", 8, "Vlada M."));
        s.dodajIspit(new Ispit("CV", 6, "Milena Dj."));

        s.stampaj();
    }
}