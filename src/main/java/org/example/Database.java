package org.example;

public interface Database {
    void accept(DatabaseVisitor visitor);
}
