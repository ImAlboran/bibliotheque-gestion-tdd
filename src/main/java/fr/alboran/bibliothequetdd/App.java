package fr.alboran.bibliothequetdd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Bibliotheque uneBibliotheque = new Bibliotheque();
        // Ajout de livres à la bibliothèque
        Livre livre1 = new Livre("978-0590353427", "Harry Potter à l'école des sorciers", "J.K. Rowling", 1997);
        Livre livre2 = new Livre("978-2070624579", "Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        uneBibliotheque.ajouterLivre(livre1);
        uneBibliotheque.ajouterLivre(livre2);

        // Enregistrement d'utilisateurs
        Utilisateur utilisateur1 = new Utilisateur("001", "Alice");
        Utilisateur utilisateur2 = new Utilisateur("002", "Bob");
        uneBibliotheque.enregistrerUtilisateur(utilisateur1);
        uneBibliotheque.enregistrerUtilisateur(utilisateur2);

        // Emprunt de livres
        uneBibliotheque.emprunterLivre(utilisateur1, livre1);
        uneBibliotheque.emprunterLivre(utilisateur2, livre2);

        // Affichage des livres disponibles
        uneBibliotheque.afficherLivresDisponibles();

        // Affichage des livres empruntés par un utilisateur
        uneBibliotheque.afficherLivresEmpruntes(utilisateur1);

        // Affichage des utilisateurs inscrits
        uneBibliotheque.afficherUtilisateursInscrits();
    }

}
