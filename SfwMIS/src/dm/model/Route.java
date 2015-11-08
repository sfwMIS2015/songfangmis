package dm.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class Route  implements Serializable{
	String routeNO;
	Date date;
	Time time;
	String  domitary;
	String  route;
	String lastestDelivery;
	String boxSequence;
public Route(){
		
	}
public String getRouteNO() {
    return routeNO;
}
public Date getDate() {
    return date;
}
public Time getTime() {
    return time;
}
public String getDomitary() {
    return domitary;
}
public String  getRoute() {
    return route;
}
public String  getLastestDelivery() {
    return lastestDelivery;
}

public String  getBoxSequence() {
    return boxSequence;
}

public void setRouteNO(String  routeNO ) {
    this.routeNO= routeNO;
}

public void setDate(Date  date) {
    this.date= date;
}
public void setTime(Time  time) {
    this.time= time;
}

public void setDomitary(String   domitary) {
    this.domitary= domitary;
}
public void setRoute(String   route) {
    this.route= route;
}
public void setLastestDelivery(String   lastestDelivery) {
    this.lastestDelivery= lastestDelivery;
}
public void setBoxSequence(String   boxSequence) {
    this.boxSequence= boxSequence;
}


}
