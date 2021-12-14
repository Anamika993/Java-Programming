import java.sql.*;
public class jdbc1
{
    Connection con;
    jdbc1()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionURL="jdbc:mysql://localhost:3307/jdbc";
            con=DriverManager.getConnection(connectionURL,"root","root");
            System.out.println("Connection Successs. ");
//            Statement stmt =con.createStatement();
//            ResultSet rs= stmt.executeQuery("Select * from bbbb");
//            while(rs.next())
//                System.out.println(rs.getInt(1));
        }
        catch(Exception e)
        {
            System.out.println("Connection failed .."+e);
        }
    }
    public static void main(String args[])
    {
        jdbc1 obj = new jdbc1();
    }
}
