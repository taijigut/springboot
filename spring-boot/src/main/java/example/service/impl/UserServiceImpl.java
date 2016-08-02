package example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.domain.User;
import example.repository.UserRepository;
import example.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUsers() throws Exception  {
		return (List<User>) this.userRepository.findAll();
	}

	@Override
	public User getUser(String userId) throws Exception  {
		return this.userRepository.findOne(userId);
	}

}
