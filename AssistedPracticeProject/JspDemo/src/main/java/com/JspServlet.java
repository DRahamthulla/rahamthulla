package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JspServlet
 */
public class JspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JspServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  HttpSession session=request.getSession();
	  String userName=request.getParameter("username");
	  String password=request.getParameter("pdw");
	  RequestDispatcher rd=null;
	  if(username.equals("admin") && password.equals("Admin@123")) {
		  session.setAttribute("id", username);
		  rd=request.getRequestDispatcher("/Home.jsp");
		  Student s1=new Student("sudent1","Guntakal");
		  Student S2=new Student("sudent2","Gooty");
		  List<Student> list=new ArrayList<Student>();
		  list.add(s1);
		  list.add(s2);
		  session.setAttribute("listOfStudents", list);
	  }
		rd.forward(request, response);
		else {
			rd=RequestDispatcher("/Loginerror.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
