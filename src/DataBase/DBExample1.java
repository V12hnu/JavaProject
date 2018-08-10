package DataBase;

import com.mysql.jdbc.exceptions.MySQLNonTransientConnectionException;

import java.sql.*;

/**
 * Created by vishnu on 30/07/18.
 */
public class DBExample1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
//        try(Statement statement=connection.createStatement()){
//            int i= statement.executeUpdate("insert into Department values(2,'ECE');");
//        }
        Statement statement1=connection.createStatement();
        ResultSet rs;
        rs=statement1.executeQuery("select * from Department;");
         while(rs.next()){
             System.out.println(rs.getInt("did")+"  "+rs.getString("dname"));
         }

    }
}
