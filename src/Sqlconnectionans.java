import java.sql.*;

import javax.swing.*;
public class Sqlconnectionans {
	static Connection connec=null;
	public static Connection dbconnector1()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:F:\\Project\\answer.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
			return connec;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
