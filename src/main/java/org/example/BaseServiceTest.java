package org.example;

import org.junit.Before;
import org.junit.Test;

public class BaseServiceTest {
    private BaseService service;
    private Object obj;
    private ApplicationSetup setup;
    private Object applicationSetup;
    public Entity entity;
    private EntityService eService;


    @Before
    public void setup() {
        setup = new ApplicationSetup();
        entity = new Entity();
        entity.setId(21653L);
        entity.setName("Test Entity");

        setup.setDatabaseType(new DatastoreAPIService());
        DatabaseType databaseType = setup.getDatabaseType();

        // Set the database in the service
        service = new BaseService(databaseType);

        // Initialize EntityService with the correct DatabaseType
        eService = new EntityService(databaseType);

        // Create a test object
        obj = new Object();
    }

    @Test
    public void test() {
        setup.save(applicationSetup);
        eService.saveEntity(entity);
        eService.getEntity(Entity.class, 214654L);
       // service.save(obj);
       // service.get(Object.class, 16536253L);
    }
}
