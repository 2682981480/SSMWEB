package web.dao;

import java.util.HashMap;
import java.util.List;

import web.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin admin);

	Admin selectByUsernameAndPassword(HashMap<String, Object> param);

	List<Admin> getAllAdmins();

	void deleteadmin(int id);

	

}