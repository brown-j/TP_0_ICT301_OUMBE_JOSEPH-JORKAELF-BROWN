package ict301.solid.srp;

// Responsabilité : données du livre
public class BookSRP {

    private String title;
    private String author;
    private String content;

    public BookSRP(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}

package ict301.solid.srp;

// Responsabilité : affichage
public class BookPrinter {

    public void printToScreen(BookSRP book) {
        System.out.println("Titre : " + book.getTitle());
        System.out.println("Auteur : " + book.getAuthor());
        System.out.println("Contenu : " + book.getContent());
    }
}

package ict301.solid.srp;

// Responsabilité : sauvegarde
public class BookSaver {

    public void saveToDatabase(BookSRP book) {
        System.out.println("Sauvegarde du livre '" + book.getTitle() + "' en base de données...");
    }
}

package ict301.solid.srp;

// Responsabilité : logique métier
public class BookBusinessLogic {

    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }
}
