package hrm.model;

import java.io.Serializable;
import java.sql.Date;

public class Role implements Serializable{
	String roleNO;
	String roleName;
	Date Createtime;
	String roleDescription;
public Role() {
}
public String getRoleNO() {
    return roleNO;
}


public String getRoleName() {
    return roleName;
}
public Date getCreatetime() {
    return Createtime;
}
public String getRoleDescription() {
    return roleDescription;
}

public void setRoleNO(String roleNO ) {
    this.roleNO= roleNO;
}




public void setRoleName(String  roleName ) {
    this.roleName= roleName;
}

public void setCreatetime(Date Createtime) {
    this.Createtime = Createtime;
}

public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
}



}
