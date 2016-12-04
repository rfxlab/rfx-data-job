package com.rfxlab.system.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.rfxlab.system.model.DbSystemInfo;

import rfx.data.util.sql.CommonSpringDAO;
import rfx.data.util.sql.SqlTemplateUtil;

public class DbSystemDaoImpl extends CommonSpringDAO implements DbSystemDao {

	
	String SQL_system_get_date  = SqlTemplateUtil.getSql("SQL_system_get_date");

	
	
	public static class DbSystemInfoRowMapper implements RowMapper<DbSystemInfo> {
		@Override
		public DbSystemInfo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new DbSystemInfo(rs.getString("current_date"));
		}
	}
	
	public DbSystemInfo getSystemInfo(){
		List<DbSystemInfo>  rs = getSystemInfoAsList();
		return rs.size()>0 ? rs.get(0) : null;
	}
	
	public List<DbSystemInfo> getSystemInfoAsList(){				
		try {
			return jdbcTpl.query(SQL_system_get_date, new DbSystemInfoRowMapper());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>(0);
	}
	
}
