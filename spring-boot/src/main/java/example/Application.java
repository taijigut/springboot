package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.domain.Role;
import example.domain.User;
import example.repository.RoleRepository;
import example.repository.UserRepository;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        UserRepository userRepository = ctx.getBean(UserRepository.class);
        RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
        
        System.out.println(userRepository.count());
        
        Role role = new Role("Admin", "system");
        role = roleRepository.save(role);
        
        for (int i = 0; i < 5; i++) {
			User user = new User("userid"+i, "password", "user"+i+"@naver.com");
			user.setRole(role);
        	userRepository.save(user); 
		}
        System.out.println(userRepository.count());
        
    }

}
