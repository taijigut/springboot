package example.service;

import java.util.List;

import example.domain.Role;


public interface RoleService {

	List<Role> getRoles();
	
	Role getRole(String userId);
	
}
