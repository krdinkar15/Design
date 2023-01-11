package structural.facade;

import java.sql.Connection;

public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName="Employee";
        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection connection=MysqlHelper.getMysqlDBConnection();
        MysqlHelper mysqlHelper=new MysqlHelper();
        mysqlHelper.generateMysqlPDFReport(tableName,connection);

        connection=OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper=new OracleHelper();
        oracleHelper.generateOracleHTMLReport(tableName,connection);


        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL,HelperFacade.ReportTypes.HTML,tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE,HelperFacade.ReportTypes.PDF,tableName);
    }
}
