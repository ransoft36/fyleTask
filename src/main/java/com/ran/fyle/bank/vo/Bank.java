/**
 * 
 */
package com.ran.fyle.bank.vo;

import java.io.Serializable;

/**
 * @author Ran
 * 
 * Bank details
 *
 */
public class Bank implements Serializable {

	/**
	 * Default UID
	 */
	private static final long serialVersionUID = 1L;
	
	private Long 	id;	  // Id generated for the bank
	private String	name; // Name of the bank
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
