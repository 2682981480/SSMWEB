package web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import web.entity.Admin;
import web.service.ipml.AdminService;

@Controller
@RequestMapping("/admin")
@SessionAttributes({"error","admin"})
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "admin/admin_login";
	}
	@RequestMapping("/getIndexV2")
	public String toindex_v2() {
		return "admin/down/index_v2";
	}
	@RequestMapping("/login")
	public String login(String username,String password,Map<String, Object> map,ServletRequest resqRequest ,ServletResponse response) {
		Admin admin=adminService.getAdminByUsernameAndPassword(username, password);
		HttpServletRequest req = (HttpServletRequest) resqRequest;
		HttpServletResponse resp = (HttpServletResponse) response;
		String name = req.getParameter(username);
		String pw = req.getParameter(password);
		if(admin != null && admin.getName()!=null || username == name && password == pw) {
			map.put("admin",admin);
			return "admin/index";
		}else {
			map.put("error", "用户名或密码不匹配");
			return "redirect:/admin/toLogin";
		}
	}
	@RequestMapping("/getAllAdmins")
	public String getAllAdmins (Map<String, Object> map) {
	List<Admin> adminList = adminService.getAllAdmins();
	map.put("adminList", adminList);
	return "admin/down/admin_list1";
	}
	@RequestMapping("toAdd")
	public String toAdd() {
	return "admin/down/admin_add";
	}
	@RequestMapping("/adminAddSave")
	public String adminAddSave (Admin admin,Map<String, Object> map) {
	adminService.addAdmin(admin);
	map.put("message", "添加成功");
	return "admin/down/admin_add";
	}
	@RequestMapping("/toDelete")
	public String toDelete(ServletRequest request, ServletResponse response) {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		int id = Integer.parseInt(req.getParameter("id"));
		adminService.DeleteAdmin(id);
		return "redirect:/admin/getAllAdmins";
	}
	@RequestMapping("/toedit/{id}")
	public String getAdmin(@PathVariable int id,Map<String, Object> map) {
	Admin admin = adminService.getAdmin(id);
	map.put("v",admin);
	return "admin/down/admin_edit";
	}
	@RequestMapping("/adminEditSave")
	public String adminEditSave(Admin admin, Map<String, Object> map) {
	adminService.adminEditSave( admin);
	map. put("message","更改成功! ");
	return "redirect:/admin/toedit/"+admin.getId();
	}
}
