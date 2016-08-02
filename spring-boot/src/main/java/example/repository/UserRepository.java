package example.repository;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.JpaRepository;

import example.domain.User;

@Resource
public interface UserRepository extends JpaRepository<User, String>{

}
