package hrm.model;

import java.util.List;


public interface UserRoleDAO {
	void addUserRole(UserRole userRole);
	UserRole getUserRole(UserRole userRole);
	void updateUserRole(UserRole userRole);
	void deleteUserRole(UserRole userRole);
	List<UserRole> getUserRoles(UserRole userRole);

}