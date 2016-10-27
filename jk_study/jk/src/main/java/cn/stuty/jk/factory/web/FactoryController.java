package cn.stuty.jk.factory.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.stuty.jk.factory.entity.Factory;
import cn.stuty.jk.factory.manager.FactoryManager;

@Controller
public class FactoryController{
	@Autowired
	FactoryManager factoryManager;
	public void setEntityManager(FactoryManager entityManager) {
		this.factoryManager = entityManager;
	}
	//列表
	@RequestMapping("/jk/factory/list.do")
	public String list(Model model){
		List<Factory> dataList=factoryManager.list();
		model.addAttribute("dataList", dataList);//将数据传递到页面
		return "/jk/factory/jFactoryList.jsp";//转向页面
	}
	
	
}
