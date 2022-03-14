package assessment.demo;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

	private static final long serviceVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String data = req.getParameter("data");

		switch (data) {
		case "1":
			RequestDispatcher rd1 = req.getRequestDispatcher("/create");
			rd1.forward(req, res);

			break;

		case "2":
			RequestDispatcher rd2 = req.getRequestDispatcher("/find");
			rd2.forward(req, res);

		case "3":
			RequestDispatcher rd3 = req.getRequestDispatcher("/update");
			rd3.forward(req, res);

		case "4":
			RequestDispatcher rd4 = req.getRequestDispatcher("/delete");
			rd4.forward(req, res);


		}
	}
}
