package com.app.finder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.finder.Entity.Users;

public interface UserRepo extends JpaRepository<Users, Long>{

}
