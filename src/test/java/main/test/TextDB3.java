//package main.test;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.gx.service.CommonUserService;
//import com.gx.web.CommonUserController;
//
//public class TextDB3 {
//	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
//				new String[]{"classpath:spring/spring-dao.xml",
//						"classpath:spring/spring-service.xml",
//						"classpath:spring/spring-web.xml"});
//        
//		CommonUserController con = new CommonUserController();
//		con.setCommonUserService((CommonUserService)context.getBean("commonUserServiceImpl"));;
//		con.login("343195357@qq.com", "BFADFD06C0FE7FEED44A175EE1C09259");
//        
//	}
//
//}
