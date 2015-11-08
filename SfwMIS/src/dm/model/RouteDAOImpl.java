package dm.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import hrm.model.Role;

public class RouteDAOImpl {
	private DataSource datasource;
	public RouteDAOImpl(DataSource datasource){
		this.datasource=datasource;
}
	public Route getRoute(Route route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{                                         // and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Route WHERE routeNO=?");
			stmt.setString(1,route.getRouteNO());
			//stmt.setString(2, administrator.getPassword());
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				route=new Route();
				
				route.setRouteNO(rs.getString("routeNO"));
				route.setDate(rs.getDate("date"));
				route.setTime(rs.getTime("time"));
				route.setDomitary(rs.getString("domitary"));
				route.setRoute(rs.getString("route"));
				route.setLastestDelivery(rs.getString("lastestDelivery"));
				route.setBoxSequence(rs.getString("boxSequence"));
				
			
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
		return route;
	}
	
	public List<Route> getRoutes(Route route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Route> routes=null;
		
		try{												 //and password=?
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT * FROM Route WHERE RouteNO=?");
			stmt.setString(1, route.getRouteNO());
			//stmt.setString(2, customer.getPassword());
			ResultSet rs=stmt.executeQuery();
			routes=new ArrayList<Route>();
			while(rs.next()){
				route=new Route();
				route.setRouteNO(rs.getString("routeNO"));
				route.setDate(rs.getDate("date"));
				route.setTime(rs.getTime("time"));
				route.setDomitary(rs.getString("domitary"));
				route.setRoute(rs.getString("route"));
				route.setLastestDelivery(rs.getString("lastestDelivery"));
				route.setBoxSequence(rs.getString("boxSequence"));
				routes.add(route);
			
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
		return routes;
	}
	public void addRoute(Route  route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("INSERT INTO Route(routeNO,date,time,domitary,route,lastestDelivery,boxSequence) VALUES(?,?,?,?)");
			stmt.setString(1, route.getRouteNO());
			stmt.setDate(2, route.getDate());
			stmt.setTime(3, route.getTime());
			stmt.setString(4, route.getDomitary());
			stmt.setString(5, route.getRoute());
			stmt.setString(6, route.getLastestDelivery());
			stmt.setString(7, route.getBoxSequence());
		
			
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
	public void updateRoute(Route route){
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt = conn.prepareStatement("update Route set date=?,time=?,domitary=?,route=?,lastestDelivery=?,boxSequence=? where roleNO=? ");
			
			stmt.setDate(1, route.getDate());
			stmt.setTime(2, route.getTime());
			stmt.setString(3, route.getDomitary());
			stmt.setString(4, route.getRoute());
			stmt.setString(5, route.getLastestDelivery());
			stmt.setString(6, route.getBoxSequence());
			stmt.setString(7, route.getRouteNO());
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
	
	public void deleteRoute(Route route) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("DELETE FROM Route WHERE routeNO=? ");
			stmt.setString(1,route.getRouteNO());
			
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