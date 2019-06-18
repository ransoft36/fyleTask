/**
 * 
 */
package com.ran.fyle.bank.vo;

import java.io.Serializable;

/**
 * @author Ran
 *
 * Branch details of the bank
 */
public class Branch implements Serializable {

	/**
	 * Default UID
	 */
	private static final long serialVersionUID = 1L;
	
	private String 	ifsc;		// Unique IFSC of the branch. Length should be 11
	private Long 	bank_id;	// Bank Id for the branch
	private String 	branch;		// Branch name
	private String 	address;	// Branch address
	private String 	city;		// Branch located city
	private String 	district;	// Branch located district
	private String 	state;		// Branch located state
	
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public Long getBank_id() {
		return bank_id;
	}
	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
