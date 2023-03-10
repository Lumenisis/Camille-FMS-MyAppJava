package fr.cam.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Logger;

import fr.cam.dao.Dao;

/**
 * @author Camille - 2023
 *
 */

public interface Dao<T> {
	public Connection connection = BddConnection.getConnection();
	public static final Logger logger = Logger.getLogger(Dao.class.getName());
	public boolean create(T obj);
	public T read(int id);
	public boolean update(T obj);
	public boolean delete(T obj);
	public ArrayList<T> readAll();
}