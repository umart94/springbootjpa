package com.jpa.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.entities.User;
import com.jpa.test.repository.UserRepository;

@SpringBootApplication(scanBasePackages = {"com.jpa.test"})
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
//		User user1 = new User();
//		user1.setName("Muhammad Umar Tariq");
//		user1.setCity("Karachi");
//		user1.setStatus("I am a java programmer");
//		
//		//saving a single user
//		User user1fromDatabase = userRepository.save(user1);
//		System.out.println(user1fromDatabase);
//		
//		
//		User user2 = new User();
//		user2.setName("Muhammad Umar Tariq");
//		user2.setCity("Karachi");
//		user2.setStatus("I am a java programmer");
//		
//		User user3 = new User();
//		user3.setName("Muhammad Umar Tariq");
//		user3.setCity("Karachi");
//		user3.setStatus("I am a java programmer");
//		
//		//saving multiple users together
//		//List.of(user2,user3);    //These methods were introduced in Java SE 9
//		
//		List<User> usersList = new ArrayList<>();
//		usersList.add(user2);
//		usersList.add(user3);
//		//save multiple users from a list of users
//		Iterable<User> result = userRepository.saveAll(usersList);
//		
//		result.forEach(user ->{
//			System.out.println(user);
//		});
//		
		
		
		
		
		//update user of id 5
//		Optional<User> optionalUser = userRepository.findById(5);
//		User optionalUserFromDatabase = optionalUser.get();
//		
//		optionalUserFromDatabase.setCity("Islamabad");
//		optionalUserFromDatabase.setName("bilal");
//		
//		User resultUpdatedUser = userRepository.save(optionalUserFromDatabase);
//		System.out.println(resultUpdatedUser);
		
		
		
		
		//iterator while loop
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
		//iterator forEach
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		
//			
//			
//		
//		});
		
		
		
		
		
		//how to print all users in two lines
		//Iterable<User> itr = userRepository.findAll();
		//itr.forEach(user->{System.out.println(user);});
		
		
		//how to delete a user
//		userRepository.deleteById(5);
		
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user->{System.out.println(user);});
		
		
		
//		List<User> users = userRepository.findByCity("Karachi");
//		List<User> usersJPQLNativeQuery = userRepository.getAllUser();
// //or		
//		Iterable<User> itr = userRepository.getAllUser();
//		itr.forEach(user->{System.out.println(user);});
		
		
//		Iterable<User> itr2 = userRepository.getUserByName("Muhammad Umar Tariq");
//		itr2.forEach(user->{System.out.println(user);});
		Iterable<User> itr3 = userRepository.getUsers();
		itr3.forEach(user->{System.out.println(user);});
		
		
		
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

}
