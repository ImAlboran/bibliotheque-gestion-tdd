# bibliotheque-gestion-tdd
 Créer un système de gestion de bibliothèque qui permettra de gérer les livres et les emprunts des utilisateurs.

 Classe Livre :  
  -ID  
  -titre : String  
  -auteur : String  
  -annee_publication : Int  

Classe Utilisateur :  
 -ID  
 -nom : String  
 -livres : List<Livre>  

Classe Bibliotheque :  
 -livres_disponible : List<Livre>  
 -utilisateurs_inscrit : List<Utilisateur>


## Les fonctionnalités à implémenter sont les suivantes :


 1) Ajouter un livre à la bibliothèque.
 
 2) Enregistrer un nouvel utilisateur.
 
 3) Permettre à un utilisateur d'emprunter un livre (le livre doit être retiré de la liste des livres disponibles et ajouté à la liste des livres empruntés par l'utilisateur).

 4) Permettre à un utilisateur de rendre un livre (le livre doit être retiré de la liste des livres empruntés par l'utilisateur et ajouté à la liste des livres disponibles dans la bibliothèque).
 
 5) Afficher la liste des livres disponibles dans la bibliothèque.

 6) Afficher la liste des livres empruntés par un utilisateur donné.
 
 7) Afficher la liste des utilisateurs inscrits à la bibliothèque.
  
