package fr.alboran.bibliothequetdd;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@ToString
@Getter
@Setter
public class Bibliotheque {

    private List<Livre> livres_disponible;
    private  List<Utilisateur> utilisateurs_inscrit;


    public Bibliotheque() {
        this.livres_disponible = new ArrayList<Livre>();
        this.utilisateurs_inscrit = new ArrayList<Utilisateur>();
    }

    public void ajouterLivre(Livre unLivre){
        this.livres_disponible.add(unLivre);
    }


    public void enregistrerUtilisateur(Utilisateur unUtilisateur){

    }

    public void emprunterLivre(Utilisateur unUtilisateur, Livre unLivre){

    }

    public void afficherLivresDisponibles(){
        System.out.println(this.livres_disponible);
    }

    public void afficherLivresEmpruntes(Utilisateur unUtilisateur){

    }

    public void afficherUtilisateursInscrits(){

    }
}
