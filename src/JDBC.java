// JDBC Class For Making Connections To SQL Databases.
import javax.swing.*;
import java.sql.*;
public class JDBC {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    Statement st2=null;
    Statement st3=null;
    void make() {
        try {
        Class.forName("java.sql.DriverManager");
        con=DriverManager.getConnection("jdbc:mysql://localhost/school","guest","");
        st=con.createStatement();
        st2=con.createStatement();
        st3=con.createStatement();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    ResultSet getRs(String sql) {
        try {
        rs=st.executeQuery(sql);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
    }
        
    }
