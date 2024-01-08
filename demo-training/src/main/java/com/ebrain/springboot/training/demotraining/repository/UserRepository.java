package com.ebrain.springboot.training.demotraining.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;


import com.ebrain.springboot.training.demotraining.dto.User;
import com.ebrain.springboot.training.demotraining.services.UserServices;

@Repository
public class UserRepository {
	
	public static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(!ObjectUtils.isEmpty(connection)) {
			return connection;
		}
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/dbms_april_2023","dbms_april_2023", "Ebrain@20");
		System.out.println("Drivermanager:"+connection);
		return connection;
	}
	
	public void save(User user) throws ClassNotFoundException, SQLException {
		
		Connection connection = (Connection) UserRepository.getConnection();
		java.sql.PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tb_mk_vendor(VendorID,VendorName,VendorEmail,VendorPhone) VALUES(?,?,?,?)");
		
		preparedStatement.setString(1, User.getName());
		preparedStatement.setString(2,User.getEmail());
		preparedStatement.setString(3, User.getMobile());
		preparedStatement.setDouble(4, User.getIncome());
		preparedStatement.executeUpdate();
		//Get connection	
		//Create PreparedStatement
		//Save User object by calling execteUpdate
	}
	public List<User> getAllUsers(){
		//Get connection	
		//Create PreparedStatement
		//Get Result Set
		//Parse Result Set
		//Get User List
		return null;
	}
}
