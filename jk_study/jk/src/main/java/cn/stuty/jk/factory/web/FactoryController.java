package cn.stuty.jk.factory.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.stuty.jk.factory.entity.Factory;
import cn.stuty.jk.factory.manager.FactoryManager;

public class FactoryController implements Controller{
	
	FactoryManager entityManager;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Factory factory1 = entityManager.getById("1");
		System.out.println("查询.........name1 = "+factory1.getFactoryName());
		Factory factory2 = entityManager.updateObj("1");
		System.out.println("查询.........name2 = "+factory2.getFactoryName());
//		entityManager.add();
		return null;
	}


	public void setEntityManager(FactoryManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
