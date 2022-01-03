package dal;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import bo.Article;

public class ArticleDAO {
	
	private Session session;
	
	public ArticleDAO() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
				                        .configure("hibernate.cfg.xml")
				                        .build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		session = factory.openSession();
		session = factory.openSession();
	}
//........................................................................
	public List<Article> selectAll(){
		return session.createQuery("from Article", Article.class).list();
		
	}
	//........................................................................
	public Article selectById(int id)
	{
		return session.find(Article.class, id);
		
	}
	//........................................................................
	public Article selectByName(String nom){
		return session.createQuery("from Article where nom = : param_nom", Article.class)
				.setParameter("param_nom", nom)
				.getSingleResult();
		
	} 
	//........................................................................
	public void insert(Article Article)
	{
		//session.save(Article);
		
		  Transaction t = session.beginTransaction();
		  try { 
			  session.save(Article); // inserer 
			  session.flush(); // 
			  t.commit();
			  
		  }
		  catch (RollbackException rbe) { t.rollback();
		  System.out.println(rbe.getMessage()); }
		 
	}
	//........................................................................
	public void update(Article Article)
	{
		//session.save(Article);
		
		  Transaction t = session.beginTransaction();
		  try { 
			  session.update(Article); // inserer 
			  session.flush(); // 
			  t.commit();
			  
		  }
		  catch (RollbackException rbe) { t.rollback();
		  System.out.println(rbe.getMessage()); }
		 
	}
	//........................................................................
	public void delete(Article Article)
	{
		//session.save(Article);
		
		  Transaction t = session.beginTransaction();
		  try { 
			  session.delete(Article); // inserer 
			  session.flush(); // 
			  t.commit();
			  
		  }
		  catch (RollbackException rbe) { t.rollback();
		  System.out.println(rbe.getMessage()); }
		 
	}
	

}
