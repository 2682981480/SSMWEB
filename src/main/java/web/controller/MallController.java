package web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.Goods;
import web.entity.GoodsType;
import web.service.GoodsService;
import web.service.GoodsTypeService;
@Controller
@RequestMapping("/mall")
public class MallController {
//@RequestMapping("/index")
//public String index(){
//return "mall/index";
//}
@Autowired
private GoodsTypeService goodsTypeService;
@Autowired
private GoodsService goodsService;
@RequestMapping("/toProduct")
public String toProduct(Map<String, Object>map) {
	List<GoodsType> typeList = goodsTypeService.getAllGoodsType();
	List<Goods> goodsList = goodsService.getAllGoodswithStatusAs1();
	map.put("typeList", typeList);
	map.put("goodsList", goodsList);
	return "mall/product";
}

	@RequestMapping("/selectMore/{id}")
	public String selectMore(@PathVariable Integer id, Map<String, Object> map) {
		Goods goods = goodsService.getGoodsById(id);
		map.put("goods", goods);
		return "mall/selectMore";
	}
}
