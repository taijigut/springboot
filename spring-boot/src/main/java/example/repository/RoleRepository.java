package example.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import example.domain.Role;

@RepositoryRestResource(collectionResourceRel="role", path = "roles")
public interface RoleRepository extends PagingAndSortingRepository<Role, String>{
	
	@RestResource(path="rolename")
	List<Role> findByRoleName(@Param("roleName")String roleName);
	
	@RestResource(path="userid")
	List<Role> findByUsersId(@Param("userid") String userId);
	
}
