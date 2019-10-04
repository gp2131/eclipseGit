package com.lti.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {

	private List<Question> questions;
	private int noOfQuestions;
	boolean check = true;

	@Override
	public void init() throws ServletException {
		questions = QuestionBankLoader.loadQuestionsOnJava();
		noOfQuestions = questions.size();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer questionNo = (Integer) session.getAttribute("qNo");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if (questionNo == null) {
			questionNo = 0;
			check = true;
		} else {
			questionNo++;
			check = true;
		}
		if (questionNo >= noOfQuestions) {
			check = false;
			//out.print("<h3>Your Have Completed the Test</h3>");
			response.sendRedirect("DisplayResultServlet");
		}
		if (check) {
			session.setAttribute("qNo", questionNo);
			Question q = questions.get(questionNo);
			session.setAttribute("currentQs", q);
			out.println("<form action='CalculateScoreServlet'>");
			out.println("<h3>Question" + (++questionNo) + " of " + (noOfQuestions) + " " + q.getQuestion() + "</h3>");
			int optionNo = 0;
			for (Option o : q.getOptions()) {
				out.println("<h4><input type='radio' name='option' value='" + (optionNo++) + "'>" + o.getOption()
						+ "</input><br>");
			}
			out.println("<button typ='submit'>Continue</button>");
			out.println("</form>");
		}
	}

}
