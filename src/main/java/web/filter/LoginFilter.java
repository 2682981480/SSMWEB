package web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.entity.Admin;

//登录过滤器

public class LoginFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

		
	//对资源进行过滤，每当接受到一个web资源时，去验证用户是否已登录
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		String uri = req.getRequestURI();
		if(uri.equalsIgnoreCase("/webssm/admin/toLogin")||
				uri.equalsIgnoreCase("/webssm/admin/login")||
				uri.contains(".css")||
				uri.contains(".js")||
				uri.contains(".jpg")||
				uri.contains(".jpeg")||
				uri.contains(".png")||
				uri.contains(".ico")||
				uri.contains(".mp3")||
				uri.contains(".html")) {
			chain.doFilter(req, resp);
		}else {
			HttpSession session = req.getSession();
			Admin admin = (Admin)session.getAttribute("admin");
			if(admin != null && admin.getName() != null) {
				chain.doFilter(req, resp);
			}else {
				session.setAttribute("error", "请先登录");
				resp.sendRedirect(req.getServletContext().getContextPath() + "/admin/toLogin");
			}
		}
	}

	@Override
	public void destroy() {
		
	}

}
