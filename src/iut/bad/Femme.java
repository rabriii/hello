package iut.bad;

public class Femme extends Humain {


    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public String toString() {
        return nom + " " + prenom + " (" + age + " ans)";
    }

    public static void main(String[] args) {
        Homme homme = new Homme("Dupont", "Jean", 30);
        Femme femme = new Femme("Martin", "Claire", 28);

        femme.ami(homme, 100);
    }



}
