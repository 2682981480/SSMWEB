package web.dao;

import java.util.List;

import web.entity.Goods;
import web.entity.GoodsType;

public interface GoodsMapper {

	int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

	void setGoodsTypeAsNull(int id);

	List<Goods> selectAllGoods();

	Goods getGoodsById(int id);

	void goodsUp(Integer id);

	void goodsDown(Integer id);

	String selectPicture(int id);

	void editGoodsPic(int id, String path);

	List<Goods> getAllGoodswithStatusAs1();
}