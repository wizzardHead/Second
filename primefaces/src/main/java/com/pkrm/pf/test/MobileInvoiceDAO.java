/**
 * 
 */
package com.pkrm.pf.test;

/**
 * @author Rahul
 *
 * A sample DAO  for the values in the Data Table 
 */
public class MobileInvoiceDAO {

	private String id;
	private String name;

	/**
	 * 
	 */
	public MobileInvoiceDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public MobileInvoiceDAO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MobileInvoiceDAO [id=" + id + ", name=" + name + "]";
	}
	
	

	
}
