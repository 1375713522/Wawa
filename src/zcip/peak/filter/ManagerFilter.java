package zcip.peak.filter;

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

public class ManagerFilter  implements Filter{
	private String url;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		
		HttpServletResponse response = (HttpServletResponse)resp;
	
		String uri = request.getRequestURI();
		
		String requestPath=uri.substring(uri.lastIndexOf("/")+1,uri.length());
		System.out.println(requestPath);
		
		if("login.png".equals(requestPath)||
			"login".equals(requestPath)||
			"login.jsp".equals(requestPath)||
			"findpassword.jsp".equals(requestPath)||
			"findpasswordaction.jsp".equals(requestPath)||
			"findpassword".equals(requestPath)||
			"findpasswordaction".equals(requestPath)||
			"register".equals(requestPath)||
			"register.jsp".equals(requestPath)){
			System.out.println("aaaaaaa");
			chain.doFilter(request,response);
		}else{
			HttpSession session = request.getSession(false);
			if(session!=null){
				String obj=(String)session.getAttribute("ausername");
				System.out.println(obj);
				if(obj!=null){
					chain.doFilter(request, response);
				}else{
					url="/login.jsp";
					response.sendRedirect(request.getContextPath() + url);
//					request.getRequestDispatcher(url).forward(request, response);
				}
			}else{
				url="/login.jsp";
				response.sendRedirect(request.getContextPath() + url);
//				request.getRequestDispatcher(url).forward(request, response);
			}
			//request.getRequestDispatcher(url).forward(request, response);

		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
