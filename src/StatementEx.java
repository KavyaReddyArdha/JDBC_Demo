import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementEx {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="system";
        String password="abcd12345";

        Connection con= DriverManager.getConnection(url,username,password);
        if(con != null){
            System.out.println("Connection Established");
            Statement st= con.createStatement();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the details :");
            int id=sc.nextInt();
            String name=sc.next();
            int salary=sc.nextInt();
            int x=st.executeUpdate("insert into tcs values(" + id+ ",'" + name+ " '," + salary + ")");
            if (x!=0)
                System.out.println("Record inserted");

        }
    }
}



