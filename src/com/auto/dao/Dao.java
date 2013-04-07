package com.auto.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.auto.util.JdbcUtils;

public class Dao {

	public boolean validate(String acc,String pass) throws SQLException {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		int num=0;
		try {
			// 2.建立连接
			conn = JdbcUtils.getConnection();
			// conn = JdbcUtilsSing.getInstance().getConnection();
			// 3.创建语句
			st = conn.createStatement();

			// 4.执行语句
//			rs = st.executeQuery("select count(*)  from user where account='"+account+"' and password = '"+password+"'");
//			rs = st.executeQuery("select *  from user where account='"+acc+"' and password ='"+pass+"'");
			rs = st.executeQuery("select  count(*)  from user where account='"+acc+"' and password ='"+pass+"'");
			while(rs.next()){
				num=rs.getInt(1);
				if(num==0){
					return false;
				}
				return true;
			}
			return false;
		} finally {
			JdbcUtils.free(rs, st, conn);
		}		
		

	
	} 	
	
}
