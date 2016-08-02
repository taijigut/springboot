package example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import example.domain.User;
import example.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<User> getUsers() throws Exception  {
		return this.userService.getUsers();
	}
	
	@RequestMapping(path="/search", method=RequestMethod.GET)
	@ResponseBody
	public User getUser(@RequestParam("userid") String userId) throws Exception {
		return this.userService.getUser(userId);
	}
	
	@RequestMapping(path="/error", method=RequestMethod.GET)
	@ResponseBody
	public User throwsException() throws Exception {
		throw new Exception("exception handler test");
	}
}
