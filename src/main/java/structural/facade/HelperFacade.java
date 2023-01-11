package structural.facade;


import java.sql.Connection;

public class HelperFacade {

    public  static enum ReportTypes{
        HTML,PDF;
    }

    public static enum DBTypes {
        MYSQL,ORACLE
    }
    public static void generateReport(DBTypes dbTypes,ReportTypes reportTypes,String table)
    {
        Connection connection=null;
        switch (dbTypes)
        {
            case MYSQL:
                connection=MysqlHelper.getMysqlDBConnection();
                MysqlHelper mysqlHelper=new MysqlHelper();
                switch (reportTypes)
                {
                    case HTML:
                        mysqlHelper.generateMysqlHTMLReport(table,connection);
                        break;
                    case PDF:
                        mysqlHelper.generateMysqlPDFReport(table,connection);
                        break;
                }
                break;
            case ORACLE:
                connection= OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper=new OracleHelper();
                switch (reportTypes)
                {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(table,connection);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(table,connection);
                        break;
                }
                break;

        }
    }
}