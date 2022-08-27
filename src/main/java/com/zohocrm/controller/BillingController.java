package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billingService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenerateBillPage(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getOneContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
		
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model) {
		billingService.saveBill(bill);
		
		List<Billing> billings = billingService.listBillings();
		model.addAttribute("billings", billings);
	
		return "search_billing_result";
		
	}
	
	@RequestMapping("/listallbill")
	public String listallbill(ModelMap model) {
		List<Billing> billings = billingService.listBillings();
		model.addAttribute("billings", billings);
	
		return "search_billing_result";
		
		
		
	}
	@RequestMapping("/billingInfo")
	public String billingInfo(@RequestParam("id") long id, ModelMap model) {
		
		Billing billing = billingService.getOneBillingById(id);
		model.addAttribute("billing", billing);
		return "billing_info";
		
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") long id, ModelMap model) {
		billingService.deleteById(id);
		List<Billing> billings = billingService.listBillings();
		model.addAttribute("billings", billings);
	
		return "search_billing_result";
		
		
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") long id, ModelMap model) {
		Billing billing = billingService.updateOneBill(id);
		model.addAttribute("billing", billing);
		return "update_billing";
		
	}
	
	@RequestMapping("/updatebill")
	public String updateLead(Billing bill, ModelMap model) {
		Billing billing = new Billing();
		
		billing.setId(bill.getId());
		billing.setFirstName(bill.getFirstName());
		billing.setLastName(bill.getLastName());
		billing.setEmail(bill.getEmail());
		billing.setMobile(bill.getMobile());
		billing.setProduct(bill.getProduct());
		billing.setAmount(bill.getAmount());
		
		billingService.saveBill(billing);
		
		
		List<Billing> billings = billingService.listBillings();
		model.addAttribute("billings", billings);
	
		return "search_billing_result";
		
	}
	
}
