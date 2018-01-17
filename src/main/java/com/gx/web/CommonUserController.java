package com.gx.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gx.entity.CommonUser;
import com.gx.service.CommonUserService;

@Controller
public class CommonUserController {
	@Autowired
	private CommonUserService commonUserService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpSession session){
		return "user/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(String userEmail,String userPassWord){
		
		CommonUser commonUser = commonUserService.getUserByEmail(userEmail);
		if(commonUser == null){
			System.out.println("用户未注册");
		}else{
			if(commonUser.getUserPassword().equals(userPassWord)){
				System.out.println("登录成功");
			}else{
				System.out.println("登录失败");
			}
		}
		
	}
}
