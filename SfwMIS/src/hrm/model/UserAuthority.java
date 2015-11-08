package hrm.model;

import java.io.Serializable;

public final class UserAuthority implements Serializable{
	String userNO;
	String authorityNO;
	String kind;


public UserAuthority() {
}
public String getUserNO() {
    return userNO;
}

public String getAuthorityNO() {
    return authorityNO;
}
public String getKind() {
    return kind;
}
public void setUserNO(String  userNO ) {
    this.userNO= userNO;
}
public void setAuthorityNO(String  authorityNO ) {
    this.authorityNO= authorityNO;
}
public void setKind(String  kind ) {
    this.kind= kind;
}


}