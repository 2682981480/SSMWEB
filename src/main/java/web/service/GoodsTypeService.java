package web.service;

import java.util.List;

import web.entity.GoodsType;

public interface GoodsTypeService {
	
	List<GoodsType> getAllGoodsType();

	void deleteType(int id);

	void goodsTypeSava(GoodsType goodsType);

	GoodsType selectGoodsTypeById(Integer id);

	void goodsTypeUpdate(GoodsType goodsType);
}
