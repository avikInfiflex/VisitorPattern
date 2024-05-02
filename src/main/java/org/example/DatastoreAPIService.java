package org.example;

public class DatastoreAPIService implements DatabaseType {
    public Object save(Object obj) {
        System.out.println("Datastore save method called");
        // Provide the Datastore-specific implementation for save
        return obj;
    }

    public Object get(Class<?> clazz, Long id) {
        System.out.println("Datastore get method called with id"+id);
        // Provide the Datastore-specific implementation for get
        return null;  // Replace with actual implementation
    }
}
