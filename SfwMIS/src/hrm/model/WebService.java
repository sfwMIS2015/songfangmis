package hrm.model;
import java.util.*;








public class WebService {
	private UserDAO userDAO;
	private RoleDAO roleDAO;
	private UserRoleDAO userRoleDAO;
	private RoleAuthorityDAO roleAuthorityDAO;
	private AuthorityDAO authorityDAO;
	private UserAuthorityDAO userAuthorityDAO;
	
	

public WebService(String USERS,UserDAO userDAO,RoleDAO   roleDAO,UserRoleDAO userRoleDAO,RoleAuthorityDAO roleAuthorityDAO,AuthorityDAO authorityDAO,UserAuthorityDAO userAuthorityDAO) {
    this(userDAO,roleDAO,userRoleDAO,roleAuthorityDAO,authorityDAO,userAuthorityDAO);
}
public WebService(UserDAO userDAO,RoleDAO roleDAO,UserRoleDAO userRoleDAO,RoleAuthorityDAO roleAuthorityDAO,AuthorityDAO authorityDAO,UserAuthorityDAO userAuthorityDAO){
	this.userDAO=userDAO;
	this.roleDAO=roleDAO;
	this.userRoleDAO=userRoleDAO;
	this.roleAuthorityDAO=roleAuthorityDAO;
	this.authorityDAO=authorityDAO;
	this.userAuthorityDAO=userAuthorityDAO;}
	
	 public boolean isUserExisted(User user) {
	    	User storedAcct=userDAO.getUser(user);
			return storedAcct!=null;
	    }
	 public boolean checkLogin(User user){
			if(user.getUsername()!=null && user.getPassword()!=null){
				User storedAcct=userDAO.getUser(user);
				return storedAcct!=null && storedAcct.getPassword().equals(user.getPassword());
			}
			return false;
		}	
	 
	 public boolean isGetPasswordOK(User user){
			if(user.getUsername()!=null && user.getMail()!=null){
				User storedAcct=userDAO.getUser(user);
				return storedAcct!=null && storedAcct.getMail().equals(user.getMail());
			}
			return false;
		}
	 
	 public User getUser(User user) {
			
			return userDAO.getUser(user);
		}
	 public List<User> getUsers(User user){
			return userDAO.getUsers(user);
		}
	 
	 
	 public void addUser(User  user){
			userDAO.addUser(user);
		}
		
		public void updateUser(User user) {
			userDAO.updateUser(user);
		}
		public void deleteUser(User user){
			userDAO.deleteUser(user);
		}
	 
       public Role getRole(Role role) {
  			
			return roleDAO.getRole(role);
		}
	 public List<Role> getRoles(Role role){
			return roleDAO.getRoles(role);
		}
	 
	 
	 public void addRole(Role  role){
		 roleDAO.addRole(role);
		}
		
		public void updateRole(Role role) {
			roleDAO.updateRole(role);
		}
		public void deleteRole(Role role){
			roleDAO.deleteRole(role);
		}
	 
public Authority getAuthority(Authority authority) {
  			
			return authorityDAO.getAuthority(authority);
		}
	 public List<Authority> getAuthoritys(Authority authority){
			return authorityDAO.getAuthoritys(authority);
		}
	 
	 
	 public void addAuthority(Authority  authority){
		 authorityDAO.addAuthority(authority);
		}
		
		public void updateAuthority(Authority authority) {
			authorityDAO.updateAuthority(authority);
		}
		public void deleteAuthority(Authority authority){
			authorityDAO.deleteAuthority(authority);
		}
	 
		
     public UserRole getUserRole(UserRole userRole) {
			
			return userRoleDAO.getUserRole(userRole);
		}
	 public List<UserRole> getUserRoles(UserRole userRole){
			return userRoleDAO.getUserRoles(userRole);
		}
	 
	 
	 public void addUserRole(UserRole  userRole){
		 userRoleDAO.addUserRole(userRole);
		}
		
		public void updateUserRole(UserRole userRole) {
			userRoleDAO.updateUserRole(userRole);
		}
		public void deleteUserRole(UserRole userRole){
			userRoleDAO.deleteUserRole(userRole);
		}
		
		
		 public UserAuthority getUserAuthority(UserAuthority userAuthority) {
				
				return userAuthorityDAO.getUserAuthority(userAuthority);
			}
		 public List<UserAuthority> getUserAuthoritys(UserAuthority userAuthority){
				return userAuthorityDAO.getUserAuthoritys(userAuthority);
			}
		 
		 
		 public void addUserAuthority(UserAuthority userAuthority){
			 userAuthorityDAO.addUserAuthority(userAuthority);
			}
			
			public void updateUserAuthority(UserAuthority userAuthority) {
				userAuthorityDAO.updateUserAuthority(userAuthority);
			}
			public void deleteUserAuthority(UserAuthority userAuthority){
				userAuthorityDAO.deleteUserAuthority(userAuthority);
			}
		
		
			
			 public RoleAuthority getRoleAuthority(RoleAuthority roleAuthority) {
		  			
					return roleAuthorityDAO.getRoleAuthority(roleAuthority);
				}
			 public List<Role> getRoleAuthoritys(RoleAuthority roleAuthority){
					return roleAuthorityDAO.getRoleAuthoritys(roleAuthority);
				}
			 
			 
			 public void addRole(RoleAuthority  role){
				 roleAuthorityDAO.addRoleAuthority(role);
				}
				
				public void updateRoleAuthority(RoleAuthority roleAuthority) {
					roleAuthorityDAO.updateRoleAuthority(roleAuthority);
				}
				public void deleteRoleAuthority(RoleAuthority roleAuthority){
					roleAuthorityDAO.deleteRoleAuthority(roleAuthority);
				}
			 	
			
		
		
		
		
		
		
		
	 
}