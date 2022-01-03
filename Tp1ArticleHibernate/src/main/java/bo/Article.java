package bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="articles")
public class Article {
	
	@Id @Column (name="id_article")
	private long id;
	private String nom;
    private double prix;
	private String pays;
	
	
	public Article() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", prix=" + prix + ", pays=" + pays + "]";
	}
	
	

}
