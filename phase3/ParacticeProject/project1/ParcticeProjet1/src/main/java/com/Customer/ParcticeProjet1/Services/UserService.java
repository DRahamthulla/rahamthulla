package com.Customer.ParcticeProjet1.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Customer.ParcticeProjet1.Bean.Users;
import com.Customer.ParcticeProjet1.Bean.Users;
import com.Customer.ParcticeProjet1.Repository.UserRespossitory;
import com.Customer.ParcticeProjet1.exceptions.UserNotFoundException;
@Service 
public class UserService {
	@Autowired
	private UserRespossitory userRepository;
	public Iterable<Users> GetAllUsers() {
	return userRepository.findAll();
	}
	public Users GetUserByName(String name) {
	return userRepository.findByName(name);
	}
	
	public Users GetUserById(Integer id) {
	Optional<Users> foundUser = userRepository.findById(id);
	if(!foundUser.isPresent()) throw new UserNotFoundException();
	return foundUser.get();
	}
	public Users UpdateUser(Users userToUpdate) {
	return userRepository.save(userToUpdate);
	}
}
