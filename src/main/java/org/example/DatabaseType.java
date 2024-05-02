package org.example;

public interface DatabaseType {
    Object save(Object obj);
    Object get(Class<?> clazz, Long id);
}
