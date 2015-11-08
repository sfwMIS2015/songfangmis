package hrm.model;

import java.util.List;


public interface UserAuthorityDAO {
	void addUserAuthority(UserAuthority userAuthority);
	UserAuthority getUserAuthority(UserAuthority userAuthority);
	void updateUserAuthority(UserAuthority userAuthority);
	void deleteUserAuthority(UserAuthority userAuthority);
	List<UserAuthority> getUserAuthoritys(UserAuthority userAuthority);

}