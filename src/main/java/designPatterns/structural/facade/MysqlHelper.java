package designPatterns.structural.facade;

import java.sql.Connection;

public class MysqlHelper {
    public static  Connection getMysqlDBConnection()
    {
        System.out.println("Getting Mysql connections");
        return null;

    }
    public void generateMysqlPDFReport(String tableName, Connection con)
    {
        System.out.println("Mysql : Pdf Report : Table "+tableName);
    }
    public void  generateMysqlHTMLReport(String tableName,Connection con)
    {
        System.out.println("Mysql : HTML Report : Table "+tableName);
    }

}
