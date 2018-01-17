package main.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gx.dao.DoctorDao;

public class TestDB {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");

        DoctorDao dao = (DoctorDao) context.getBean("doctorDao");

        dao.getDoctor();

}
}
