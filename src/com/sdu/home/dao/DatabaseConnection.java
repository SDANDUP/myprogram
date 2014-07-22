package com.sdu.home.dao;

import java.sql.Connection;

public interface DatabaseConnection {
	public Connection getConnection();
	public void close();
}
