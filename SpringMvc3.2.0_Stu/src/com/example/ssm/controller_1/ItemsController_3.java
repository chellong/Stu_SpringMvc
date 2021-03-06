package com.example.ssm.controller_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ssm.po.Items;

@Controller
public class ItemsController_3 {

	@RequestMapping("/queryItems_con.action")
	public ModelAndView queryItems() throws Exception {
		
		List<Items> itemsList = new ArrayList<>();

		Items items_1 = new Items();
		items_1.setId(1);
		items_1.setName("娓ｆ兂鐢佃剳");
		items_1.setPic("娓ｆ兂鐢佃剳");
		items_1.setCreatetime(new Date());
		items_1.setDetail("娓ｆ兂鐢佃剳");
		items_1.setPrice(1);
		itemsList.add(items_1);
		
		Items items_2 = new Items();
		items_2.setId(2);
		items_2.setName("娓ｆ兂鐢佃剳");
		items_2.setPic("娓ｆ兂鐢佃剳");
		items_2.setCreatetime(new Date());
		items_2.setDetail("娓ｆ兂鐢佃剳");
		items_2.setPrice(2);
		itemsList.add(items_2);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}
}
