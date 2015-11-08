package hrm.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.UserRole;
public class UserRoleDAOImpl {

	private DataSource datasource;
	public UserRoleDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	
	
	public UserRole getUserRole(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM UserRole WHERE userNO=?,roleNO=?");
			stmt.setString(1,UserRole.getUserNO());
			stmt.setString(2,UserRole.getRoleNO());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				userRole=new UserRole();
				userRole.setRoleNO(rs.getString("roleNO"));
				userRole.setUserNO(rs.getString("userNO"));
		
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
		return userRole;
	}
	
	public List<UserRole> getUserRoles(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<UserRole> userRoles=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM UserAuthority WHERE userNO=?,roleNO=?");
			stmt.setString(1, userRole.getUserNO());
			stmt.setString(2,userRole.getRoleNO());
			
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			userRoles=new ArrayList<UserRole>();
			while(rs.next()){
				userRole=new UserRole();
				userRole.setUserNO(rs.getString("userNO"));
				userRole.setRoleNO(rs.getString("roleNO"));
				userRoles.add(userRole);
			
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
		return userRoles;
	}
	
	public void addUserRole(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO UserRole(userNO,authorityNO) VALUES(?,?)");
			stmt.setString(1, userRole.getUserNO());
			stmt.setString(2, userRole.getRoleNO());
		
		
			
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
	
	public void updateUserRole(UserRole userRole){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update UserRole set where userNO=? ,roleNO=?");
		
			stmt.setString(2, userRole.getUserNO());
			stmt.setString(3, userRole.getRoleNO());

			
			
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

	public void deleteUserRole(UserRole userRole) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM UserRole WHERE userNO=? ,roleNO=?");
			stmt.setString(1,userRole.getUserNO());
			stmt.setString(2,userRole.getRoleNO());
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
