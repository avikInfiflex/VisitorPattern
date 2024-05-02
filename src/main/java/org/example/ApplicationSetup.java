package org.example;

public class ApplicationSetup {
    private DatabaseType databaseType;

    public void setDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    public DatabaseType getDatabaseType() {
        return this.databaseType;
    }

    public void save(Object obj) {
        BaseService baseService = new BaseService(databaseType);
        baseService.save(obj);
        System.out.println("Application Save Success");
    }
}
