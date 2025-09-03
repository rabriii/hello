package iut.bad;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println(toString());
    }
    @Override
    public void manger() {
        System.out.println("Je mange");
    }

    @Override
    public void boire() {
        System.out.println("Je bois");
    }

    public void ami(Humain h, int duree) {
        System.out.println(this.nom + " est ami avec " + h.nom);
    }


}
