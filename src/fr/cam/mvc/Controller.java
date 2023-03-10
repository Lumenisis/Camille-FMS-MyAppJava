package fr.cam.mvc;

import fr.cam.mvc.Model;
import fr.cam.mvc.View;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		initController();
	}

	private void initController() {
		
	}
}