package org.example;

public class EntityService extends BaseService {
    public EntityService(DatabaseType databaseType) {
        super(databaseType);
    }

    public void saveEntity(Object obj) {
        System.out.println("Inside Entity-Service Save");
        super.save(obj);
        System.out.println("Entity Save success");
    }

    public Object getEntity(Class<Entity> entityClass, Long id) {
        System.out.println("Inside Entity-Service Get");
        System.out.println("Entity GET success with id "+id);
        return super.get(Object.class, id);

    }
}
