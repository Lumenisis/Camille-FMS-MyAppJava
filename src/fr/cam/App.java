package fr.cam;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import fr.cam.bdd.ArticleDao;
import fr.cam.bdd.CategoryDao;
import fr.cam.bdd.DeveloperDao;
import fr.cam.entities.Article;
import fr.cam.entities.Category;
import fr.cam.entities.Developer;
import fr.cam.mvc.Controller;
import fr.cam.mvc.Model;
import fr.cam.mvc.View;

/**
 * Application de gestion des stocks d'une boutique de gaming
 * Utilisation du langage Java
 * Utilisation des requêtes SQL
 * Utilisation de Swing
 * 
 * @author Camille - 2023
 *
 */

public class App {
	
	public static void main(String[] args) {	
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		Model model = new Model();		
		View view = new View();					
		new Controller(model, view);			
	}

	private static void testArticleDao() {
		for(Article a : new ArticleDao().readAll())
		System.out.println(a);		
	}
	
	private static void testCategoryDao() {
		for(Category c : new CategoryDao().readAll())
		System.out.println(c);		
	}
	
	private static void testDeveloperDao() {
		for(Developer d : new DeveloperDao().readAll())
		System.out.println(d);		
	}
}