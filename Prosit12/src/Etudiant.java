public class Etudiant {
    private int ID;
    private String nom;
    private int age;


    public Etudiant(int ID, String nom, int age) {
        this.ID = ID;
        this.nom = nom;
        this.age = age;
    }

    public Etudiant() {
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "ID=" + ID +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
