package fr.cam.entities;

public class Category {
	private int id;
	private String description;
	private String catname;

	public Category(int id, String description, String catname) {
		this.id = id;
		this.description = description;
		this.catname = catname;
	}

	public Category(String description, String catname) {
		this.description = description;
		this.catname = catname;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the catname
	 */
	public String getCatname() {
		return catname;
	}

	/**
	 * @param catname the catname to set
	 */
	public void setCatname(String catname) {
		this.catname = catname;
	}
}