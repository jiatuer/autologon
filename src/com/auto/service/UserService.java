package com.auto.service;

import java.sql.SQLException;

import com.auto.dao.Dao;

public class UserService {

	private Dao dao;
	
	public UserService(Dao dao){
		this.dao = dao;
	}
	
	public boolean validateUser(String acct,String pass) {
		try{
		return dao.validate(acct, pass);
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			return false;
		}
	}
}
