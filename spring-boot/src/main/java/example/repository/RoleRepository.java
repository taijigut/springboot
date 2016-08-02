package example.repository;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.JpaRepository;

import example.domain.Role;

@Resource
public interface RoleRepository extends JpaRepository<Role, String>{

}
