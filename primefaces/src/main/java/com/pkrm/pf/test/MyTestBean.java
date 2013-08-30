/**
 * 
 */
package com.pkrm.pf.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


/**
 * @author Rahul
 *
 */
@ManagedBean(name = "testBean")
@ViewScoped
public class MyTestBean {
	
	private boolean invoiceSelectedState;
	private List<MobileInvoice>selectedInvoices;
	private List<MobileInvoiceDAO> invoices;
	private MobileInvoice singleInvoiceObj;

	/**
	 * 
	 */
	public MyTestBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Constructor");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Inside Init");
		invoices = new ArrayList<MobileInvoiceDAO>();
		invoices.add(new MobileInvoiceDAO("1","Inv1"));
		invoices.add(new MobileInvoiceDAO("2","Inv2"));
		invoices.add(new MobileInvoiceDAO("3","Inv3"));
		invoices.add(new MobileInvoiceDAO("4","Inv4"));
	}
	
	
	public void checkBoxListener(ValueChangeEvent event) {
		 selectedInvoices = new ArrayList<MobileInvoice>();
		MobileInvoiceDAO dao = (MobileInvoiceDAO) event.getComponent().getAttributes().get("invoiceObj");
		  
		 if (dao != null) {
	            if (invoiceSelectedState) {
	                selectedInvoices.add(new MobileInvoice(dao.getId(),dao.getName()));
	            } else {
	                // Your remove logic 
	            }
	        } else {
	            selectedInvoices.clear();
	        }
		
		System.out.println("Values from 'dao' are "+ dao.toString());

		
		
	}
	/**
	 * @return the invoiceSelectedState
	 */
	public boolean isInvoiceSelectedState() {
		return invoiceSelectedState;
	}

	/**
	 * @param invoiceSelectedState the invoiceSelectedState to set
	 */
	public void setInvoiceSelectedState(boolean invoiceSelectedState) {
		this.invoiceSelectedState = invoiceSelectedState;
	}

	public void selectInvoice(MobileInvoice invoice) {

       

    }

	/**
	 * @return the selectedInvoices
	 */
	public List<MobileInvoice> getSelectedInvoices() {
		return selectedInvoices;
	}

	/**
	 * @param selectedInvoices the selectedInvoices to set
	 */
	public void setSelectedInvoices(List<MobileInvoice> selectedInvoices) {
		this.selectedInvoices = selectedInvoices;
	}

	/**
	 * @return the invoices
	 */
	public List<MobileInvoiceDAO> getInvoices() {
		return invoices;
	}

	/**
	 * @param invoices the invoices to set
	 */
	public void setInvoices(List<MobileInvoiceDAO> invoices) {
		this.invoices = invoices;
	}

	/**
	 * @return the singleInvoiceObj
	 */
	public MobileInvoice getSingleInvoiceObj() {
		return singleInvoiceObj;
	}

	/**
	 * @param singleInvoiceObj the singleInvoiceObj to set
	 */
	public void setSingleInvoiceObj(MobileInvoice singleInvoiceObj) {
		this.singleInvoiceObj = singleInvoiceObj;
	}

	
}
