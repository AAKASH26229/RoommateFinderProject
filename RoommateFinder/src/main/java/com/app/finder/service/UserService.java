package com.app.finder.service;

import java.util.List;

import com.app.finder.Entity.Users;

public interface UserService {

	//Create new user
	public Users createUsers(Users user);
	// Get single user details 
	public Users getUserDetails(Long UserId);
	// Update user details
	public Users updateUserDetails(Long UserId);
	// Delete User 
	public void deleteUser(Long UserId);
	public List<Users> getallUsers();
	
}
