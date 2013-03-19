package com.anping.basic;

import java.util.LinkedHashMap;
import java.util.List;

import com.anping.po.QueryResult;

 

public interface Dao {
	public void save(Object o);
   public void flushData();
	public <T> T found(Class<T> t, int id);

	public <T> void delete(Class<T> t, int id);

	public void update(Object o);
	
	public <T>  T  getEntitiy(Class<T> t,String sql_where,List<Object> parames);

	public <T> QueryResult<T> getAllEntity(Class<T> t, int firstIndex,
			int maxResult, LinkedHashMap<String, String> OrderBy, String sql,
			List<Object> parames);

}
