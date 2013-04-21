package hbmUtil;

 
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.Driver;

 

public class Test {
    public static void main(String[] args) {
    	 ApplicationContext   appc  = new ClassPathXmlApplicationContext("applicationContext.xml");
   	     appc.getBean("sessionFactory");
	}
}
