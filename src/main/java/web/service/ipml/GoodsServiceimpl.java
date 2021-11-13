package web.service.ipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.GoodsMapper;
import web.entity.Goods;
import web.entity.GoodsType;
import web.service.GoodsService;

@Transactional
@Service
public class GoodsServiceimpl implements GoodsService{
	@Autowired
	private GoodsMapper goodsMapper;
	@Override
	public List<Goods> getAllGoods(){
		return goodsMapper.selectAllGoods();
	}
	@Override
	public void addGoods(Goods goods) {
		goodsMapper.insert(goods);
		
	}
	@Override
	public Goods getAllGoods(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void UpdateGoods(Goods goods) {
		goodsMapper.updateByPrimaryKey(goods);
		
	}
	@Override
	public void deleteGoods(int id) {
//		goodsMapper.setGoodsTypeAsNull(id);
//		goodsMapper.selectAllGoods();
		goodsMapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public Goods addGoods(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Goods getGoodsById(int id) {
		// TODO Auto-generated method stub
		return goodsMapper.getGoodsById(id);
	}
	
	@Override
	public void goodsUp(Integer id) {
		// TODO Auto-generated method stub
		goodsMapper.goodsUp(id);
	}
	@Override
	public void goodsDown(Integer id) {
		// TODO Auto-generated method stub
		goodsMapper.goodsDown(id);
	}
	@Override
	public String getImg(int id) {
		// TODO Auto-generated method stub
		return goodsMapper.selectPicture(id);
	}
	@Override
	public void editGoodsPic(int id, String path) {
		// TODO Auto-generated method stub
		goodsMapper.editGoodsPic(id,path);
	}
	@Override
	public List<Goods> getAllGoodswithStatusAs1() {
		// TODO Auto-generated method stub
		return goodsMapper.getAllGoodswithStatusAs1();
	}

}
