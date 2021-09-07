
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user_name");
		String adharnumber=request.getParameter("user_number");
		String email=request.getParameter("user_email");
		String phonenumber=request.getParameter("user_phonenumber");
		String gender=request.getParameter("user_gender");
		String vaccinated=request.getParameter("user_vaccinated");
		String firstdose=request.getParameter("user_dose1");
		String seconddose=request.getParameter("user_dose2");
		String vacccinename=request.getParameter("Vaccine Name");
		
		Member member = new Member(name,adharnumber,email,phonenumber,gender,vaccinated,firstdose,seconddose,vacccinename);
		RegisterDao rDao = new RegisterDao();
		String result = rDao.insert(member);
		response.getWriter().print(result);
		
	}

}
