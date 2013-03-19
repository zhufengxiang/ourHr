package com.anping.service;

import java.util.LinkedHashMap;
import java.util.List;

import com.anping.po.Depart;
import com.anping.po.QueryResult;

public interface DepartService {
	 public void flush();
	 public  Depart getDepart(String sql_where,List<Object> parames);
      public void  addDepart(Depart depart );
      public  void  deleteDepart(Depart depart);
      //为什么会有更新呢   因为是需要排序的
      public  void  updateDepart(Depart depart);
      public  QueryResult   getDeparts(int firstIndex,
  			int maxResult, int  pid );
}
