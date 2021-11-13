package web.service;

import java.util.List;

import web.entity.Goods;
import web.entity.GoodsType;
//import web.service.ipml.string;

public interface GoodsService {


	public Goods addGoods(int id);


	public List<Goods> getAllGoods();


	public Goods getAllGoods(int id);


	public void UpdateGoods(Goods goods);


	public void deleteGoods(int id);


	void addGoods(Goods goods);


	public Goods getGoodsById(int id);


	public void goodsUp(Integer id);


	public void goodsDown(Integer id);


	public String getImg(int id);


	public void editGoodsPic(int id, String path);


	public List<Goods> getAllGoodswithStatusAs1();
	
}
