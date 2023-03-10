package fr.cam.entities;

public class Distribution {
	private int id;
	private String description;
	private String distname;
	
	public Distribution(int id, String description, String distname) {
		this.id = id;
		this.description = description;
		this.distname = distname;
	}
	
	public Distribution(String description, String distname) {
		this.description = description;
		this.distname = distname;
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
	 * @return the distname
	 */
	public String getDistname() {
		return distname;
	}

	/**
	 * @param distname the distname to set
	 */
	public void setDistname(String distname) {
		this.distname = distname;
	}
}