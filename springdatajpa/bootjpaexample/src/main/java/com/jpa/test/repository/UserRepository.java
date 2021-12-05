package com.jpa.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.test.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	public List<User> findByCity(String city);
	
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	
	
	//this is called a JPQL Query
	@Query("select u From User u WHERE u.name= :n")//1 space after param and don't give spaces after colon
	public List<User> getUserByName(@Param("n") String name);
	
	
	//this is called a native query
	@Query(value="select * from user", nativeQuery= true)
	public List<User> getUsers();
	
	
	
	
	
	

}
