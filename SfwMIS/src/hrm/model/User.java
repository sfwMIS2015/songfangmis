package hrm.model;

import java.io.Serializable;

public class User implements Serializable{
	String userNO;
	String username;
	String password;
	String newpassword;
	String phone;
	String mail;
	String hobbies;
	String position;
	String state;
	String sparetime;
public User(){
		
	}
public String getUserNO() {
    return userNO;
}


public String getUsername() {
    return username;
}
public String getMail() {
    return mail;
}
public String getPassword() {
    return password;
}
public String getNewPassword() {
    return newpassword;
}
public String getPhone() {
    return phone;
}
public String getHobbies() {
    return hobbies;
}
public String getPosition() {
    return position;
}
public String getState() {
    return state;
}
public String getSparetime() {
    return sparetime;
}


public void setUserNO(String  userNO ) {
    this.userNO= userNO;
}




public void setUsername(String  username ) {
    this.username= username;
}

public void setMail(String mail) {
    this.mail = mail;
}

public void setPassword(String psw) {
    this.password = psw;
}
public void setNewPassword(String npsw) {
    this.newpassword = npsw;
}

public void setPhone(String  phone ) {
    this.phone= phone;
}

public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
}
public void setPosition(String position) {
    this.position = position;
}



public void setState(String state) {
    this.state = state;
}
public void setSparetime(String sparetime) {
    this.sparetime = sparetime;
}


}
