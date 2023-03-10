package fr.cam.bdd;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * @author Camille - 2023
 *
 */

public interface Dao<T> {
	public Connection connection = BddConnection.getConnection();
	public boolean create(T obj);
	public T read(int id);
	public boolean update(T obj);
	public boolean delete(T obj);
	public ArrayList<T> readAll();
}