package com.example.quiz.session.mvc.controller;

import com.example.quiz.session.mvc.model.Question;
import com.example.quiz.session.mvc.model.QuizSession;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ResetQuizServlet", value = "/ResetQuizServlet")
public class ResetQuizServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");
        quizSession.resetQuiz();
        response.sendRedirect("index.jsp");
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 
