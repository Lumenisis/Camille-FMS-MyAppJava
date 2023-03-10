package fr.cam;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import fr.cam.dao.DistributionDao;
import fr.cam.dao.CategoryDao;
import fr.cam.entities.Distribution;
import fr.cam.entities.Category;
import fr.cam.mvc.Controller;
import fr.cam.mvc.Model;
import fr.cam.mvc.View;

/**
 * application that provides information about linux systems
 * uses the Java language
 * uses the SQL queries
 * uses the Swing API
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

	private static void testDistributionDao() {
		for(Distribution a : new DistributionDao().readAll())
			System.out.println(a);		
	}

	private static void testCategoryDao() {
		for(Category c : new CategoryDao().readAll())
			System.out.println(c);		
	}
}