package com.sdu.home.dbtools;

import java.sql.Connection;
import java.sql.DriverManager;

import com.sdu.home.dao.DatabaseConnection;

public class DatabaseConn implements DatabaseConnection{
	private  static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private  static final String URL = "jdbc:oracle:thin:@192.168.1.80:1521:jhrsdny";
	private  static final String USERNAME="cpu";
	private  static final String PASS = "cpu123";
	private Connection conn = null;
	public DatabaseConn(){
		try{
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL,USERNAME,PASS);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close(){
		if(this.conn!=null){
			try{
				this.conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
