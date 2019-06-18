/**
 * 
 */
package com.ran.fyle.bank.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ran
 *
 * Bank entity
 */
@Entity
@Table(name = "banks")
public class BankEntity {

	@Id
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
