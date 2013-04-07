package com.auto.test;

import com.auto.dao.Dao;

public class T {

  public  static void main(String args[]) throws Exception{
	  Dao dao = new Dao();
	  if(dao.validate("jiazhong", "zjzhongs")){
		  System.out.println("Í¨¹ý");
	  }
  }
}
