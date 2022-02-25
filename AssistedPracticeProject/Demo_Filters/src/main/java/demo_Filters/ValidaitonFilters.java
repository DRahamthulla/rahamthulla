package demo_Filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class ValidaitonFilters
 */
public class ValidaitonFilters extends Object implements Filter {
       
    /**
     * @see Object#Object()
     */
    public ValidaitonFilters() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	String pan=request.getParameter("pan");
	System.out.println("Hi from Filter");
	if(pan==null || !pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("Index.html").include(request, response);
		out.println("<SPAN style='color:red'>Invalid PAN No.</SPAN>");
	}
	else {
		request.setAttribute("pan", pan);
	chain.doFilter(request, response);
	System.out.println("bye from Filter");

	} 
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
