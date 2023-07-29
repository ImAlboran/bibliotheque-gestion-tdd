package fr.alboran.bibliothequetdd;

import java.awt.*;
import java.util.List;

public class Utilisateur {

    private String id;
    private String nom;
    private List<Livre> livres;

    public Utilisateur(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}
