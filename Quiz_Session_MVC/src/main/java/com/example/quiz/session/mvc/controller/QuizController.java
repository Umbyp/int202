package com.example.quiz.session.mvc.controller;

import com.example.quiz.session.mvc.model.QuizSession;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "QuizController", value = "/QuizController")
public class QuizController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session==null || session.getAttribute("quizSession")==null) {
            QuizSession quizSession = new QuizSession();
            quizSession.fetchQuestion();
            session.setAttribute("quizSession",quizSession);
        }
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");
        request.setAttribute("currentQuestion",quizSession.getQuestions().get(quizSession.getCurrentQuestionIndex()));/* list คำถาม ได้ข้อมา*/
       request.getRequestDispatcher("/quiz.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ans = Integer.parseInt(request.getParameter("option"));//index ของคำตอบ
        HttpSession session = request.getSession();
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");
        quizSession.checkCorrectQuestion(ans);
        quizSession.moveToNextQuestion();
        if (quizSession.isQuizEnded()) {
            int score = quizSession.getCorrectAnswerCount();
            request.setAttribute("score",score);
            request.getRequestDispatcher("/result.jsp").forward(request,response);
        }else {
            doGet(request, response);
        }

    }

}
 
