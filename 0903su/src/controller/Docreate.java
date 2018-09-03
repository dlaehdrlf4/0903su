package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Docreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Docreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getRequestURI - > /0903javaweb/login.do
		//getContextPath - > /0903javaweb/
		//login.do만 추출하기 위한 로직
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String commend = requestURI.substring(contextPath.length() +1);
	
		switch(commend) {
		case "login.do":
			System.out.println("로그인 요청 처리");
			break;
		case "register.do":
			System.out.println("회원가입 요청 처리");
			break;
		}
		
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
