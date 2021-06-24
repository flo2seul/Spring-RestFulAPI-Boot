package com.encore.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.Item;
import com.encore.spring.model.ItemCatalog;

@Controller
public class FruitsController {
	@Autowired
	private ItemCatalog itemCatalog;
	
	@RequestMapping("index.do")
	public ModelAndView index() throws Exception {
		List<Item> list = itemCatalog.getItemList();
		return new ModelAndView("WEB-INF/views/itemList.jsp", "list", list);
	}
	
	@RequestMapping("itemView.do")
	public ModelAndView itemView(int itemNumber) throws Exception {
		Item item = itemCatalog.getItem(itemNumber);
		return new ModelAndView("WEB-INF/views/itemView.jsp", "item", item);
	}
}	
//@RequestParam은 HttpServletRequest 객체와 같은 역할. Handler(Controller)의 매개변수로 1:1 맵핑할 때 사용되는 어노테이션 .
//@RequestParam 지정한 키값이 존재하지 않다면 BadRequest로 http 4** 에러 발생 --> required=false로 지정하면 해당 키값이 존재하지 않다고 해서 BadRequest가 발생하지 않음. 
//																   키값이 존재하지 않으면 defaultValue의 값이 들어가게 됨.