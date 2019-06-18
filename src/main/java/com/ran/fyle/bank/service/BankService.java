/**
 * 
 */
package com.ran.fyle.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ran.fyle.bank.vo.BankBranch;

/**
 * @author Ran
 *
 * Bank service interface having bank related operations
 */
public interface BankService {

	/**
	 * Get method to get the branch details with given IFSC code
	 * 
	 * @param ifsc code
	 * @return Branch details
	 */
	BankBranch getBranchByIfsc(String ifsc);
	
	/**
	 * Get method to get the branches with given bank name and city
	 * 
	 * @param bankname to be filtered
	 * @param city to be filtered
	 * @return List of branches
	 */
	List<BankBranch> getBranchByBankAndCity(String bankname, String city);
	
}
