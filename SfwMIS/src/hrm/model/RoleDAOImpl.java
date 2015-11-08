package hrm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import hrm.model.Role;
public class RoleDAOImpl {
	private DataSource datasource;
	public RoleDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	public Role getRole(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Role WHERE roleName=?");
			stmt.setString(1,role.getRoleName());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				role=new Role();
				
				role.setRoleNO(rs.getString("roleNO"));
				role.setRoleName(rs.getString("roleName"));
				role.setCreatetime(rs.getDate("createtime"));
				role.setRoleDescription(rs.getString("roleDescription"));
			
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
		return role;
	}
	
	public List<Role> getRoles(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Role> roles=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Role WHERE RoleName=?");
			stmt.setString(1, role.getRoleName());
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			roles=new ArrayList<Role>();
			while(rs.next()){
				role=new Role();
				role.setRoleNO(rs.getString("roleNO"));
				role.setRoleName(rs.getString("roleName"));
				role.setCreatetime(rs.getDate("createtime"));
				role.setRoleDescription(rs.getString("roleDescription"));
				roles.add(role);
			
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
		return roles;
	}
	
	public void addRole(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Role(roleNO,roleName,createtime,roleDescription) VALUES(?,?,?,?)");
			stmt.setString(1, role.getRoleNO());
			stmt.setString(2, role.getRoleName());
			stmt.setDate(3, role.getCreatetime());
			stmt.setString(4, role.getRoleDescription());
			
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
	
	public void updateRole(Role role){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Role set roleNO=?,createtime=?,roleDescription=? where roleName=? ");
			
			stmt.setString(1, role.getRoleNO());
			stmt.setDate(2, role.getCreatetime());

			stmt.setString(3, role.getRoleDescription());
			stmt.setString(4, role.getRoleName());
			
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
	public void deleteRole(Role role) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Role WHERE roleName=? ");
			stmt.setString(1,role.getRoleName());
			
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
