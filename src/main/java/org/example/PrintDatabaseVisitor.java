package org.example;

public class PrintDatabaseVisitor implements DatabaseVisitor {
    public void visit(JDO jdo) {
        System.out.println("From JDO");
    }

    public void visit(Datastore datastore) {
        System.out.println("From Datastore");
    }
}