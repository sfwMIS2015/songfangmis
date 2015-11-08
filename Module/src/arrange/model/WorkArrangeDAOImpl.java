package arrange.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class WorkArrangeDAOImpl  implements WorkArrangeDAO{
	private DataSource datasource;
	public WorkArrangeDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	
	@Override
	public List<WorkArrange> getWorkArranges(WorkArrange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkArrange> administrators=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkArrange WHERE userNO=? and date=?");
			stmt.setInt(1, administrator.getUserNO());
			stmt.setDate(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkArrange>();
			while(rs.next()){
				administrator.setUserNO(rs.getInt("userNO"));
				administrator.setDate(rs.getDate("date"));
				administrator.setWorkTime(rs.getString("workTime"));
				administrator.setShift(rs.getString("shift"));
				administrators.add(administrator);
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
		return administrators;
	}
	@Override
	public void addWorkArrange(WorkArrange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO WorkArrange(userNO,workTime,date,shift) VALUES(?,?,?,?)");
			stmt.setInt(1,administrator.getUserNO() );
			stmt.setString(2, administrator.getWorkTime());
			stmt.setDate(3, administrator.getDate());
			stmt.setString(4, administrator.getShift());

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
	
	/*@Override
	public void updateWorkArrange(WorkArrange administrator){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn
					.prepareStatement("update WorkArrange set date=?,shift=? where name=? and password=?");
			stmt.setString(1, administrator.getNewPassword());
			stmt.setString(2, administrator.getName());
			stmt.setString(3, administrator.getPassword());
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
	}*/
	
	@Override
	public void deleteWorkArrange(WorkArrange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM WorkArrange WHERE userNO=? and date=? and shift=?");
			stmt.setInt(1,administrator.getUserNO());
			stmt.setDate(2, administrator.getDate());
			stmt.setString(3, administrator.getShift() );
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
