package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.User;
import com.nt.repo.UserRepo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public Integer saveUser(User user) {
		return repo.save(user).getId();
	}

}
