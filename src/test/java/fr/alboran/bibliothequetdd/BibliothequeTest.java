package fr.alboran.bibliothequetdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.jupiter.api.Assertions.*;


public class BibliothequeTest {

    private Bibliotheque b;
    @BeforeEach
    public void setup(){
        b = new Bibliotheque();

    }

    @Test
    public void testAjouterLivre() {
        // Arrange
        Livre livre = new Livre("1", "Titre du livre", "Auteur du livre", 2023);
        Utilisateur u = new Utilisateur("u", "Jordan");

        // Act
        b.ajouterLivre(livre);

        // Assert
        List<Livre> livresDisponibles = b.getLivres_disponible();
        assertEquals(1, livresDisponibles.size());
        assertEquals(livre, livresDisponibles.get(0));
        assertEquals(livre.getClass(), Livre.class);
        assertThat(2030,greaterThan(livre.getAnnee_publication()));
    }

    @Test
    void testAjouterUnLivre() {
        Livre livre = new Livre("xed", "Titre du livre", "Auteur du livre", 1998);
        b.ajouterLivre(livre);
        assertTrue(b.getLivres_disponible().contains(livre));
    }

    @Test
    void testAjouterLivre_QuandLivreDejaPresent() {
        Livre livre = new Livre("xed", "Titre du livre", "Auteur du livre", 1998);
        b.ajouterLivre(livre);

        // Vérifier que le livre n'est pas ajouté une deuxième fois
        int tailleAvant = b.getLivres_disponible().size();
        b.ajouterLivre(livre);
        int tailleApres = b.getLivres_disponible().size();

        assertEquals(tailleAvant, tailleApres);
    }



    //Ajouter un livre
    //  -Ajouter un objet de type autre que Livre ?
    //  -Ajouter un livre sans titre ?
    //  -Ajouter un livre dont la date est superieur a celle d'aujourd'hui

    //Ajouter un utilisateur
    //  -Ajouter un objet de type autre que Utilisateur ?
    //  -Ajouter un livre sans nomn ?

    //Afficher les utilisateurs inscrit

    //Emprunter un livre

    //aficher les livres empruntees par un utilisateur


}
