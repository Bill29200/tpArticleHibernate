package bll;

import java.util.List;

import bo.Article;
import dal.ArticleDAO;

public class ArticleManager {
	
private ArticleDAO dao;
	
	public ArticleManager() {
		dao = new ArticleDAO();
	}
  public List<Article> selectAll(){
	  return dao.selectAll();
  }
  public void insert(Article Article)
  {
	  dao.insert(Article);
  }
  public void update(Article Article)
  {
	  dao.update(Article);
  }
  public void delete(Article Article)
	{
	  dao.delete(Article);
	}

}
