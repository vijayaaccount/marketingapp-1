package com.zohocrm.services;



import java.util.List;

import com.zohocrm.entities.Billing;

public interface BillingService {

	public void saveBill(Billing bill);

	public List<Billing> listBillings();

	public  Billing getOneBillingById(long id);

	public void deleteById(long id);

	public Billing updateOneBill(long id);


;
}



	