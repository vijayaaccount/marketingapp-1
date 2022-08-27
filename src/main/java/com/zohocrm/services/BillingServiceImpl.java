package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	
	@Override
	public void saveBill(Billing bill) {
     billingRepo.save(bill);
		
	}


	@Override
	public List<Billing> listBillings() {
		List<Billing> billings = billingRepo.findAll();
		return billings;
	}


	@Override
	public Billing getOneBillingById(long id) {
	Optional<Billing> findById = billingRepo.findById(id);
	Billing billing = findById.get();
	return billing;
		
	}


	@Override
	public void deleteById(long id) {
	billingRepo.deleteById(id);
		
	}


	@Override
	public Billing updateOneBill(long id) {
	Optional<Billing> findById = billingRepo.findById(id);
	Billing billing = findById.get();
		return billing;
	}


	
}
