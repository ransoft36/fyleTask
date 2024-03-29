/**
 * 
 */
package com.ran.fyle.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ran.fyle.bank.data.BankBranchRepository;
import com.ran.fyle.bank.data.entity.BankBranchEntity;
import com.ran.fyle.bank.vo.BankBranch;

/**
 * @author Ran
 *
 * Implementation of the bank operations
 */
@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankBranchRepository bankBranchRepository;

	@Override
	public BankBranch getBranchByIfsc(String ifsc) {
		List<BankBranchEntity> bankBranchEntityList = bankBranchRepository.findByIfsc(ifsc);
		return getBankBranch((bankBranchEntityList != null && !bankBranchEntityList.isEmpty()) ? bankBranchEntityList.get(0) : null);
	}

	@Override
	public List<BankBranch> getBranchByBankAndCity(String bankname, String city) {
		List<BankBranchEntity> branchList = bankBranchRepository.findByBankNameAndCity(bankname, city);
		if(branchList == null) {
			return null;
		}
		List<BankBranch> branches = new ArrayList<BankBranch>();
		for(BankBranchEntity entity : branchList) {
			if(entity != null) {
				branches.add(getBankBranch(entity));
			}
		}
		return branches;
	}
	
	private BankBranch getBankBranch(BankBranchEntity bankBranchEntity) {
		if(bankBranchEntity == null) {
			return null;
		}
		BankBranch bankBranch = new BankBranch();
		bankBranch.setIfsc(bankBranchEntity.getIfsc());
		bankBranch.setBank_id(bankBranchEntity.getBankId());
		bankBranch.setBank_name(bankBranchEntity.getBankName());
		bankBranch.setAddress(bankBranchEntity.getAddress());
		bankBranch.setBranch(bankBranchEntity.getBranch());
		bankBranch.setCity(bankBranchEntity.getCity());
		bankBranch.setDistrict(bankBranchEntity.getDistrict());
		bankBranch.setState(bankBranchEntity.getState());
		return bankBranch;
	}

}
