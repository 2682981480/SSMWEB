package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import web.dao.GoodsTypeMapper;
import java.util.List;
import java.util.Map;

import web.entity.Goods;
import web.entity.GoodsType;
import web.service.GoodsTypeService;

@Controller
@RequestMapping("/admin/goodsType")
public class GoodsTypeController {
	@Autowired
	private GoodsTypeService goodsTypeService;
	@RequestMapping("/getGoodsType")
	public String getGoodsType(Map<String, Object> map) {
		
		List<GoodsType> typeList =goodsTypeService.getAllGoodsType();
		map.put("typeList", typeList);
		return "goodsType/goodsTypeList";
		
	}
    // 去添加商品分类
    @RequestMapping("/toAddGoodsType")
    public String toAddGoodsType(){
        return "goodsType/goodsType_add";
    }

    // 保存添加的商品分类信息
    @RequestMapping("/goodsTypeSave")
    public String goodsTypeSave(GoodsType goodsType, Map<String,Object> map) {
        goodsTypeService.goodsTypeSava(goodsType);
        map.put("typeAddMsg", "添加成功！");
        return "forward:/admin/goodsType/getGoodsType";
    }
    // 去修改商品分类信息
    @RequestMapping("/toUpdateGoodsType/{id}")
    public String toUpdateGoodsType(@PathVariable Integer id,Map<String, Object> map) {
        GoodsType goodsType = goodsTypeService.selectGoodsTypeById(id);
        map.put("goodsTypeUpdate", goodsType);
        return "goodsType/goodsType_update";
    }

    // 保存商品分类信息到数据库
    @RequestMapping("/goodsTypeUpdate")
    public String goodsTypeUpdate(GoodsType goodsType, Map<String, Object> map) {
        goodsTypeService.goodsTypeUpdate(goodsType);
        map.put("typeUpdateMsg", "修改成功！");
        return "forward:/admin/goodsType/getGoodsType";
    }
	@RequestMapping("/deleteType/{id}")	
	public String deleteType(Map<String, Object> map,@PathVariable int id) {
		goodsTypeService.deleteType(id);
		map.put("message", "删除成功！");
		return "goodsType/goodsTypeList";
		
	}
}
