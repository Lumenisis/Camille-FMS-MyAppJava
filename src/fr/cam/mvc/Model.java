package fr.cam.mvc;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import fr.cam.dao.DistributionDao;
import fr.cam.entities.Distribution;

public class Model extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private DistributionDao distributionDao;
	private String[] columnName = new String[] {"ID","DESCRIPTION","NAME"};
	private Vector<String[]> rows = new Vector<String[]>();		

	public Model() {		
		distributionDao = new DistributionDao();		
	}

	@Override
	public int getRowCount() {
		return rows.size();
	}

	@Override
	public int getColumnCount() {
		return columnName.length;
	}

	@Override
	public String getColumnName(int column) {
		return columnName[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {		
		return rows.elementAt(rowIndex)[columnIndex];
	}

	public void loadData() {
		List<Distribution> list = distributionDao.readAll();
		if(rows != null) rows.clear();
		for(Distribution d : list) {
			rows.add(new String[] {
					String.valueOf(d.getId()), d.getDescription(), d.getDistname()
			});
		}		
	}

	public boolean addDistribution(Distribution d) {
		return distributionDao.create(d);
	}
}