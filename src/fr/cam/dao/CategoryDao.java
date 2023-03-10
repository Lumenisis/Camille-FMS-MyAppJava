package fr.cam.dao;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.cam.entities.Category;

public class CategoryDao implements Dao<Category>{
	
	@Override
	public ArrayList<Category> readAll() {
		ArrayList<Category> categories = new ArrayList<Category>();
		String strSql = "SELECT * FROM T_Categories";		
		try(Statement statement = connection.createStatement()){
			try(ResultSet resultSet = statement.executeQuery(strSql)){ 			
				while(resultSet.next()) {
					int rsId = resultSet.getInt(1);	
					String rsDescription = resultSet.getString(2);
					String rsCategory = resultSet.getString(3);		
					categories.add((new Category(rsId,rsDescription,rsCategory)));						
				}	
			}
		} catch (SQLException e) {
			logger.severe("pb sql sur l'affichage des articles " + e.getMessage());
		}	
		catch (Exception e) {
			logger.severe("pb : " + e.getMessage());
		}
		return categories;
	}

	@Override
	public boolean create(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}
}