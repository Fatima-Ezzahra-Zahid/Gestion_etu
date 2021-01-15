package Modele;

public class etudiant {


    private int id_et;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String email;
    private String ville;
    private String specialite;

    public etudiant(){

    }

    public etudiant(int id_et, String nom, String prenom, String dateNaissance, String email, String ville, String specialite) {
        this.id_et = id_et;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.ville = ville;
        this.specialite = specialite;
    }

    public int getId_et() {
        return id_et;
    }

    public void setId_et(int id_et) {
        this.id_et = id_et;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
