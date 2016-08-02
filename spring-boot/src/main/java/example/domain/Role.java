package example.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getRegUserId() {
		return regUserId;
	}

	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
	}

	public String getUpdUserId() {
		return updUserId;
	}

	public void setUpdUserId(String updUserId) {
		this.updUserId = updUserId;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Id
	@GeneratedValue
	private String id;
	
	private String roleName;
	
	private Date regDate;
	
	public Role(String roleName, String userId) {
		super();
//		Calendar cal = Calendar.getInstance();
		Date date = Calendar.getInstance(Locale.UK).getTime();
		this.roleName = roleName;
		this.regDate = date;
		this.updDate = date;
		this.regUserId = userId;
		this.updUserId = userId;
	}
	
	public Role(String id, String roleName, String userId) {
		super();
		Date date = Calendar.getInstance(Locale.UK).getTime();
		this.id = id;
		this.roleName = roleName;
		this.updDate = date;
		this.updUserId = userId;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", regDate=" + regDate + ", updDate=" + updDate
				+ ", regUserId=" + regUserId + ", updUserId=" + updUserId + ", users=" + users + "]";
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Date updDate;
	private String regUserId;
	private String updUserId;
	
	@OneToMany(mappedBy="role")
	private List<User> users;
}
