package hrm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import hrm.model.User;



public class UserDAOImpl {
	private DataSource datasource;
	public UserDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	public User getUser(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM User WHERE username=?");
			stmt.setString(1,user.getUsername());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				user=new User();
				
				user.setUserNO(rs.getString("userNO"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setMail(rs.getString("mail"));
				
				user.setHobbies(rs.getString("hobbies"));
				user.setPosition(rs.getString("position"));
				user.setState(rs.getString("state"));
				
				user.setSparetime(rs.getString("sparetime"));
			}
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		return user;
	}
	public List<User> getUsers(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<User> users=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM User WHERE username=?");
			stmt.setString(1, user.getUsername());
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			users=new ArrayList<User>();
			while(rs.next()){
				user=new User();
				user.setUserNO(rs.getString("userNO"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setMail(rs.getString("mail"));
				
				user.setHobbies(rs.getString("hobbies"));
				user.setPosition(rs.getString("position"));
				user.setState(rs.getString("state"));
				
				user.setSparetime(rs.getString("sparetime"));
				users.add(user);
			
			}
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		return users;
	}
	public void addUser(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO User(userNO,username,password,phone,mail,hobbies,position,state,sparetime) VALUES(?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, user.getUserNO());
			stmt.setString(2,user.getUsername());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getPhone());
			stmt.setString(5, user.getMail());
			stmt.setString(6,user.getHobbies());
			stmt.setString(7, user.getPosition());
			stmt.setString(8, user.getState());
			stmt.setString(9, user.getSparetime());
			stmt.executeUpdate();
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
	}
	
	public void updateUser(User user){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update user set userNO=?,password=?,phone=?,mail=?,hobbies=?,position=?,state=?,sparetime=? where username=? and password=?");
			
			stmt.setString(1, user.getUserNO());
			
			stmt.setString(3, user.getNewPassword());
			stmt.setString(4, user.getPhone());
			stmt.setString(5, user.getMail());
			stmt.setString(6,user.getHobbies());
			stmt.setString(7, user.getPosition());
			stmt.setString(8, user.getState());
			stmt.setString(9, user.getSparetime());
			stmt.setString(2,user.getUsername());
			stmt.setString(3, user.getPassword());
			stmt.executeUpdate();
		}catch(SQLException e){
			ex=e;
		}finally{
			if(conn!=null){
				try{
					conn.close();
				}catch(SQLException e){
					if(ex==null){
						ex=e;
					}
				}
			}
		if(ex!=null){
			throw new RuntimeException(ex);
		}
		}
	}
	public void deleteUser(User user) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM User WHERE username=? and password=?");
			stmt.setString(1,user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.executeUpdate();
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		
	}
	
	
}
