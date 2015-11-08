package hrm.model;

import java.io.Serializable;

public class RoleAuthority implements Serializable {
	static String roleNO;
	static String authorityNO;
	String kind;
	public RoleAuthority() {
	}
	public static String getRoleNO() {
	    return roleNO;
	}
	
	public static String getAuthorityNO() {
	    return authorityNO;
	}
	public String getKind() {
	    return kind;
	}
	
	public void setRoleNO(String roleNO ) {
	    this.roleNO= roleNO;
	}

	public void setAuthorityNO(String  authorityNO ) {
	    this.authorityNO= authorityNO;
	}
	public void setKind(String  kind ) {
	    this.kind= kind;
	}
	
}
