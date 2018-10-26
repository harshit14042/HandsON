package com.practice.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	public int add(T t) throws SQLException;
	public List<T> findAll() throws SQLException;
	public int removeById(long id) throws SQLException;
	public T findById(long id) throws SQLException;
	public long getNewId() throws SQLException;
	public T convertToObj(ResultSet rs) throws SQLException;
}
