package com.pkrm.pf.test;

public class MobileInvoice {

	private String name;
	private String id;
	
	public MobileInvoice() {
		// TODO Auto-generated constructor stub
	}

	public MobileInvoice(String name, String id) {
		super();
		this.name = name;
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

	
}
