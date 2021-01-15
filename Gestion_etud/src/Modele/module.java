package Modele;

public class module {

    private int id_module;
    private String nom_m;
    private String specialite;

    public module()
    {

    }

    public module(int id_module, String nom_m, String specialite) {
        this.id_module = id_module;
        this.nom_m = nom_m;
        this.specialite = specialite;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public String getNom_m() {
        return nom_m;
    }

    public void setNom_m(String nom_m) {
        this.nom_m = nom_m;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
