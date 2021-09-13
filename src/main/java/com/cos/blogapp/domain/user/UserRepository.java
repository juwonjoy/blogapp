package com.cos.blogapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;


//DAO
//@Repository  내부적으로 부모한테 걸려있음 
public interface UserRepository extends JpaRepository<User, Integer>{


	 
}
