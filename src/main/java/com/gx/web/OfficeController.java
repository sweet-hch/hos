package com.gx.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gx.entity.Office;
import com.gx.service.OfficeService;

@Controller
public class OfficeController {
	@Autowired
	private OfficeService officeService;
	int size = 9;
	
	
	@RequestMapping(value = "/officeIndex/1",method = RequestMethod.GET)
	public String hosIdex(Model model){
//		System.out.println("当前页:==========="+page);
		System.out.println("==================");
//		Office ofiice = new Office();
//		office.setStart(page * size);
//		office.setPage(size);
		List<Office> officeList = officeService.findOfficeByRe();
		model.addAttribute("officeRe",officeList);
		return "office/officeIndex";
	}
}
