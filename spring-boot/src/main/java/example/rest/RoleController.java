package example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import example.domain.Role;
import example.service.RoleService;

@RestController
@RequestMapping("roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Role> getRoles() {
		return this.roleService.getRoles();
	}
}
