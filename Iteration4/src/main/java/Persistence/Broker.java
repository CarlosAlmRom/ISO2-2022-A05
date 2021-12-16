package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Broker class allows the end-user to connect to an available desktop.
 * @author Gonzalo Torres Aparicio
 * @version 0.0.0
 */
public class Broker {
	static String dbURL = " ";
    static String username = "root";
    static String password = "1234";
    protected static Broker broker=null;
    protected static Connection BBDD;

    /**
     * @throws Exception
     */
    public Broker() throws Exception {
        Class.forName(" ");
        BBDD=DriverManager.getConnection(dbURL, username, password);
    }

    /**
     * @return Broker
     * @throws Exception
     */
    public static Broker getBroker() throws Exception {
        if (broker==null) {
        	broker=new Broker();
        }
        return broker;
    }

    /**
     * @param SQL
     * @return res as an int of the statement
     * @throws Exception
     */
    public static int insert(String SQL) throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }

    /**
     * @param SQL
     * @return res as an int of the statement
     * @throws Exception
     */
    public int update(String SQL)throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }

    /**
     * @param SQL
     * @return res as an int of the statement
     * @throws Exception
     */
    public static int delete(String SQL) throws Exception{
        PreparedStatement stmt = BBDD.prepareStatement(SQL);
        int res=stmt.executeUpdate();
        stmt.close();
        return res;
    }
}
