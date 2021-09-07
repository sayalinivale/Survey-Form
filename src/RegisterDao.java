import java.sql.*;
import java.util.*;
import java.io.*;


public class RegisterDao {

	private static String dbUrl = "jdbc:mysql://localhost:3306/userdb";
	private static String dbUname = "root";
	private static String dbPassword = "root";
	private static String dbDriver = "com.mysql.cj.jdbc.Driver";


	public static void LoadDriver(String dbDriver)
	{
		try
			{
			
			Class.forName(dbDriver);
			}catch (ClassNotFoundException e){
				e.printStackTrace();
			}
		
	}
	
	public static Connection getConnection()
	{
		Connection con= null;
		try {
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public static String insert(Member member)
	{		
		LoadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data Entered Successfully";
		String sql = " insert into member values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try{
			
		ps = con.prepareStatement(sql);
		
		ps.setString(1, member.getName());
		ps.setString(2, member.getAdharNumber());
		ps.setString(3, member.getEmail());
		ps.setString(4, member.getPhoneNumber());
		ps.setString(5, member.getGender());
		ps.setString(6, member.getVaccinated());
		ps.setString(7, member.getFirstDose());
		ps.setString(8, member.getSecondDose());
		ps.setString(9, member.getVaccineNmae());
		ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		result= "Data Not Entered";
	
	}
		return result;
	
}
}