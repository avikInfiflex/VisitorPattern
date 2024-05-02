package org.example;

public class Mysql implements DatabaseType {

    public Object save(Object obj) {
        System.out.println("Mysql save method called");
        // Provide the MySQL-specific implementation for save
        return obj;
    }

    public Object get(Class<?> clazz, Long id) {
        System.out.println("Mysql get method called"+id);
        // Provide the MySQL-specific implementation for get
        return null;  // Replace with actual implementation
    }
}
