package main.java.cn.com.sxu.logistics.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class EncodingFilter
 */
@WebServlet("/SetCharacterEncodingFilter")
public class SetCharacterEncodingFilter extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;

	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filterChain) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		filterChain.doFilter(req, res);
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}
}
