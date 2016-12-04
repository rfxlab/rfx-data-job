package com.rfxlab.system.dao;


import java.util.List;

import com.rfxlab.system.model.DbSystemInfo;

import rfx.data.util.cache.CacheConfig;


@CacheConfig( type = CacheConfig.LOCAL_CACHE_ENGINE, keyPrefix = "system:", expireAfter = 6 )
public interface DbSystemDao {
	public DbSystemInfo getSystemInfo();
	public List<DbSystemInfo> getSystemInfoAsList();
}
