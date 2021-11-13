package web.service;

import java.util.List;

import web.entity.Admin;

public interface AdminSerive {
	
	public Admin getAdminByUsernameAndPassword(String username,String password) ;

	List<Admin> getAllAdmins();

	void addAdmin(Admin admin);

	void DeleteAdmin(int id);

	void adminEditSave(Admin admin);

	Admin getAdmin(int id);

}
