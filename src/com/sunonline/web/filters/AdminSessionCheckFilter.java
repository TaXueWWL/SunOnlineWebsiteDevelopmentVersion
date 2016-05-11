package com.sunonline.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class AdminSessionCheckFilter implements Filter {

	//获取初始化参数
	private FilterConfig config;
	
    public AdminSessionCheckFilter() {
    }

	public void destroy() {
		this.config = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//获取初始化参数
		String adminLoginPage = config.getInitParameter("adminLoginPage");			//管理员登录页
		String adminVerifyServlet = config.getInitParameter("adminVerifyServlet");	//管理员登录验证servlet
		//获取会话对象
		HttpSession session = ((HttpServletRequest)request).getSession();
		//获取请求资源路径，不包含请求参数
		String requestPath = ((HttpServletRequest)request).getServletPath();
		
		if (session.getAttribute("admin_name") != null 
				|| requestPath.endsWith(adminLoginPage)
				|| requestPath.endsWith(adminVerifyServlet)) {
		//如果用户会话域属性user存在
		//并且请求资源为登录页面或者验证servlet则放行
			chain.doFilter(request, response);
		} else {
			//对请求进行拦截，返回登录界面
			request.setAttribute("filterTip", "您还未登录，请先登录！");
			request.getRequestDispatcher(adminLoginPage).forward(request, response);
		}
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
	}

}
