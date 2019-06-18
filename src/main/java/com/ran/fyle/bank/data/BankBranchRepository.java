/**
 * 
 */
package com.ran.fyle.bank.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ran.fyle.bank.data.entity.BankBranchEntity;

/**
 * @author Ran
 *
 * Respository to execute the bank data queries
 */
@Repository
public interface BankBranchRepository extends JpaRepository<BankBranchEntity, String> {

	/**
	 * Get the branches with given bank name and city
	 * 
	 * @param bankname to be filtered
	 * @param city to be filtered
	 * @return List of branches
	 */
	List<BankBranchEntity> findByBankNameAndCity(String bankName, String city);
	
}
