package com.example.backend.entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	List<PollEntity> polls; 
}
