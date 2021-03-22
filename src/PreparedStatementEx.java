import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class PreparedStatementEx {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "abcd12345";

        Connection con = DriverManager.getConnection(url, username, password);
        if (con != null) {
            System.out.println("Connection Established");
            String sql = "update people set firstname=? , lastname=? where id=?";

            PreparedStatement ps = con.prepareStatement("insert into tcs values (?,?,?)");

            ps.setInt(1,6);
            ps.setString(2, "Laxmi");
         ps.setInt (3, 75000);
         int x=ps.executeUpdate();
         if(x!=0)
             System.out.println("Record inserted");
        }
    }
}
