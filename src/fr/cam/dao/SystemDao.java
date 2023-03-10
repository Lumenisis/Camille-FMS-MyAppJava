package fr.cam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.cam.entities.System;

public class SystemDao implements Dao<System> {

	@Override
	public ArrayList<System> readAll() {
		ArrayList<System> systems = new ArrayList<System>();
		String strSql = "SELECT * FROM T_Articles";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsBrand = resultSet.getString(3);
					double rsPrice = resultSet.getDouble(4);		
					systems.add((new System(rsId,rsDescription,rsBrand,rsPrice)));						
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur l'affichage des articles " + e.getMessage());
		}	
		catch (Exception e) {
			logger.severe("pb : " + e.getMessage());
		}
		return systems;
	}

	@Override
	public boolean create(System obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public System read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(System obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(System obj) {
		// TODO Auto-generated method stub
		return false;
	}
}