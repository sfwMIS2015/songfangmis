package hrm.model;

import java.util.List;


public interface AuthorityDAO {
	void addAuthority(Authority authority);
	Authority getAuthority(Authority authority);
	void updateAuthority(Authority authority);
	void deleteAuthority(Authority authority);
	List<Authority> getAuthoritys(Authority authority);

}