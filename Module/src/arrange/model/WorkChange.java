package arrange.model;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;
public class WorkChange implements Serializable{
	private String dayOff;
	private String changeOff;
	private int Id;
	private int changeNO;
	private int userNO;
	private Date date;
	private Time time;
	private String workOverTime;
	private String joinPopularization;
	private String beingLate;
	
	public String getDayOff() {
		return dayOff;
	}
	public void setDayOff(String dayOff) {
		this.dayOff = dayOff;
	}
	public String getChangeOff() {
		return changeOff;
	}
	public void setChangeOff(String changeOff) {
		this.changeOff = changeOff;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getChangeNO() {
		return changeNO;
	}
	public void setChangeNO(int changeNO) {
		this.changeNO = changeNO;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUserNO() {
		return userNO;
	}
	public void setUserNO(int userNO) {
		this.userNO = userNO;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getWorkOverTime() {
		return workOverTime;
	}
	public void setWorkOverTime(String workOverTime) {
		this.workOverTime = workOverTime;
	}
	public String getJoinPopularization() {
		return joinPopularization;
	}
	public void setJoinPopularization(String joinPopularization) {
		this.joinPopularization = joinPopularization;
	}
	public String getBeingLate() {
		return beingLate;
	}
	public void setBeingLate(String beingLate) {
		this.beingLate = beingLate;
	}
	
}
