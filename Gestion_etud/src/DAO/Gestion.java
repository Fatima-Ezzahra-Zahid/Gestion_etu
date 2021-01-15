package DAO;

import Modele.etudiant;
import Modele.module;
import Modele.specialite;

import java.util.List;

public interface Gestion {

    public void ajout(etudiant etudiant);
    public  void Modifier(etudiant etudiant);
    public  void Supprimer(etudiant etudiant);
    List<etudiant>List1();

    public void ajout(module module);
    public  void Modifier(module module);
    public  void Supprimer(module module);
    List<module>List2();

    public void ajout(specialite specialite);
    public  void Modifier(specialite specialite);
    public  void Supprimer(specialite specialite);
    List<specialite>List3();




}
