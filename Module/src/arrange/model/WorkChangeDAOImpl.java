package arrange.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
public class WorkChangeDAOImpl  implements WorkChangeDAO{
	private DataSource datasource;
	public WorkChangeDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	
	@Override
	public List<WorkChange> getWorkChanges(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<WorkChange> administrators=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM WorkChange WHERE userNO=? and date=?");
			stmt.setInt(1, administrator.getUserNO());
			stmt.setDate(2, administrator.getDate());
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<WorkChange>();
			while(rs.next()){
				administrator.setUserNO(rs.getInt("userNO"));
				administrator.setDate(rs.getDate("date"));
				administrator.setTime(rs.getTime("time"));
				administrator.setBeingLate(rs.getString("beingLate"));
				administrator.setChangeOff(rs.getString("changeOff"));
				administrator.setDayOff(rs.getString("dayOff"));
				administrator.setJoinPopularization(rs.getString("joinPopularization"));
				administrator.setWorkOverTime(rs.getString("workOverTime"));
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
	public void addWorkChange(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO WorkChange(userNO,date,time,dayOff,changeOff,workOverTime,joinPopularizaton,beingLate) VALUES(?,?,?,?,?,?,?,?)");
			stmt.setInt(1,administrator.getUserNO() );
			stmt.setDate(2, administrator.getDate());
			stmt.setTime(3,administrator.getTime());
			stmt.setString(4, administrator.getDayOff());
			stmt.setString(5, administrator.getChangeOff());
			stmt.setString(6,administrator.getWorkOverTime());
			stmt.setString(7, administrator.getJoinPopularization());
			stmt.setString(8, administrator.getBeingLate());
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
	public void updateWorkChange(WorkChange administrator){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn
					.prepareStatement("update WorkChange set password=? where name=? and password=?");
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
	public void deleteWorkChange(WorkChange administrator) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM WorkChange WHERE userNO=? and date=? and time=?");
			stmt.setInt(1,administrator.getUserNO());
			stmt.setDate(2, administrator.getDate());
			stmt.setTime(3, administrator.getTime() );
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
