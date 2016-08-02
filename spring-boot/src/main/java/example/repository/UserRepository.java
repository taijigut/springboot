package example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.annotation.Secured;

import example.domain.User;

@Secured("ROLE_USER")
@RepositoryRestResource(collectionResourceRel="user", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, String>{

	@Override
	@Secured("ROLE_ADMIN")
	public void delete(Iterable<? extends User> arg0);
}
