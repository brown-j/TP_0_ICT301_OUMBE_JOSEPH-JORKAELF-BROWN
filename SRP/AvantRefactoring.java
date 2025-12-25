package ict301.solid.srp;

// Classe qui viole le SRP
public class Book {

    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Responsabilité 1 : données
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    // Responsabilité 2 : affichage
    public void printToScreen() {
        System.out.println("Titre : " + title);
        System.out.println("Auteur : " + author);
        System.out.println("Contenu : " + content);
    }

    // Responsabilité 3 : persistance
    public void saveToDatabase() {
        System.out.println("Sauvegarde du livre '" + title + "' en base de données...");
    }

    // Responsabilité 4 : logique métier
    public void emprunter(String lecteur) {
        System.out.println("Emprunt du livre '" + title + "' par " + lecteur);
    }
}
