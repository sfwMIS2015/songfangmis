package hrm.model;

import java.io.Serializable;

public class UserRole  implements Serializable{
	static String userNO;
	static String roleNO;
	public UserRole() {
	}
	public static String getUserNO() {
	    return userNO;
	}
	public static String getRoleNO() {
	    return roleNO;
	}
	public void setUserNO(String  userNO ) {
	    this.userNO= userNO;
	}
	
	public void setRoleNO(String roleNO ) {
	    this.roleNO= roleNO;
	}
}
