package ict301.solid.dip.old;

// Classe de bas niveau
class MySQLDatabase {

    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

// Module de haut niveau dépendant d’un détail concret
public class OrderProcessor {

    private MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase(); // dépendance forte ❌
    }

    public void processOrder(String order) {
        database.save(order);
    }
}

class MainDIP {

    public static void main(String[] args) {
        OrderProcessor order = new OrderProcessor();
        order.processOrder("Commande à sauvegarder");
    }
}
