package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Controller
public class ItemController {

	 @Autowired
	private ItemService itemService;
	 
	 /**
	  * item商品管理 
	  * 通过id查询商品信息
	  * @param itenId
	  * @return
	  */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		System.out.println(itemId);
		//TbItem item=itemService.getItemById(itemId);
		return null;
		
	}
}
