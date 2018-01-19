package com.gx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gx.dao.OfficeDao;
import com.gx.entity.Office;
import com.gx.service.OfficeService;
@Service
public class OfficeServiceImpl implements OfficeService {
	@Autowired
	private OfficeDao officeDao ;
	@Override
	public List<Office> findOfficeByRe(){
		return officeDao.findOfficeByRe();
	}

}
