package utils;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DBUtils {
    static final Sql2o sql2o =new Sql2o("jdbc:mysql://localhost:3306/dbmagicschool", "root", "");
    public static Connection Connection(){
        return sql2o.open();
    }
}
