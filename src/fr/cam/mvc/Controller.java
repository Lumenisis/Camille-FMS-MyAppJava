package fr.cam.mvc;

import fr.cam.entities.Distribution;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		initController();
	}
	
	public void initController(){
		view.initTable(model);
		view.getOk().addActionListener(e -> actionChangeHMI());
		view.getAdd().addActionListener(e -> actionAddDistribution());
	}
	
	private void actionAddDistribution() {
		Distribution distribution = view.getDistribution();
		model.addDistribution(distribution);
		actionChangeHMI();
		view.setProduct();
	}
	
	private void actionChangeHMI() {
		try {
			model.loadData();
			model.fireTableChanged(null);
		}
		catch(Exception e) {
			View.warning(" Oups il y a eu un pb : " + e.getMessage());
		}
	}
}