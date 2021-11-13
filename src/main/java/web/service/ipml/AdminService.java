package web.service.ipml;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.AdminMapper;
import web.entity.Admin;
import web.service.AdminSerive;

@Service
public class AdminService implements AdminSerive{

	
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin getAdminByUsernameAndPassword(String username, String password) {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("username", username);
		param.put("password", password);
		return adminMapper.selectByUsernameAndPassword(param);
	}
	@Override
	public List<Admin> getAllAdmins() {
		return adminMapper.getAllAdmins();
	}
	@Override
	public void addAdmin(Admin admin) {
		adminMapper.insert(admin);
	}
	@Override
	public void DeleteAdmin(int id) {
		adminMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Admin getAdmin(int id) {
		return adminMapper.selectByPrimaryKey(id);
	}
	@Override
	public void adminEditSave(Admin admin) {
		adminMapper.updateByPrimaryKey(admin);
	}
}
