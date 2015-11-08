package arrange.model;
import java.io.Serializable;
import java.sql.Date;
public class WorkArrange implements Serializable{
	private String workTime;
	private String shift;
	private int Id;
	private int workNO;
	private int userNO;
	private Date date;
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getWorkNO() {
		return workNO;
	}
	public void setWorkNO(int workNO) {
		this.workNO = workNO;
	}
	public int getUserNO() {
		return userNO;
	}
	public void setUserNO(int userNO) {
		this.userNO = userNO;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
