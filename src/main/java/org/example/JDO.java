package org.example;

public class JDO implements Database {
    public void accept(DatabaseVisitor visitor) {
        visitor.visit(this);
    }
}
