package web.service.ipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.GoodsMapper;
import web.dao.GoodsTypeMapper;
import web.entity.GoodsType;
import web.service.GoodsTypeService;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{
	
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<GoodsType> getAllGoodsType() {
			return goodsTypeMapper.getAllGoodsType();
		}
	@Transactional
	@Override
	public void deleteType(int id) {
		goodsMapper.setGoodsTypeAsNull(id);
		goodsTypeMapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public void goodsTypeSava(GoodsType goodsType) {
		// TODO Auto-generated method stub
		goodsTypeMapper.insert(goodsType);
	}
	@Override
	public GoodsType selectGoodsTypeById(Integer id) {
		return goodsTypeMapper.selectByPrimaryKey(id);
	}
	@Override
	public void goodsTypeUpdate(GoodsType goodsType) {
		// TODO Auto-generated method stub
		goodsTypeMapper.updateByPrimaryKey(goodsType);
	}
	
	}