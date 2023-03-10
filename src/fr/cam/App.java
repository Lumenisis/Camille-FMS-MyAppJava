package fr.cam;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import fr.cam.bdd.ProductDao;
import fr.cam.entities.Product;
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

	private static void testProductDao() {
		for(Product p : new ProductDao().readAll())
		System.out.println(p);		
	}
}