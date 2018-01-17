package main.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gx.dao.AreaDao;


public class testDB2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");

        AreaDao dao = (AreaDao) context.getBean("areaDao");

        dao.queryAll();
	}
}
