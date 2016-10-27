package cn.stuty.jk.factory.manager;

import javax.annotation.Resource;

import cn.stuty.jk.base.manager.BaseManagerImpl;
import cn.stuty.jk.factory.dao.FactoryDao;
import cn.stuty.jk.factory.entity.Factory;

public class FactoryManager extends BaseManagerImpl<Factory>{
	
//	BaseDao<Factory> factoryDao;
//
	@Resource(name="factoryDao")
	public void setFactoryDao(FactoryDao factoryDao) {
		super.setBaseDao(factoryDao);
	}
	
	public Factory getObj(String id){
		FactoryDao factoryDao = (FactoryDao) getBaseDao();
		Factory factory = factoryDao.getById(id);
		return factory;
	}
	
	
}
