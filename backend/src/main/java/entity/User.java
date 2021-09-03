package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="User")
@Data
@NoArgsConstructor
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId", nullable=false)
	private long userId;
	
	@Column(name="userName", nullable=false)
	private String userName;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="phoneNumber", nullable=true)
	private String phoneNumber;
	
	@Column(name="userType", nullable=false)
	private String userType;
	
	@Column(name="interest", nullable=true)
	private String interest;
	
	@OneToMany(mappedBy="user")
	List<PollEntity> polls; 
}

/**
 * 1, User Id
2. UserName
3.Email
4.Phone Number
5.User Type
6.Interest.

 */