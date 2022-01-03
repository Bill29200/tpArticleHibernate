package ihm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ArticleManager;
import bo.Article;


@WebServlet("/AffichageArticleServlet")
public class AffichageArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArticleManager manager = new ArticleManager();
		List<Article> articles = manager.selectAll();
		
		 request.setAttribute("articles",articles);
	     request.getRequestDispatcher("/WEB-INF/JSP/accueil.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
