package com.nisum.service;

import org.springframework.stereotype.Service;

import com.nisum.model.User;
import com.nisum.repository.UserRepository;

@Service("userService")
public class UserService {
	private UserRepository userRepository;
	
public UserService(UserRepository userRepository) {
	this.userRepository=userRepository;
}
public User findByEmail(String email){
	return userRepository.findByEmail(email);
	
}
public User findByConfirmationToken(String confirmationToken) {
	return userRepository.findByConfirmationToken(confirmationToken);
}
public void saveUser(User user) {
	userRepository.save(user);
	
}
}
