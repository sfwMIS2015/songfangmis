package dm.model;

import java.util.List;

import dm.model.Route;


public interface RouteDAO {
	void addRoute(Route route);
	Route getRoute(Route route);
	void updateRoute(Route route);
	void deleteRoute(Route route);
	List<Route> getRoutes(Route route);

}