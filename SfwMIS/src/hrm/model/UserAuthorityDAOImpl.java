package hrm.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.UserAuthority;
public class UserAuthorityDAOImpl {
	private DataSource datasource;
	public UserAuthorityDAOImpl(DataSource datasource){
		this.datasource=datasource;
}

public UserAuthority getUserAuthority(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	
	try{                                         // and password=?
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("SELECT * FROM UserAuthority WHERE userNO=?,authorityNO=?");
		stmt.setString(1,userAuthority.getUserNO());
		stmt.setString(2,userAuthority.getAuthorityNO());
		//stmt.setString(2, administrator.getPassword());
		ResultSet rs=stmt.executeQuery();
		while(rs.next()){
			userAuthority=new UserAuthority();
			userAuthority.setUserNO(rs.getString("userNO"));
			userAuthority.setAuthorityNO(rs.getString("authorityNO"));
			userAuthority.setKind(rs.getString("kind"));
		
		
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
	return userAuthority;
}

public List<UserAuthority> getUserAuthoritys(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	List<UserAuthority> userAuthoritys=null;
	
	try{												 //and password=?
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("SELECT * FROM UserAuthority WHERE userNO=?,authorityNO=?");
		stmt.setString(1, userAuthority.getUserNO());
		stmt.setString(2, userAuthority.getAuthorityNO());
		
		//stmt.setString(2, customer.getPassword());
		ResultSet rs=stmt.executeQuery();
		userAuthoritys=new ArrayList<UserAuthority>();
		while(rs.next()){
			userAuthority=new UserAuthority();
			userAuthority.setUserNO(rs.getString("userNO"));
			userAuthority.setAuthorityNO(rs.getString("authorityNO"));
			userAuthority.setKind(rs.getString("kind"));
			
			userAuthoritys.add(userAuthority);
		
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
	return userAuthoritys;
}
public void addUserAuthority(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("INSERT INTO UserAuthority(userNO,authorityNO,kind) VALUES(?,?,?)");
		stmt.setString(1, userAuthority.getUserNO());
		stmt.setString(2, userAuthority.getAuthorityNO());
		stmt.setString(3, userAuthority.getKind());
	
		
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
public void updateUserAuthority(UserAuthority userAuthority){
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt = conn.prepareStatement("update UserAuthority set kind=?where userNO=? ,authorityNO=?");
		stmt.setString(1, userAuthority.getKind());
		stmt.setString(2, userAuthority.getUserNO());
		stmt.setString(3, userAuthority.getAuthorityNO());

		
		
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

public void deleteUserAuthority(UserAuthority userAuthority) {
	Connection conn=null;
	PreparedStatement stmt=null;
	SQLException ex=null;
	try{
		conn=datasource.getConnection();
		stmt=conn.prepareStatement("DELETE FROM UserAuthority WHERE userNO=? ,authorityNO=?");
		stmt.setString(1,userAuthority.getUserNO());
		stmt.setString(2,userAuthority.getAuthorityNO());
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
