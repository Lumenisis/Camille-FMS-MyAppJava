package fr.cam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.cam.entities.Distribution;

public class DistributionDao implements Dao<Distribution> {

	@Override
	public ArrayList<Distribution> readAll() {
		ArrayList<Distribution> distributions = new ArrayList<Distribution>();
		String strSql = "SELECT * FROM T_Distributions";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsDistribution = resultSet.getString(3);		
					distributions.add((new Distribution(rsId,rsDescription,rsDistribution)));						
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur l'affichage des articles " + e.getMessage());
		}	
		catch (Exception e) {
			logger.severe("pb : " + e.getMessage());
		}
		return distributions;
	}

	@Override
	public boolean create(Distribution obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Distribution read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Distribution obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Distribution obj) {
		// TODO Auto-generated method stub
		return false;
	}
}