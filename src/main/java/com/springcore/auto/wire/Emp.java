package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("temp")
	
	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		
	}

	public Emp(Address address) {
		super();
		this.address = address;
		
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
