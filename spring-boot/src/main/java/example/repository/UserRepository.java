package example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
