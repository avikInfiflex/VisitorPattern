package org.example;

public class Datastore implements Database {
    public void accept(DatabaseVisitor visitor) {
        visitor.visit(this);
    }
}
