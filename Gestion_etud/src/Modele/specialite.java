package Modele;

public class specialite {
    private int id_sp;
    private String nom_sp;

    public specialite()
    {

    }

    public specialite(int id_sp, String nom_sp) {
        this.id_sp = id_sp;
        this.nom_sp = nom_sp;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public String getNom_sp() {
        return nom_sp;
    }

    public void setNom_sp(String nom_sp) {
        this.nom_sp = nom_sp;
    }
}
