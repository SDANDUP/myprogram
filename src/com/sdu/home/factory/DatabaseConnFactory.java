package com.sdu.home.factory;

import com.sdu.home.dbtools.DatabaseConn;

public class DatabaseConnFactory {
	public DatabaseConn getConnection(){
		return new DatabaseConn();
	}
}
