package org.example;

public class BaseService {
    private final DatabaseType databaseType;

    public BaseService(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    public Object save(Object obj) {
        System.out.println("Inside Base-Service Save");
        return databaseType.save(obj);
    }

    public Object get(Class<?> clazz, Long id) {
        System.out.println("Inside Base-Service Get");
        return databaseType.get(clazz, id);
    }
}