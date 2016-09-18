package net.jplugin.core.das.route.impl.conn;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import net.jplugin.core.das.route.api.RouterDataSource;

public class RouterConnection implements Connection{
	RouterDataSource dataSrouce;
	
	public RouterConnection(RouterDataSource ds){
		this.dataSrouce = ds;
	}
	
	public RouterDataSource getDataSource(){
		return this.dataSrouce;
	}
	
	@Override
	public Statement createStatement() throws SQLException {
		return RouterStatement.create(this);
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return RouterPrearedStatement.create(sql,this);
	}
	
	
	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return false;
	}

	@Override
	public void commit() throws SQLException {
	}

	@Override
	public void rollback() throws SQLException {
	}

	@Override
	public void close() throws SQLException {
	}

	@Override
	public boolean isClosed() throws SQLException {
		return false;
	}

	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
	}
	

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
			throws SQLException {
		throw new RuntimeException("not support");
	}
	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		throw new RuntimeException("not support");
	}
	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		throw new RuntimeException("not support");
	}
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		throw new RuntimeException("not support");
	}


	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public String getCatalog() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void clearWarnings() throws SQLException {
		throw new RuntimeException("not support");
	}


	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setHoldability(int holdability) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public int getHoldability() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		throw new RuntimeException("not support");
	}


	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		throw new RuntimeException("not support");
	}



	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		throw new RuntimeException("not support");
	}



	@Override
	public Clob createClob() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Blob createBlob() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public NClob createNClob() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		throw new RuntimeException("not support");
	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setSchema(String schema) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public String getSchema() throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void abort(Executor executor) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		throw new RuntimeException("not support");
	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		throw new RuntimeException("not support");
	}

}