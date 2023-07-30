package fr.alboran.bibliothequetdd;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Livre {

    private String id;
    private String titre;
    private String auteur;
    private int annee_publication;

    public Livre(String id, String titre, String auteur, int annee_publication) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.annee_publication = annee_publication;
    }

}
