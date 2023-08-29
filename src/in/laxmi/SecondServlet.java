package in.laxmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class SecondServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	Cookie[] cookies = req.getCookies();
	PrintWriter pw = resp.getWriter();
	if(cookies!=null) {
		String value = cookies[0].getValue();
		System.out.println(value);
		if(value!=null) {
			pw.append("second servlet");
		}else {
			pw.print("invalid request");
		}
	}else {
		pw.print("invalid request");
	}
	
}
}
