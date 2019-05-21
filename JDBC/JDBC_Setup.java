import java.sql.*;

class JDBC_Setup{
    public static void main(String[]args){
        Class.forName("com.mysql.jdbc.jdbc.Driver");
        Connection con = DriverManager.getConnection("url", "username", "password"); //DB Info
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from TableName");
        
        while(rs.next()){
            System.out.println(rs.getInt(1) + rs.getString(2) );       
        }
        st.close();
        con.close();
    }
}