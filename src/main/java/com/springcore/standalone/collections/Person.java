package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> feesstructure;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeesstructure() {
		return feesstructure;
	}
	public void setFeesstructure(Map<String, Integer> feesstructure) {
		this.feesstructure = feesstructure;
	}
	public Person(List<String> friends, Map<String, Integer> feesstructure) {
		super();
		this.friends = friends;
		this.feesstructure = feesstructure;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesstructure=" + feesstructure + "]";
	} 

	

}
