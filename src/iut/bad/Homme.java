package iut.bad;

public class Homme extends Humain {

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public String toString() {
        return nom + " " + prenom + " (" + age + " ans)";
    }
}
