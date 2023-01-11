package structural.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection()
    {
        System.out.println("Getting oracle connection");
        return  null;
    }
    public void generateOraclePDFReport(String tablename,Connection connection)
    {
        System.out.println("Oracle : PDF report : Table "+tablename);
    }
    public void generateOracleHTMLReport(String tablename,Connection connection)
    {
        System.out.println("Oracle: HTML Report : Table "+tablename);
    }
}
