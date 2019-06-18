/**
 * 
 */
package com.ran.fyle.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ran.fyle.bank.service.BankService;
import com.ran.fyle.bank.vo.BankBranch;

/**
 * @author Ran
 *
 * Rest controller which handles the bank related operations.
 */
@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private BankService bankService;

	/**
	 * Get method to get the branch details with given IFSC code
	 * 
	 * @param ifsc code
	 * @return Branch details
	 */
	@GetMapping("/branch/{ifsc}")
	public ResponseEntity<BankBranch> getBranchByIfsc(@PathVariable String ifsc) {
		
		if(ifsc == null || (ifsc != null && ifsc.isEmpty())) {
			return ResponseEntity.badRequest().build();
		}
		
		BankBranch bankBranch = bankService.getBranchByIfsc(ifsc);
		if(bankBranch == null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(bankBranch);
		
	}
	
	/**
	 * Get method to get the branches with given bank name and city
	 * 
	 * @param bankname to be filtered
	 * @param city to be filtered
	 * @return List of branches
	 */
	@GetMapping("/branch")
	public ResponseEntity<List<BankBranch>> getBranchByBankAndCity(@RequestParam String bankname, 
			@RequestParam String city) {
		
		if(bankname == null || city == null 
				|| (bankname != null && bankname.isEmpty())
				|| (city != null && city.isEmpty())) {
			return ResponseEntity.badRequest().build();
		}

		List<BankBranch> branches = bankService.getBranchByBankAndCity(bankname, city);
		if(branches == null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(branches);
		
	}
	
}
