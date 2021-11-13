package web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import web.entity.Goods;
import web.entity.GoodsType;
import web.service.GoodsService;
import web.service.GoodsTypeService;
import web.utils.FileUploadUtil;

@Controller
@RequestMapping("/admin/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private GoodsTypeService goodstypeService;
	
	@RequestMapping("/getImg/{id}")
	public String getImg(@PathVariable int id,Map<String, Object> map) {
		String picture = goodsService.getImg(id);
		map.put("picture",picture);
		map.put("id",id);
		return "goods/goods_pic_edit";
	}
	@RequestMapping("/toGoodsPicAdd")
	public String toGoodsPicAdd(int id, MultipartFile picture,HttpServletRequest request) {
		String path = FileUploadUtil.upload(picture,request);
		goodsService.editGoodsPic(id,path);
		return "forward:/admin/goods/getImg/"+id;
	}
	@RequestMapping("/getAllGoods")
	public String getAllGoods(Map<String, Object> map) {
		List<Goods> goodsList =goodsService.getAllGoods();
		map.put("goodsList", goodsList);
		return "goods/goods_List";
		
	}

	@RequestMapping("/addGoods")
	public String addGoodsType(Map<String, Object> map) {
		List<GoodsType> typesList =goodstypeService.getAllGoodsType();
		map.put("typesList", typesList);
	return "goods/goods_add";
	}
	@RequestMapping("/goodsAddSave")
	public String goodsAddSave(Goods goods,Map<String, Object> map) {
		goodsService.addGoods(goods);
		map.put("message", "保存");
	return "forward:/admin/goods/getAllGoods";
	}
	
	@RequestMapping("/getGoods/{id}")
	public String getGoods(@PathVariable int id,Map<String, Object> map) {
		List<GoodsType> goodsList =goodstypeService.getAllGoodsType();
		Goods goods =goodsService.getGoodsById(id);
		System.out.println(goods);
		map.put("typesList", goodsList);
		map.put("goods", goods);
		return "goods/goods_update";
	}
	@RequestMapping("/goodsEditSave")
	public String goodsTypeEditSave(Goods goods,Map<String, Object> map) {
		goodsService.UpdateGoods(goods);
		map.put("message", "好了");
//	return "forward:/admin/goodsType/getType/"+goodstype.getId();
		return "forward:/admin/goods/getAllGoods";
	}
	
	@RequestMapping("/deleteGoods/{id}")	
	public String deleteGoods(Map<String, Object> map,@PathVariable int id) {
		goodsService.deleteGoods(id);
		map.put("message", "删除完事");
		return "forward:/admin/goods/getAllGoods";
		
		
	}
	
	@RequestMapping("/goodsUp/{id}")
	public String goodsUp(@PathVariable Integer id) {
		goodsService.goodsUp(id);
		return "forward:/admin/goods/getAllGoods";
	}
	@RequestMapping("/goodsdown/{id}")
	public String goodsdown(@PathVariable Integer id) {
		goodsService.goodsDown(id);
		return "forward:/admin/goods/getAllGoods";
	}
	
}
