package org.example;

public class Main {

    /*
 *  DatabaseVisitor Interface: This is an interface that declares visit operations for all types of visitable classes (JDO and Datastore). In our example, it has two methods: visit(JDO jdo) and visit(Datastore datastore).
 *  Database Interface: This is an interface that declares a method accept(DatabaseVisitor visitor). The classes that implement this interface (JDO and Datastore) will use this method to accept the visitor.
 *  JDO and Datastore Classes: These classes implement the Database interface and define the accept method. The accept method takes a DatabaseVisitor as an argument and calls the visit method on the visitor, passing itself (this) as an argument.
 *  PrintDatabaseVisitor Class: This class implements the DatabaseVisitor interface and defines the visit methods. When a visit method is called, it prints a message indicating which class it’s visiting.
 *  Main Class: This class creates an array of Database objects (which are JDO and Datastore objects), creates a PrintDatabaseVisitor, and iterates over the Database array, accepting the visitor for each database.
     */
   public static void main(String[] args) {
       String DatabaseType = "JDO";
       //application type = "Datastore"/"JDO"
       DatabaseVisitor visitor = new PrintDatabaseVisitor();

       switch (DatabaseType) {
           case "JDO":
               Database jdo = new JDO();
               jdo.accept(visitor);
               break;
           case "Datastore":
               Database datastore = new Datastore();
               datastore.accept(visitor);
               break;
           default:
               System.out.println("Invalid DatabaseType");
               break;
       }
   }
}