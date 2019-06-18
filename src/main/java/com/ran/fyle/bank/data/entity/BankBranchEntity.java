/**
 * 
 */
package com.ran.fyle.bank.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

/**
 * @author Ran
 * 
 * Entity for the bank branch
 */
@Entity
@Table(name = "bank_branches")
public class BankBranchEntity {

	@Id
	private String 	ifsc;		// Unique IFSC of the branch. Length should be 11
	
	@Column(name = "bank_id")
	private Long 	bankId;	// Bank Id for the branch
	
	@Column(name = "bank_name")
	private String	bankName;	// Bank name
	
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
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
