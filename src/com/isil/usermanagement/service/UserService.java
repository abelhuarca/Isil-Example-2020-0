package com.isil.usermanagement.service;

import java.sql.SQLException;
import java.util.List;

import com.isil.usermanagement.dao.UserDAO;
import com.isil.usermanagement.model.User;

/**
 * AbstractService.java This SERVICE class provides CRUD database operations for the
 * table users in the database.
 * 
 * @author Abel Huarca [Isil]
 *
 */
public class UserService {

    UserDAO dao= new UserDAO();

	public void insertUser(User user) throws SQLException {
		dao.insertUser(user);
		} 

	public User selectUser(int id) {
		return dao.selectUser(id);
	}

	public List<User> selectAllUsers() {
		return dao.selectAllUsers();
	}

	public boolean deleteUser(int id) throws SQLException {
		return dao.deleteUser(id);
	}

	public boolean updateUser(User user) throws SQLException {
		return dao.updateUser(user);
	}

	

}
