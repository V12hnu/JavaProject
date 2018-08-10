package DataBase;

import java.sql.*;

/**
 * Created by vishnu on 26/07/18.
 */
public class DBExample {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student"
                ,"root","root");
        Statement statement1;
        ResultSet rs;


        CallableStatement cs=connection.prepareCall("{call new_procedure(?,?,?)}");

        cs.setInt(1,20000);
        cs.setString(2,"aaa");
        cs.registerOutParameter(3,Types.INTEGER);
        cs.execute();

        int x=cs.getInt(3);
      int y=cs.getInt("total");
      System.out.println(y);
        ResultSet rs1=cs.getResultSet();
        while(rs1.next()){
            System.out.println(rs1.getInt("empid")+" "+rs1.getString("empname")+" "+rs1.getInt(3));
        }
        connection.close();

    }
}
