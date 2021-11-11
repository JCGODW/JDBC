package com.mysql.cj.jdbc;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class Driver implements java.sql.Driver {

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO 自动生成的方法存根
		return null;
	}

}
