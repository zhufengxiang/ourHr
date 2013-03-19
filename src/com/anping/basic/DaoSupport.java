package com.anping.basic;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.Entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Utils.CheckEntity;

import com.anping.po.Depart;
import com.anping.po.QueryResult;

  
@Transactional(propagation = Propagation.REQUIRED)
public class DaoSupport implements Dao {

	
	   public void  flushData(){
			session = sessionFactory.getCurrentSession();
            session.clear();
	   }
	public void save(Object o) {
		session = sessionFactory.getCurrentSession();
             session.save(o);
      }

	public <T> T found(Class<T> t, int id) {
		session = sessionFactory.getCurrentSession();
		T load = (T) session.load(t, id);
		return load;
	}

	public <T> void delete(Class<T> t, int id) {
		session = sessionFactory.getCurrentSession();
		T load = found(t, id);
		session.delete(load);
	}

	public void update(Object o) {
		session = sessionFactory.getCurrentSession();
		session.update(o);
     
 
	}
	
	public <T> T getEntitiy(Class<T> t, String sql_where, List<Object> parames) {
	 
		if(sql_where==null){
			return null;
		} 
		 String sql = new CheckEntity().serachNameFromXml(t);
		 
		 
		session  = sessionFactory.getCurrentSession();
	 
	    Query query1=	session.createQuery("select  o  from  "+sql+" o  where  o."+sql_where);
		if(parames!=null){
			prepartStatement(query1, parames);
		 }
 
 
		  return     (T) query1.uniqueResult();
 
	 }

	public <T> QueryResult<T> getAllEntity(Class<T> t, int firstIndex,
			int maxResult, LinkedHashMap<String, String> OrderBy,
			String sql_where, List<Object> parames) {
		  QueryResult queryResult = new QueryResult();
		session = sessionFactory.getCurrentSession();
		 String sql = new CheckEntity().serachNameFromXml(t);
	      
		if (t == null)
			return null;
		Query query1 = session.createQuery("select o from "
				+ sql
				+ " o "
				+ ((parames == null &&  sql_where ==null) ? "" : " where o." + sql_where+ " ")
				+ (createSql(OrderBy) == null ? "" : "  order by "
						+ createSql(OrderBy)) );
		if (parames != null) {
			prepartStatement(query1, parames);
		}
		query1.setFirstResult(firstIndex);
		query1.setMaxResults(maxResult);
		List  list  = query1.list();
	  	 if(list.size()==0){
			 queryResult.setResults(null);
	  	 return  null;
		 }else{
		queryResult.setResults(query1.list());
		 }
		
	 
		// /////////////////////////////////////////////////////////////////////
		Query query2 = session.createQuery("select count(o.id) from " + sql
				+ " o ");
		long totol = (Long) query2.uniqueResult();
	 
		queryResult.setTotalCount(totol);
		return queryResult;
	}
   
	protected <T> String getClassName(Class<T> Entity) {
		// 怎么拿到我们xml 中的className  .
		Entity e = Entity.getAnnotation(Entity.class);
		if (e == null) {
			return null;
		} else {
			return Entity.getSimpleName();
		}

	}
     //key  代表的是 表的属性   value  代表的是排序方式 如  asc
	protected String createSql(LinkedHashMap<String, String> OrderBy) {
		StringBuffer sb = new StringBuffer();
		if (OrderBy == null) {
			return null;
		}
		Set key = OrderBy.keySet();
		Iterator<String> h = key.iterator();
		while (h.hasNext()) {
			String a = h.next();
			sb.append(" " + a).append(" " + OrderBy.get(a)).append(" ,");
		}

		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();

	}

	protected void prepartStatement(Query query, List<Object> parames) {
		
		int num = 0;
	 Object   value  ;
		for (Iterator<Object> i = parames.iterator(); i.hasNext();) {
			  value   =  i.next();
			 
			  if(value.getClass().getName().equals("java.lang.Integer") )
				  query.setInteger(num,(Integer) value);
			  else 
		      	query.setParameter(num, value) ;
			      	num++;
		}
	}
 
	private SessionFactory sessionFactory;
	private Session session;

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
