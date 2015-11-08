package hrm.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.RoleAuthority;
public class RoleAuthorityDAOImpl {
	private DataSource datasource;
	public RoleAuthorityDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	public RoleAuthority getRoleAuthority(RoleAuthority roleAuthority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM RoleAuthority WHERE roleNO=?,authorityNO=?");
			stmt.setString(1,RoleAuthority.getRoleNO());
			stmt.setString(2,RoleAuthority.getAuthorityNO());
			
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				roleAuthority=new RoleAuthority();
				
				roleAuthority.setRoleNO(rs.getString("roleNO"));
				roleAuthority.setAuthorityNO(rs.getString("authorityNO"));
				roleAuthority.setKind(rs.getString("kind"));
			
			
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
		return roleAuthority;
	}

	public List<RoleAuthority> getRoleAuthoritys(RoleAuthority roleAuthority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<RoleAuthority> roleAuthoritys=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM RoleAuthority WHERE userNO=?,authorityNO=?");
			stmt.setString(1, RoleAuthority.getRoleNO());
			stmt.setString(2, RoleAuthority.getAuthorityNO());
			
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			roleAuthoritys=new ArrayList<RoleAuthority>();
			while(rs.next()){
				roleAuthority=new RoleAuthority();
				roleAuthority.setRoleNO(rs.getString("roleNO"));
				roleAuthority.setAuthorityNO(rs.getString("authorityNO"));
				roleAuthority.setKind(rs.getString("kind"));
				
				roleAuthoritys.add(roleAuthority);
			
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
		return roleAuthoritys;
	}

@SuppressWarnings("static-access")
public void addRoleAuthority(RoleAuthority roleAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("INSERT INTO RoleAuthority(roleNO,authorityNO,kind) VALUES(?,?,?)");
		stmt.setString(1, roleAuthority.getRoleNO());
		stmt.setString(2, roleAuthority.getAuthorityNO());
		stmt.setString(3, roleAuthority.getKind());
	
		
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

@SuppressWarnings("static-access")
public void updateRoleAuthority(RoleAuthority roleAuthority){
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt = conn.prepareStatement("update RoleAuthority set kind=?where roleNO=? ,authorityNO=?");
		stmt.setString(1, roleAuthority.getKind());
		stmt.setString(2,roleAuthority.getRoleNO());
		stmt.setString(3, roleAuthority.getAuthorityNO());

		
		
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

@SuppressWarnings("static-access")
public void deleteRoleAuthority(RoleAuthority roleAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("DELETE FROM RoleAuthority WHERE roleNO=? ,authorityNO=?");
		stmt.setString(1,roleAuthority.getRoleNO());
		stmt.setString(2,roleAuthority.getAuthorityNO());
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
}}
		

















