package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.domain.User;
import example.repository.UserRepository;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        UserRepository userRepository = ctx.getBean(UserRepository.class);
        
        System.out.println(userRepository.count());
        for (int i = 0; i < 5; i++) {
			User user = new User("userid"+i, "password", "user"+i+"@naver.com");
        	userRepository.save(user); 
		}
        System.out.println(userRepository.count());
        
    }

}
