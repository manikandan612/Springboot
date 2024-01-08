package com.ebrain.springboot.training.demotraining.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebrain.springboot.training.demotraining.dto.GenericResponse;
import com.ebrain.springboot.training.demotraining.dto.User;
import com.ebrain.springboot.training.demotraining.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServices userService;
	
	@PostMapping(value="/create")
	private GenericResponse<User> createuser(@RequestBody User user) throws ClassNotFoundException, SQLException {
		
		userService.save(user);
		
		GenericResponse<User> response = new GenericResponse<User>();
		
		response.setData(null);
		response.setDataList(null);
		response.setStatus("SUCCESS");
		response.setMessage("Saved Successfully");
		
		return response;
	}
	
	@GetMapping(value="/get")
	private GenericResponse<User> getAllUsers() {
		
		List<User> users = userService.getAllUsers();
		
GenericResponse<User> response = new GenericResponse<User>();
		
		response.setData(null);
		response.setDataList(users);
		response.setStatus("SUCCESS");
		response.setMessage("Fetched Successfully");
		
		return response;
	}
}
