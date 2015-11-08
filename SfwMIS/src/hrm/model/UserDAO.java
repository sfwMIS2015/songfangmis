package hrm.model;
import java.util.List;


public interface  UserDAO {
	void addUser(User user);
	User getUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	List<User> getUsers(User user);

}
