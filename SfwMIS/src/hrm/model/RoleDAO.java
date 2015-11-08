package hrm.model;

import java.util.List;


public interface RoleDAO {
	void addRole(Role role);
	Role getRole(Role role);
	void updateRole(Role role);
	void deleteRole(Role role);
	List<Role> getRoles(Role role);

}