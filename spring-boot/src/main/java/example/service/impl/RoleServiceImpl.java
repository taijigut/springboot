package example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.domain.Role;
import example.repository.RoleRepository;
import example.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Role> getRoles() {
		return (List<Role>) this.roleRepository.findAll();
	}

	@Override
	public Role getRole(String userId) {
		return this.roleRepository.findOne(userId);
	}

}
