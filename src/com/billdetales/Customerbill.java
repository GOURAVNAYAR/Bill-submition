package com.billdetales;

import com.customer.Customer;

public class Customerbill {
	private Integer customerbillId;
	private Integer customerbillLateamount;
	private Integer customerbillLastdateforsubmit;
	private Integer customerbillSubmittype;
	private Customer c;

	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}

	public Integer getCustomerbillId() {
		return customerbillId;
	}

	public void setCustomerbillId(Integer customerbillId) {
		this.customerbillId = customerbillId;
	}

	public Integer getCustomerbillLateamount() {
		return customerbillLateamount;
	}

	public void setCustomerbillLateamount(Integer customerbillLateamount) {
		this.customerbillLateamount = customerbillLateamount;
	}

	public Integer getCustomerbillLastdateforsubmit() {
		return customerbillLastdateforsubmit;
	}

	public void setCustomerbillLastdateforsubmit(Integer customerbillLastdateforsubmit) {
		this.customerbillLastdateforsubmit = customerbillLastdateforsubmit;
	}

	public Integer getCustomerbillSubmittype() {
		return customerbillSubmittype;
	}

	public void setCustomerbillSubmittype(Integer customerbillSubmittype) {
		this.customerbillSubmittype = customerbillSubmittype;
	}

}
