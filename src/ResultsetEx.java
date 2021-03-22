import java.sql.*;

public class ResultsetEx {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abcd12345");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from tcs");
        rs.absolute(5);
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        con.close();

    }
}