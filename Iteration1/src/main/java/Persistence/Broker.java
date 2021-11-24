package Persistence;
import java.sql.*;

public class Broker {
	static String dbURL = " ";
    static String username = "root";
    static String password = "1234";
    protected static Broker broker=null;
    protected static Connection BBDD;

    public Broker() throws Exception {
        Class.forName(" ");
        BBDD=DriverManager.getConnection(dbURL, username, password);
    }

    public static Broker getBroker() throws Exception {
        if (broker==null) {
        	broker=new Broker();
        }
        return broker;
    }

    public static int insert(String SQL) throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }

    public int update(String SQL)throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }

    public static int delete(String SQL) throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }
}
