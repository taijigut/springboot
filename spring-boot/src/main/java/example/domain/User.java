package example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue
	private String key;
	
	@NotNull
	private String id;
	
	public User(String id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@NotNull
	private String password;
	
	@NotNull
	private String email;
	
	@UpdateTimestamp
	private Date lstLoginDate;
}
