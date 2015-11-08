package dm.model;
import java.util.*;

import hrm.model.User;

public class WebService {
	private RouteDAO routeDAO;
	public WebService(String USER,RouteDAO routeDAO){
		 this(routeDAO);
		 }
	
	public WebService(RouteDAO routeDAO){
		this.routeDAO=routeDAO;
	}
	
	 public Route getRoute(Route route) {
			
			return routeDAO.getRoute(route);
		}
	 public List<Route> getRoutes(Route route){
			return routeDAO.getRoutes(route);
		}
	 
	 
	 public void addRoute(Route  route){
		 routeDAO.addRoute(route);
		}
		
		public void updateRoute(Route route) {
			routeDAO.updateRoute(route);
		}
		public void deleteRoute(Route route){
			routeDAO.deleteRoute(route);
		}
	 
	
	
	
	
	
}
