package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}
	
}
