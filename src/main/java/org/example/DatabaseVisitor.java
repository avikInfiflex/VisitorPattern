package org.example;

public interface DatabaseVisitor {
    void visit(JDO jdo);
    void visit(Datastore datastore);
}
