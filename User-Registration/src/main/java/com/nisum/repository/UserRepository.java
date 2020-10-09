package com.nisum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nisum.model.User;
@Repository(value="userRepository")
public interface UserRepository extends CrudRepository<User,Integer>{
	
	User findByEmail(String email);
    User findByConfirmationToken(String confirmationToken);

}
