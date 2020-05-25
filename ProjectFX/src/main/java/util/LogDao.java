package util;

import model.LogOfDailyCalorie;

import javax.persistence.Persistence;

public class LogDao extends BasicDao<LogOfDailyCalorie> {

    private static LogDao instance;

    public LogDao() {
        super(LogOfDailyCalorie.class);
    }


    public static LogDao getInstance() {
        if (instance == null) {
            instance = new LogDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("test").createEntityManager());
        }
        return instance;
    }

}
