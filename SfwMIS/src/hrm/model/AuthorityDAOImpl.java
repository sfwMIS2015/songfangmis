package hrm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import hrm.model.Authority;
public class AuthorityDAOImpl {
	private DataSource datasource;
	public AuthorityDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	public Authority getAuthority(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Authority WHERE  authorityName=?");
			stmt.setString(1,authority.getAuthorityName());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				authority=new Authority();
				
				authority.setAuthorityNO(rs.getString("authorityNO"));
				authority.setAuthorityName(rs.getString("authorityName"));
				
				authority.setAuthorityDescription(rs.getString("authorityDescription"));
			
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
		return authority;
	}
	public List<Authority> getAuthoritys(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Authority> authoritys=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Authority WHERE AuthorityName=?");
			stmt.setString(1, authority.getAuthorityName());
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			authoritys=new ArrayList<Authority>();
			while(rs.next()){
				authority=new Authority();
				authority.setAuthorityNO(rs.getString("authorityNO"));
				authority.setAuthorityName(rs.getString("authorityName"));
				
				authority.setAuthorityDescription(rs.getString("authorityDescription"));
			authoritys.add(authority);
			
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
		return authoritys;
	}
	public void addAuthority(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Authority(authorityNO,authorityName,authorityDescription) VALUES(?,?,?)");
			stmt.setString(1, authority.getAuthorityNO());
			stmt.setString(2, authority.getAuthorityName());
		
			stmt.setString(4, authority.getAuthorityDescription());
			
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
	public void updateAuthority(Authority authority){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Authority set authorityNO=?,authorityDescription=? where authorityName=? ");
			
			stmt.setString(1, authority.getAuthorityNO());
		

			stmt.setString(2, authority.getAuthorityDescription());
			stmt.setString(3, authority.getAuthorityName());
			
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
	
	public void deleteAuthority(Authority authority) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Authority WHERE authorityName=? ");
			stmt.setString(1,authority.getAuthorityName());
			
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
	
	
	
	
	
	
	
	
	
	
	