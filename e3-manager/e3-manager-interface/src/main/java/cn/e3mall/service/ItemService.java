package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

public interface ItemService {

	 /**
	  * item商品管理 
	  * 通过id查询商品信息
	  * @param itenId
	  * @return
	  */
	TbItem getItemById(Long itemId);

}
