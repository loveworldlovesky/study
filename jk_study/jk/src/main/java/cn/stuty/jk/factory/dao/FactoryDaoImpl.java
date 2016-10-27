package cn.stuty.jk.factory.dao;

import cn.stuty.jk.base.dao.BaseDaoImpl;
import cn.stuty.jk.factory.entity.Factory;

public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements
		FactoryDao {

	public Factory getById(String id) {
		Factory factory = get(id);
		return factory;
	}


}
