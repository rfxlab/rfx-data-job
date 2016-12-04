package com.rfxlab.datajob;

import org.springframework.context.ApplicationContext;

import com.rfxlab.system.dao.DbSystemDao;
import com.rfxlab.system.model.DbSystemInfo;
import com.rfxlab.util.SpringContextUtil;


public class DataJobInstance {
	
	static void startDataJobs(){	
		ApplicationContext context = SpringContextUtil.getContext();
		
		DbSystemDao dbSystemDao = context.getBean(DbSystemDao.class);
		DbSystemInfo info = dbSystemDao.getSystemInfo();
		System.out.println(info);
	}

	
	public static void main(String[] args)  {		
		startDataJobs();
	}

}
