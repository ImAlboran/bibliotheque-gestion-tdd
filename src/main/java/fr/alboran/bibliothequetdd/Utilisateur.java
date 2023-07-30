package fr.alboran.bibliothequetdd;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Utilisateur {

    private String id;
    private String nom;
    private List<Livre> livres;

    public Utilisateur(String id, String nom) {
        this.id = id;
        this.nom = nom;
        this.livres = new ArrayList<Livre>();
    }
}
