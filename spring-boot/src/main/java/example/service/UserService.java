package example.service;

import java.util.List;

import example.domain.User;


public interface UserService {

	List<User> getUsers() throws Exception ;
	
	User getUser(String userId) throws Exception ;
}
