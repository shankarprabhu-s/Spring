package com.springDemo4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String ename;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> edetails;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getEdetails() {
		return edetails;
	}
	public void setEdetails(Map<String, String> edetails) {
		this.edetails = edetails;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", phones=" + phones + ", addresses=" + addresses + ", edetails=" + edetails
				+ "]";
	}
	
	
}
