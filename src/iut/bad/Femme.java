package iut.bad;

public class Femme extends Humain {


    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public String toString() {
        return nom + " " + prenom + " (" + age + " ans)";
    }


}
